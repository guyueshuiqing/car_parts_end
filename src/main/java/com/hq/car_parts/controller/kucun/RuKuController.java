package com.hq.car_parts.controller.kucun;

import com.hq.car_parts.common.CommonResult;
import com.hq.car_parts.entity.caigou.ShouHuo;
import com.hq.car_parts.entity.caigou.TuiHuo;
import com.hq.car_parts.entity.kucun.ChuKu;
import com.hq.car_parts.entity.kucun.KuCun;
import com.hq.car_parts.entity.kucun.RuKu;
import com.hq.car_parts.entity.kucun.RuKuSelect;
import com.hq.car_parts.service.caigou.ShouHuoService;
import com.hq.car_parts.service.caigou.TuiHuoService;
import com.hq.car_parts.service.kucun.KuCunService;
import com.hq.car_parts.service.kucun.RuKuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ruku")
public class RuKuController {

    @Autowired
    private ShouHuoService shouHuoService;

    @Autowired
    private RuKuService ruKuService;

    @Autowired
    private KuCunService kuCunService;

    @RequestMapping(value = "/insertRuKu", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult insertRuKu(@RequestBody Map<String, String> map) {
        String username = map.get("aidutStaff");
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        String dateString = formatter.format(currentTime);
        map.put("ruKuNum","RK"+username+dateString);
        map.put("createDate",System.currentTimeMillis()+"");
        map.put("status","passing");

        ruKuService.insertRuKu(new RuKu(map));
        shouHuoService.updateShouHuoStatus(new ShouHuo(map.get("shouHuoNum"),"recycle"));
        return CommonResult.success(null,"新建申购单成功！");
    }

    @RequestMapping(value = "/getAllRuKu", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getRuKu() {
        List<RuKu> data = ruKuService.findAllRuKu();
        return CommonResult.success(data,"获取数据成功！");
    }


    @RequestMapping(value = "/getOwnRuKu/{username}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getOwnRuKu(@PathVariable String username) {
        List<RuKu> data = ruKuService.getOwnRuKu(username);
        return CommonResult.success(data,"获取数据成功！");
    }

    @RequestMapping(value = "/getFilterRuKu", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getFilterRuKu(@RequestBody Map<String,String> map) {
        RuKuSelect reqs = new RuKuSelect(map);
        List<RuKu> data = ruKuService.getFilterRuKu(reqs);
        return CommonResult.success(data,"获取数据成功！");
    }

    @RequestMapping(value = "/updateRuKuStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateRuKuStatus(@RequestBody Map<String,String> map) {
        ruKuService.updateRuKuStatus(new RuKu(map.get("ruKuNum"),"passed"));
        String goodsName = map.get("goodsName");
        String username =map.get("username");
        KuCun kuCunByName = kuCunService.getKuCunByName(goodsName);
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        String dateString = formatter.format(currentTime);
        map.put("kuCunNum","KC"+username+dateString);
//        chuKuService.updateChuKuStatus(new ChuKu(map.get("chuKuNum"),"passed"));
        if(null == kuCunByName){
            kuCunService.insertKuCun(new KuCun(map));
            return CommonResult.success(null,"获取数据成功！");
        } else {
            int goodsNum = Integer.valueOf(map.get("goodsNum")) + Integer.valueOf(kuCunByName.getGoodsNum());
            float sumPrice = Float.valueOf(map.get("sumPrice")) + Float.valueOf(kuCunByName.getSumPrice());
            kuCunService.updateNewKuCun(new KuCun(kuCunByName.getKuCunNum(),goodsNum,sumPrice));
            return CommonResult.success(null,"获取数据成功！");
        }

    }


}
