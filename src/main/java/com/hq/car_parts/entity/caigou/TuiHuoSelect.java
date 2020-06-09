package com.hq.car_parts.entity.caigou;

import java.io.Serializable;
import java.util.Map;

public class TuiHuoSelect implements Serializable {
    private String tuiHuoNum;
    private String applyStaff;
    private String goodsName;
    private String deLiveryDateStart;
    private String deLiveryDateEnd;

    public TuiHuoSelect() {
    }

    public TuiHuoSelect(Map<String,String> map) {
        if (map.get("tuiHuoNum") != null){
            this.tuiHuoNum = map.get("tuiHuoNum");
        }
        if (map.get("applyStaff") != null){
            this.applyStaff = map.get("applyStaff");
        }
        if (map.get("goodsName") != null){
            this.goodsName = map.get("goodsName");
        }
        if (map.get("deLiveryDateStart") != null){
            this.deLiveryDateStart = map.get("deLiveryDateStart");
            this.deLiveryDateEnd =  map.get("deLiveryDateEnd");
        }
    }

    public TuiHuoSelect(String tuiHuoNum, String applyStaff, String goodsName, String deLiveryDateStart, String deLiveryDateEnd) {
        this.tuiHuoNum = tuiHuoNum;
        this.applyStaff = applyStaff;
        this.goodsName = goodsName;
        this.deLiveryDateStart = deLiveryDateStart;
        this.deLiveryDateEnd = deLiveryDateEnd;
    }

    public String getTuiHuoNum() {
        return tuiHuoNum;
    }

    public void setTuiHuoNum(String tuiHuoNum) {
        this.tuiHuoNum = tuiHuoNum;
    }

    public String getApplyStaff() {
        return applyStaff;
    }

    public void setApplyStaff(String applyStaff) {
        this.applyStaff = applyStaff;
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
