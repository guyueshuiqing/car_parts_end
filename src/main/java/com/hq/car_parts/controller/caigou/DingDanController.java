package com.hq.car_parts.controller.caigou;

import com.hq.car_parts.common.CommonResult;
import com.hq.car_parts.entity.caigou.DingDan;
import com.hq.car_parts.entity.caigou.DingDanSelect;
import com.hq.car_parts.entity.caigou.ShenGou;
import com.hq.car_parts.service.caigou.DingDanService;
import com.hq.car_parts.service.caigou.ShenGouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/dingdan")
public class DingDanController {
    @Autowired
    private DingDanService dingDanService;

    @Autowired
    private ShenGouService shenGouService;

    @RequestMapping(value = "/insertDingDan", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult insertDingDan(@RequestBody Map<String, String> map) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        String dateString = formatter.format(currentTime);
        String username = map.get("applyStaff");
        map.put("dingDanNum","DD"+username+dateString);
        map.put("createDate",System.currentTimeMillis()+"");
        map.put("status","create");
        ShenGou shenGou = new ShenGou(map.get("purchaseNum"),"recycle");
        shenGouService.updateStatus(shenGou);
        dingDanService.insertDingDan(new DingDan(map));
        return CommonResult.success(null,"新建申购单成功！");
    }

    @RequestMapping(value = "/getAllDingDan", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getDingDan() {
        List<DingDan> data = dingDanService.findAllDingDan();
        return CommonResult.success(data,"获取数据成功！");
    }


    @RequestMapping(value = "/getOwnDingDan/{username}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getOwnDingDan(@PathVariable String username) {
        List<DingDan> data = dingDanService.getOwnDingDan(username);
        return CommonResult.success(data,"获取数据成功！");
    }

    @RequestMapping(value = "/getFilterDingDan", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getFilterDingDan(@RequestBody Map<String,String> map) {
        System.out.println(map.get("createDateStart"));
        DingDanSelect reqs = new DingDanSelect(map);
        List<DingDan> data = dingDanService.getFilterDingDan(reqs);
        return CommonResult.success(data,"获取数据成功！");
    }


    @RequestMapping(value = "/updateDingDan", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateDingDan(@RequestBody Map<String,String> map) {
        dingDanService.updateDingDan(new DingDan(map));
        return CommonResult.success(null,"操作成功");
    }

    @RequestMapping(value = "/updateDingDanDate", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateDingDanDate(@RequestBody Map<String,String> map) {
        dingDanService.updateDingDanDate(new DingDan(map.get("dingDanNum"),map.get("payApplyStaff"),map.get("deLiveryDate"),"deLiveryDate"));
        return CommonResult.success(null,"操作成功");
    }

    @RequestMapping(value = "/updateDingDanPrice", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateDingDanPrice(@RequestBody Map<String,String> map) {
        dingDanService.updateDingDanPrice(new DingDan(map.get("dingDanNum"),Float.parseFloat(map.get("applyPrice")),"passing"));
        return CommonResult.success(null,"操作成功！");
    }

    @RequestMapping(value = "/updateDingDanStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateDingDanStatus(@RequestBody Map<String,String> map) {
        dingDanService.updateDingDanStatus(new DingDan(map.get("dingDanNum"),"passed"));
        return CommonResult.success(null,"操作成功！");
    }



    @RequestMapping(value = "/deleteDingDan/{dingDanNum}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult deleteDingDan(@PathVariable String dingDanNum) {
        dingDanService.deleteDingDanByNum(dingDanNum);
        return CommonResult.success(null,"操作成功！");
    }

}
