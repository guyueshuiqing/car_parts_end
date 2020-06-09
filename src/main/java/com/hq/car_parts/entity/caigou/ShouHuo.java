package com.hq.car_parts.entity.caigou;

import java.io.Serializable;
import java.util.Map;

public class ShouHuo implements Serializable {

    private String shouHuoNum;
    private String dingDanNum;
    private String supplier;
    private String manager;
    private String goodsName;
    private String goodsUnit;
    private Integer goodsNum;
    private Float unitPrice;
    private Float sumPrice;
    private String deLiveryDate;
    private String status;

    public ShouHuo(Map<String,String> map) {
        this.shouHuoNum = map.get("shouHuoNum");
        this.dingDanNum = map.get("dingDanNum");
        this.manager = map.get("applyStaff");
        this.supplier =map.get("supplier");
        this.goodsName = map.get("goodsName");
        this.goodsUnit = map.get("goodsUnit");
        this.goodsNum = Integer.valueOf(map.get("goodsNum"));
        this.unitPrice = Float.valueOf(map.get("unitPrice"));
        this.sumPrice = Float.valueOf(map.get("sumPrice"));
        this.deLiveryDate = map.get("deLiveryDate");
        this.status = map.get("status");
    }

    public ShouHuo(String shouHuoNum, String dingDanNum,String manager, String supplier, String goodsName, String goodsUnit, Integer goodsNum, Float unitPrice, Float sumPrice, String deLiveryDate,String status) {
        this.shouHuoNum = shouHuoNum;
        this.dingDanNum = dingDanNum;
        this.manager = manager;
        this.supplier = supplier;
        this.goodsName = goodsName;
        this.goodsUnit = goodsUnit;
        this.goodsNum = goodsNum;
        this.unitPrice = unitPrice;
        this.sumPrice = sumPrice;
        this.deLiveryDate = deLiveryDate;
        this.status = status;
    }

    public ShouHuo() {
    }

    public ShouHuo(String shouHuoNum,String status) {
        this.shouHuoNum =shouHuoNum;
        this.status =status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getShouHuoNum() {
        return shouHuoNum;
    }

    public void setShouHuoNum(String shouHuoNum) {
        this.shouHuoNum = shouHuoNum;
    }

    public String getDingDanNum() {
        return dingDanNum;
    }

    public void setDingDanNum(String dingDanNum) {
        this.dingDanNum = dingDanNum;
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

    public String getDeLiveryDate() {
        return deLiveryDate;
    }

    public void setDeLiveryDate(String deLiveryDate) {
        this.deLiveryDate = deLiveryDate;
    }

    @Override
    public String toString() {
        return "ShouHuo{" +
                "shouHuoNum='" + shouHuoNum + '\'' +
                ", dingDanNum='" + dingDanNum + '\'' +
                ", supplier='" + supplier + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsUnit='" + goodsUnit + '\'' +
                ", goodsNum=" + goodsNum +
                ", unitPrice=" + unitPrice +
                ", sumPrice=" + sumPrice +
                ", deLiveryDate='" + deLiveryDate + '\'' +
                '}';
    }
}
