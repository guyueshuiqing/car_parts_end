package com.hq.car_parts.controller.xiaoshou;

import com.hq.car_parts.common.CommonResult;
import com.hq.car_parts.entity.xiaoshou.XiaoShouT;
import com.hq.car_parts.service.xiaoshou.XDService;
import com.hq.car_parts.service.xiaoshou.XTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/xiaoshout")
public class TController {
    @Autowired
    private XTService xtService;

    @RequestMapping(value = "/insertXiaoShouT", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult insertXiaoShouT(@RequestBody Map<String, String> map) {
        String username = map.get("aidutStaff");
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        String dateString = formatter.format(currentTime);
        map.put("tNum","XT"+username+dateString);
        map.put("createDate",System.currentTimeMillis()+"");
        map.put("status","passing");

        xtService.insertXiaoShouT(new XiaoShouT(map));
        return CommonResult.success(null,"新建退货单成功！");
    }

    @RequestMapping(value = "/getAllXiaoShouT", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAllXiaoShouT() {
        List<XiaoShouT> data = xtService.findAllXiaoShouT();
        return CommonResult.success(data,"获取数据成功！");
    }


    @RequestMapping(value = "/getOwnXiaoShouT/{username}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getOwnXiaoShouT(@PathVariable String username) {
        List<XiaoShouT> data = xtService.getOwnXiaoShouT(username);
        return CommonResult.success(data,"获取数据成功！");
    }

//    @RequestMapping(value = "/getFilterXiaoShouT", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult getFilterXiaoShouT(@RequestBody Map<String,String> map) {
//        XiaoShouTSelect reqs = new XiaoShouTSelect(map);
//        List<XiaoShouT> data = ruKuService.getFilterXiaoShouT(reqs);
//        return CommonResult.success(data,"获取数据成功！");
//    }

    @RequestMapping(value = "/updateXiaoShouTStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateXiaoShouTStatus(@RequestBody Map<String,String> map) {
        xtService.updateXiaoShouTStatus(new XiaoShouT(map.get("tNum"),"passed"));
        return CommonResult.success(null,"获取数据成功！");
    }


//    @RequestMapping(value = "/updateXiaoShouTBreak", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult updateXiaoShouTBreak(@RequestBody Map<String,String> map) {
//        xtService.updateXiaoShouTBreak(new XiaoShouT(map.get("kuCunNum"),Integer.valueOf(map.get("breakdown"))));
//        return CommonResult.success(null,"获取数据成功！");
//    }
//
//    @RequestMapping(value = "/updateXiaoShouTUnit", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult updateXiaoShouTUnit(@RequestBody Map<String,String> map) {
//        float sum = Float.valueOf(map.get("unitPrice")) * Float.valueOf(map.get("goodsNum"));
//        System.out.println("sum ===  "+sum);
//        xtService.updateXiaoShouTUnit(new XiaoShouT(map.get("kuCunNum"),Float.valueOf(map.get("unitPrice")),sum));
//        return CommonResult.success(null,"获取数据成功！");
//    }
}
