package com.hq.car_parts.controller.caigou;

import com.hq.car_parts.common.CommonResult;
import com.hq.car_parts.entity.caigou.DingDan;
import com.hq.car_parts.entity.caigou.ShouHuo;
import com.hq.car_parts.entity.caigou.ShenGou;
import com.hq.car_parts.entity.caigou.ShouHuoSelect;
import com.hq.car_parts.service.caigou.DingDanService;
import com.hq.car_parts.service.caigou.ShouHuoService;
import com.hq.car_parts.service.caigou.ShenGouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/shouhuo")
public class ShouHuoController {

    @Autowired
    private ShouHuoService shouHuoService;

    @Autowired
    private ShenGouService shenGouService;

    @Autowired
    private DingDanService dingDanService;

    @RequestMapping(value = "/insertShouHuo", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult insertShouHuo(@RequestBody Map<String, String> map) {
        String username = map.get("applyStaff");
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        String dateString = formatter.format(currentTime);
        map.put("shouHuoNum","SH"+username+dateString);
        map.put("createDate",System.currentTimeMillis()+"");
        String purchaseNum = map.get("purchaseNum");
        ShenGou shenGou = shenGouService.getShenGouByNum(purchaseNum);
        map.put("goodsName",shenGou.getGoodsName());
        map.put("goodsNum",String.valueOf(shenGou.getGoodsNum()));
        map.put("goodsUnit",shenGou.getGoodsUnit());
        map.put("unitPrice",String.valueOf(shenGou.getUnitPrice()));
        map.put("sumPrice",String.valueOf(shenGou.getSumPrice()));
        map.put("status","create");
        ShouHuo shouHuo = new ShouHuo(map);
        shouHuoService.insertShouHuo(new ShouHuo(map));
        dingDanService.updateDingDanStatus(new DingDan(map.get("dingDanNum"),"recycle"));
        return CommonResult.success(null,"新建申购单成功！");
    }

    @RequestMapping(value = "/getAllShouHuo", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getShouHuo() {
        List<ShouHuo> data = shouHuoService.findAllShouHuo();
        return CommonResult.success(data,"获取数据成功！");
    }


    @RequestMapping(value = "/getOwnShouHuo/{username}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getOwnShouHuo(@PathVariable String username) {
        List<ShouHuo> data = shouHuoService.getOwnShouHuo(username);
        return CommonResult.success(data,"获取数据成功！");
    }

    @RequestMapping(value = "/getFilterShouHuo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getFilterShouHuo(@RequestBody Map<String,String> map) {
        System.out.println(map.get("createDateStart"));
        ShouHuoSelect reqs = new ShouHuoSelect(map);
        List<ShouHuo> data = shouHuoService.getFilterShouHuo(reqs);
        return CommonResult.success(data,"获取数据成功！");
    }


    @RequestMapping(value = "/updateShouHuo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateShouHuo(@RequestBody Map<String,String> map) {
        shouHuoService.updateShouHuo(new ShouHuo(map));
        return CommonResult.success(null,"操作成功");
    }


    @RequestMapping(value = "/deleteShouHuo/{dingDanNum}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult deleteShouHuo(@PathVariable String dingDanNum) {
        shouHuoService.deleteShouHuoByNum(dingDanNum);
        return CommonResult.success(null,"操作成功！");
    }

}
