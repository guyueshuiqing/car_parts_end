package com.hq.car_parts.entity.kucun;

import java.util.Map;

public class ChuKuSelect {
    private String chuKuNum;
    private String goodsName;
    private String aidutStaff;
    private String createDateStart;
    private String createDateEnd;

    public ChuKuSelect() {
    }

    public ChuKuSelect(Map<String,String> map) {
        if (map.get("aidutStaff") != null){
            this.aidutStaff = map.get("aidutStaff");
        }
        if (map.get("chuKuNum") != null){
            this.chuKuNum = map.get("chuKuNum");
        }
        if (map.get("goodsName") != null){
            this.goodsName = map.get("goodsName");
        }
        if (map.get("createDateStart") != null){
            this.createDateStart = map.get("createDateStart");
            this.createDateEnd =  map.get("createDateEnd");
        }
    }

    public String getChuKuNum() {
        return chuKuNum;
    }

    public void setChuKuNum(String chuKuNum) {
        this.chuKuNum = chuKuNum;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getAidutStaff() {
        return aidutStaff;
    }

    public void setAidutStaff(String aidutStaff) {
        this.aidutStaff = aidutStaff;
    }

    public String getCreateDateStart() {
        return createDateStart;
    }

    public void setCreateDateStart(String createDateStart) {
        this.createDateStart = createDateStart;
    }

    public String getCreateDateEnd() {
        return createDateEnd;
    }

    public void setCreateDateEnd(String createDateEnd) {
        this.createDateEnd = createDateEnd;
    }
}
