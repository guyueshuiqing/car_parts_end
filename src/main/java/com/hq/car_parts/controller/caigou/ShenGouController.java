package com.hq.car_parts.controller.caigou;

import com.hq.car_parts.common.CommonResult;
import com.hq.car_parts.common.CookieUtils;
import com.hq.car_parts.entity.caigou.ShenGou;
import com.hq.car_parts.entity.caigou.ShenGouSelect;
import com.hq.car_parts.service.caigou.ShenGouService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/purchase")
public class ShenGouController {

    @Autowired
    private ShenGouService shenGouService;

    @RequestMapping(value = "/insertShenGou", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult insertShenGou(@RequestBody Map<String, String> map) {
        String username = map.get("applyStaff");
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        String dateString = formatter.format(currentTime);
        map.put("purchaseNum","SG"+username+dateString);
        map.put("createDate",System.currentTimeMillis()+"");
        map.put("status","create");
        shenGouService.insertShenGou(new ShenGou(map));
        return CommonResult.success(null,"新建申购单成功！");
    }

    @RequestMapping(value = "/getAllShenGou", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getShenGou(HttpServletRequest request) {
        List<ShenGou> data = shenGouService.findAllShenGou();
        return CommonResult.success(data,"获取数据成功！");
    }


    @RequestMapping(value = "/getOwnShenGou/{username}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getOwnShenGou(@PathVariable String username) {
        List<ShenGou> data = shenGouService.getOwnShenGou(username);
        return CommonResult.success(data,"获取数据成功！");
    }

    @RequestMapping(value = "/getFilterShenGou", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getFilterShenGou(@RequestBody Map<String,String> map) {
        ShenGouSelect reqs = new ShenGouSelect(map);
        List<ShenGou> data = shenGouService.getFilterShenGou(reqs);
        return CommonResult.success(data,"获取数据成功！");
    }

    @RequestMapping(value = "/updateStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateStatus(@RequestBody Map<String,String> map) {
        String action = map.get("action");
        if("Audit".equals(action)){
            ShenGou shenGou = new ShenGou(map.get("purchaseNum"),"passed",map.get("auditStaff"));
            shenGouService.updateStatus(shenGou);
            return CommonResult.success(null,"获取数据成功！");
        }
        return CommonResult.failed(null,"操作不明确，请写明操作action！");
    }


    @RequestMapping(value = "/updateShenGou", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateShenGou(@RequestBody Map<String,String> map) {
        shenGouService.updateShenGou(new ShenGou(map));
        return CommonResult.success(null,"操作成功！");
    }


    @RequestMapping(value = "/deleteShenGou/{purchaseNum}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult deleteShenGou(@PathVariable String purchaseNum) {
        shenGouService.deleteShenGouByNum(purchaseNum);
        return CommonResult.success(null,"操作成功！");
    }

}
