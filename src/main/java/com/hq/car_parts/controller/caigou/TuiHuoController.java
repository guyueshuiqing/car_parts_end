package com.hq.car_parts.controller.caigou;

import com.hq.car_parts.common.CommonResult;
import com.hq.car_parts.entity.caigou.*;
import com.hq.car_parts.service.caigou.ShouHuoService;
import com.hq.car_parts.service.caigou.TuiHuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/tuihuo")
public class TuiHuoController {

    @Autowired
    private TuiHuoService tuiHuoService;

    @Autowired
    private ShouHuoService shouHuoService;

    @RequestMapping(value = "/insertTuiHuo", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult insertTuiHuo(@RequestBody Map<String, String> map) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        String dateString = formatter.format(currentTime);
        String username = map.get("applyStaff");
        map.put("tuiHuoNum","TH"+username+dateString);
        map.put("createDate",System.currentTimeMillis()+"");
        map.put("status","create");
        System.out.println("shouHuoNum+++"+map.get("shouHuoNum"));
        shouHuoService.updateShouHuoStatus(new ShouHuo(map.get("shouHuoNum"),"recycle"));
        tuiHuoService.insertTuiHuo(new TuiHuo(map));
        return CommonResult.success(null,"新建申购单成功！");
    }

    @RequestMapping(value = "/getAllTuiHuo", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getTuiHuo() {
        List<TuiHuo> data = tuiHuoService.findAllTuiHuo();
        return CommonResult.success(data,"获取数据成功！");
    }


    @RequestMapping(value = "/getOwnTuiHuo/{username}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getOwnTuiHuo(@PathVariable String username) {
        List<TuiHuo> data = tuiHuoService.getOwnTuiHuo(username);
        return CommonResult.success(data,"获取数据成功！");
    }

    @RequestMapping(value = "/getFilterTuiHuo", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getFilterTuiHuo(@RequestBody Map<String,String> map) {
        TuiHuoSelect reqs = new TuiHuoSelect(map);
        List<TuiHuo> data = tuiHuoService.getFilterTuiHuo(reqs);
        return CommonResult.success(data,"获取数据成功！");
    }

    @RequestMapping(value = "/updateTuiHuoStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateTuiHuoStatus(@RequestBody Map<String,String> map) {
        String action = map.get("action");
        if("Audit".equals(action)){
            tuiHuoService.updateTuiHuoStatus(new TuiHuo(map.get("tuiHuoNum"),"passed"));
            return CommonResult.success(null,"获取数据成功！");
        }
        return CommonResult.failed(null,"操作不明确，请写明操作action！");
    }
}
