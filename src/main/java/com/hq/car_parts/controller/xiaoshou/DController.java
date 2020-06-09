package com.hq.car_parts.controller.xiaoshou;

import com.hq.car_parts.common.CommonResult;
import com.hq.car_parts.entity.xiaoshou.XiaoShouD;
import com.hq.car_parts.service.xiaoshou.XDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Controller
@RequestMapping("/xiaoshoud")
public class DController {

    @Autowired
    private XDService xdService;

    @RequestMapping(value = "/insertXiaoShouD", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult insertXiaoShouD(@RequestBody Map<String, String> map) {
        String username = map.get("applyStaff");
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        String dateString = formatter.format(currentTime);
        map.put("dNum","XD"+username+dateString);
        map.put("createDate",System.currentTimeMillis()+"");
        map.put("status","create");

        xdService.insertXiaoShouD(new XiaoShouD(map));
        return CommonResult.success(null,"新建申购单成功！");
    }

    @RequestMapping(value = "/getAllXiaoShouD", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAllXiaoShouD() {
        List<XiaoShouD> data = xdService.findAllXiaoShouD();
        return CommonResult.success(data,"获取数据成功！");
    }


    @RequestMapping(value = "/getOwnXiaoShouD/{username}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getOwnXiaoShouD(@PathVariable String username) {
        List<XiaoShouD> data = xdService.getOwnXiaoShouD(username);
        return CommonResult.success(data,"获取数据成功！");
    }

//    @RequestMapping(value = "/getFilterXiaoShouD", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult getFilterXiaoShouD(@RequestBody Map<String,String> map) {
//        XiaoShouDSelect reqs = new XiaoShouDSelect(map);
//        List<XiaoShouD> data = ruKuService.getFilterXiaoShouD(reqs);
//        return CommonResult.success(data,"获取数据成功！");
//    }

    @RequestMapping(value = "/updateXiaoShouDStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateXiaoShouDStatus(@RequestBody Map<String,String> map) {
        xdService.updateXiaoShouDStatus(new XiaoShouD(map.get("dNum"),"passed"));
        return CommonResult.success(null,"获取数据成功！");
    }


//    @RequestMapping(value = "/updateXiaoShouDBreak", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult updateXiaoShouDBreak(@RequestBody Map<String,String> map) {
//        xdService.updateXiaoShouDBreak(new XiaoShouD(map.get("kuCunNum"),Integer.valueOf(map.get("breakdown"))));
//        return CommonResult.success(null,"获取数据成功！");
//    }
//
//    @RequestMapping(value = "/updateXiaoShouDUnit", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult updateXiaoShouDUnit(@RequestBody Map<String,String> map) {
//        float sum = Float.valueOf(map.get("unitPrice")) * Float.valueOf(map.get("goodsNum"));
//        System.out.println("sum ===  "+sum);
//        xdService.updateXiaoShouDUnit(new XiaoShouD(map.get("kuCunNum"),Float.valueOf(map.get("unitPrice")),sum));
//        return CommonResult.success(null,"获取数据成功！");
//    }

}
