package com.hq.car_parts.controller.kucun;

import com.hq.car_parts.common.CommonResult;
import com.hq.car_parts.entity.caigou.DingDan;
import com.hq.car_parts.entity.caigou.ShenGou;
import com.hq.car_parts.entity.caigou.TuiHuo;
import com.hq.car_parts.entity.kucun.ChuKu;
import com.hq.car_parts.entity.kucun.ChuKuSelect;
import com.hq.car_parts.entity.kucun.KuCun;
import com.hq.car_parts.entity.xiaoshou.XiaoShouD;
import com.hq.car_parts.service.caigou.TuiHuoService;
import com.hq.car_parts.service.kucun.ChuKuService;
import com.hq.car_parts.service.kucun.KuCunService;
import com.hq.car_parts.service.xiaoshou.XDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/chuku")
public class ChuKuController {

    @Autowired
    private TuiHuoService tuiHuoService;

    @Autowired
    private ChuKuService chuKuService;

    @Autowired
    private KuCunService kuCunService;

    @Autowired
    private XDService xdService;

    @RequestMapping(value = "/insertChuKu", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult insertChuKu(@RequestBody Map<String, String> map) {
        String action = map.get("action");
        String username = map.get("aidutStaff");
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        String dateString = formatter.format(currentTime);
        map.put("chuKuNum","CK"+username+dateString);
        map.put("createDate",System.currentTimeMillis()+"");
        map.put("status","passing");
        if("xt".equals(action)){
            chuKuService.insertChuKu(new ChuKu(map));
            xdService.updateXiaoShouDStatus(new XiaoShouD(map.get("dNum"),"recycle"));
        }
        if("chuku".equals(action)){
            chuKuService.insertChuKu(new ChuKu(map));
            tuiHuoService.updateTuiHuoStatus(new TuiHuo(map.get("tuiHuoNum"),"recycle"));
        }

        return CommonResult.success(null,"新建申购单成功！");
    }

    @RequestMapping(value = "/getAllChuKu", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getChuKu() {
        List<ChuKu> data = chuKuService.findAllChuKu();
        return CommonResult.success(data,"获取数据成功！");
    }


    @RequestMapping(value = "/getOwnChuKu/{username}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getOwnChuKu(@PathVariable String username) {
        List<ChuKu> data = chuKuService.getOwnChuKu(username);
        return CommonResult.success(data,"获取数据成功！");
    }

    @RequestMapping(value = "/getFilterChuKu", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getFilterChuKu(@RequestBody Map<String,String> map) {
        ChuKuSelect reqs = new ChuKuSelect();
        List<ChuKu> data = chuKuService.getFilterChuKu(reqs);
        return CommonResult.success(data,"获取数据成功！");
    }

    @RequestMapping(value = "/updateChuKuStatus", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateChuKuStatus(@RequestBody Map<String,String> map) {
//        chuKuService.updateChuKuStatus(new ChuKu(map.get("chuKuNum"),"passed"));
        String goodsName = map.get("goodsName");
        String username =map.get("username");
        KuCun kuCunByName = kuCunService.getKuCunByName(goodsName);

        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        String dateString = formatter.format(currentTime);
        map.put("kuCunNum","KC"+username+dateString);
        chuKuService.updateChuKuStatus(new ChuKu(map.get("chuKuNum"),"passed"));
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
