package com.hq.car_parts.controller.kucun;

import com.hq.car_parts.common.CommonResult;
import com.hq.car_parts.entity.caigou.ShouHuo;
import com.hq.car_parts.entity.kucun.KuCun;
import com.hq.car_parts.service.kucun.ChuKuService;
import com.hq.car_parts.service.kucun.KuCunService;
import com.hq.car_parts.service.kucun.KuCunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/kucun")
public class KuCunController {
    @Autowired
    private ChuKuService chuKuService;
    @Autowired
    private KuCunService ruKuService;

    @Autowired
    private KuCunService kuCunService;

    @RequestMapping(value = "/insertKuCun", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult insertKuCun(@RequestBody Map<String, String> map) {
        String username = map.get("aidutStaff");
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        String dateString = formatter.format(currentTime);
        map.put("ruKuNum","RK"+username+dateString);
        map.put("createDate",System.currentTimeMillis()+"");
        map.put("status","passing");

        kuCunService.insertKuCun(new KuCun(map));
        return CommonResult.success(null,"新建申购单成功！");
    }

    @RequestMapping(value = "/getAllKuCun", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAllKuCun() {
        List<KuCun> data = kuCunService.findAllKuCun();
        return CommonResult.success(data,"获取数据成功！");
    }


    @RequestMapping(value = "/getOwnKuCun/{username}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getOwnKuCun(@PathVariable String username) {
        List<KuCun> data = kuCunService.getOwnKuCun(username);
        return CommonResult.success(data,"获取数据成功！");
    }

//    @RequestMapping(value = "/getFilterKuCun", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult getFilterKuCun(@RequestBody Map<String,String> map) {
//        KuCunSelect reqs = new KuCunSelect(map);
//        List<KuCun> data = ruKuService.getFilterKuCun(reqs);
//        return CommonResult.success(data,"获取数据成功！");
//    }

    @RequestMapping(value = "/updateKuCunStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateKuCunStatus(@RequestBody Map<String,String> map) {
//        ruKuService.updateKuCunStatus(new KuCun(map.get("ruKuNum"),"passed"));
        return CommonResult.success(null,"获取数据成功！");
    }


    @RequestMapping(value = "/updateKuCunBreak", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateKuCunBreak(@RequestBody Map<String,String> map) {
        kuCunService.updateKuCunBreak(new KuCun(map.get("kuCunNum"),Integer.valueOf(map.get("breakdown"))));
        return CommonResult.success(null,"获取数据成功！");
    }

    @RequestMapping(value = "/updateKuCunUnit", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateKuCunUnit(@RequestBody Map<String,String> map) {
        float sum = Float.valueOf(map.get("unitPrice")) * Float.valueOf(map.get("goodsNum"));
        System.out.println("sum ===  "+sum);
        kuCunService.updateKuCunUnit(new KuCun(map.get("kuCunNum"),Float.valueOf(map.get("unitPrice")),sum));
        return CommonResult.success(null,"获取数据成功！");
    }
}
