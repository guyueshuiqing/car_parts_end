package com.hq.car_parts.controller;

import cn.hutool.core.util.ObjectUtil;
import com.hq.car_parts.common.CommonResult;
import com.hq.car_parts.entity.User;
import com.hq.car_parts.entity.caigou.DingDan;
import com.hq.car_parts.entity.caigou.ShenGou;
import com.hq.car_parts.entity.caigou.ShouHuo;
import com.hq.car_parts.entity.caigou.TuiHuo;
import com.hq.car_parts.service.caigou.DingDanService;
import com.hq.car_parts.service.caigou.ShenGouService;
import com.hq.car_parts.service.caigou.ShouHuoService;
import com.hq.car_parts.service.caigou.TuiHuoService;
import com.hq.car_parts.service.kucun.ChuKuService;
import com.hq.car_parts.service.kucun.KuCunService;
import com.hq.car_parts.service.kucun.RuKuService;
import com.hq.car_parts.service.xiaoshou.XDService;
import com.hq.car_parts.service.xiaoshou.XTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private DingDanService dingDanService;
    @Autowired
    private ShenGouService shenGouService;
    @Autowired
    private ShouHuoService shouHuoService;
    @Autowired
    private TuiHuoService tuiHuoService;

    @Autowired
    private ChuKuService chuKuService;
    @Autowired
    private KuCunService kuCunService;
    @Autowired
    private RuKuService ruKuService;

    @Autowired
    private XDService xdService;
    @Autowired
    private XTService xtService;

    @RequestMapping(value = "/getAllData", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getAllData(@RequestBody Map<String, String> map) {
        String name = map.get("username");
        List<DingDan> ownSort = dingDanService.getOwnSort(name);
        List<ShenGou> ownSort1 = shenGouService.getOwnSort(name);
        List<ShouHuo> ownSort2 = shouHuoService.getOwnSort(name);
        List<TuiHuo> ownSort3 = tuiHuoService.getOwnSort(name);

        System.out.println("size"+ownSort1.size());

        List<Object> minList = new ArrayList<>();
        List<Object> maxList = new ArrayList<>();
        if(ownSort != null && ownSort.size() >0 ){
            maxList.add(ownSort.get(0));
            minList.add(ownSort.get(ownSort.size()-1));
        }

        if(ownSort1 != null && ownSort1.size() > 0 ){
            System.out.println("size"+ownSort1.size());
            maxList.add(ownSort1.get(0));
            minList.add(ownSort1.get((ownSort1.size()-1)));
        }

        if(ownSort2 != null  && ownSort2.size() > 0 ){
            maxList.add(ownSort2.get(0));
            minList.add(ownSort2.get(ownSort2.size()-1));
        }

        if(ownSort3 != null && ownSort3.size() > 0){
            maxList.add(ownSort3.get(0));
            minList.add(ownSort3.get(ownSort3.size()-1));
        }

        Map<String, List<Object>> rep = new HashMap<>();
        rep.put("min",minList);
        rep.put("max",maxList);
        return CommonResult.success(rep,"注册成功！");
    }

    @RequestMapping(value = "/getMax", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getMax(@RequestBody Map<String, String> map) {

        return CommonResult.success(null,"注册成功！");
    }

}
