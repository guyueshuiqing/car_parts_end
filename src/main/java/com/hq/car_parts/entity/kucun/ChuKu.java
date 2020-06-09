package com.hq.car_parts.entity.kucun;

import java.util.Map;

public class ChuKu {
    private String chuKuNum;
    private String supplier;
    private String goodsName;
    private String goodsUnit;
    private Integer goodsNum;
    private Float unitPrice;
    private Float sumPrice;
    private String aidutStaff;
    private String createDate;
    private String status;

    public ChuKu() {
    }

    public ChuKu(String chuKuNum, String status) {
        this.chuKuNum = chuKuNum;
        this.status = status;
    }

    public ChuKu(Map<String,String> map) {
        this.chuKuNum = map.get("chuKuNum");
        this.aidutStaff = map.get("aidutStaff");
        this.supplier =map.get("supplier");
        this.goodsName = map.get("goodsName");
        this.goodsUnit = map.get("goodsUnit");
        this.goodsNum = Integer.valueOf(map.get("goodsNum"));
        this.unitPrice = Float.valueOf(map.get("unitPrice"));
        this.sumPrice = Float.valueOf(map.get("sumPrice"));
        this.createDate = map.get("createDate");
        this.status = map.get("status");
    }

    public ChuKu(String chuKuNum, String supplier, String goodsName, String goodsUnit, Integer goodsNum, Float unitPrice, Float sumPrice, String aidutStaff, String createDate, String status) {
        this.chuKuNum = chuKuNum;
        this.supplier = supplier;
        this.goodsName = goodsName;
        this.goodsUnit = goodsUnit;
        this.goodsNum = goodsNum;
        this.unitPrice = unitPrice;
        this.sumPrice = sumPrice;
        this.aidutStaff = aidutStaff;
        this.createDate = createDate;
        this.status = status;
    }



    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getChuKuNum() {
        return chuKuNum;
    }

    public void setChuKuNum(String chuKuNum) {
        this.chuKuNum = chuKuNum;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Float getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Float sumPrice) {
        this.sumPrice = sumPrice;
    }

    public String getAidutStaff() {
        return aidutStaff;
    }

    public void setAidutStaff(String aidutStaff) {
        this.aidutStaff = aidutStaff;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
