package com.hq.car_parts.entity.kucun;

import java.util.Map;

public class RuKuSelect {
    private String ruKuNum;
    private String supplier;
    private String goodsName;
    private String createDateStart;
    private String createDateEnd;


    public RuKuSelect(Map<String,String> map) {
        if (map.get("supplier") != null){
            this.supplier = map.get("supplier");
        }
        if (map.get("ruKuNum") != null){
            this.ruKuNum = map.get("ruKuNum");
        }
        if (map.get("goodsName") != null){
            this.goodsName = map.get("goodsName");
        }
        if (map.get("createDateStart") != null){
            this.createDateStart = map.get("createDateStart");
            this.createDateEnd =  map.get("createDateEnd");
        }
    }

}
