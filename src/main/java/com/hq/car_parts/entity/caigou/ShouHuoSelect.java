package com.hq.car_parts.entity.caigou;

import java.util.Map;

public class ShouHuoSelect {

    private String shouHuoNum;
    private String manager;
    private String goodsName;
    private String deLiveryDateStart;
    private String deLiveryDateEnd;

    public ShouHuoSelect(Map<String,String> map) {
        if (map.get("shouHuoNum") != null){
            this.shouHuoNum = map.get("shouHuoNum");
        }
        if (map.get("manager") != null){
            this.manager = map.get("manager");
        }
        if (map.get("goodsName") != null){
            this.goodsName = map.get("goodsName");
        }
        if (map.get("deLiveryDateStart") != null){
            this.deLiveryDateStart = map.get("deLiveryDateStart");
            this.deLiveryDateEnd =  map.get("deLiveryDateEnd");
        }
    }

    public ShouHuoSelect() {
    }


    public String getShouHuoNum() {
        return shouHuoNum;
    }

    public void setShouHuoNum(String shouHuoNum) {
        this.shouHuoNum = shouHuoNum;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getDeLiveryDateStart() {
        return deLiveryDateStart;
    }

    public void setDeLiveryDateStart(String deLiveryDateStart) {
        this.deLiveryDateStart = deLiveryDateStart;
    }

    public String getDeLiveryDateEnd() {
        return deLiveryDateEnd;
    }

    public void setDeLiveryDateEnd(String deLiveryDateEnd) {
        this.deLiveryDateEnd = deLiveryDateEnd;
    }
}
