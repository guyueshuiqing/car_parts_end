package com.hq.car_parts.entity.caigou;

import java.io.Serializable;
import java.util.Map;

public class TuiHuo implements Serializable {
    private String tuiHuoNum;
    private String applyStaff;
    private String supplier;
    private String auditStaff;
    private String goodsName;
    private String goodsUnit;
    private Integer goodsNum;
    private Float unitPrice;
    private Float sumPrice;
    private String reason;
    private String createDate;
    private String status;

    public TuiHuo() {
    }

    public TuiHuo(String tuiHuoNum, String status) {
        this.tuiHuoNum = tuiHuoNum;
        this.status = status;
    }

    public TuiHuo(Map<String,String> map) {
        this.tuiHuoNum = map.get("tuiHuoNum");
        this.applyStaff = map.get("applyStaff");
        this.supplier = map.get("supplier");
        this.goodsName = map.get("goodsName");
        this.goodsUnit = map.get("goodsUnit");
        this.goodsNum = Integer.valueOf(map.get("goodsNum"));
        this.unitPrice = Float.valueOf(map.get("unitPrice"));
        this.sumPrice = Float.valueOf(map.get("sumPrice"));
        this.createDate = map.get("createDate");
        this.reason = map.get("reason");
        this.status = map.get("status");
    }



    public TuiHuo(String tuiHuoNum, String applyStaff, String supplier, String auditStaff, String goodsName, String goodsUnit, Integer goodsNum, Float unitPrice, Float sumPrice, String reason, String createDate, String status) {
        this.tuiHuoNum = tuiHuoNum;
        this.applyStaff = applyStaff;
        this.supplier = supplier;
        this.auditStaff = auditStaff;
        this.goodsName = goodsName;
        this.goodsUnit = goodsUnit;
        this.goodsNum = goodsNum;
        this.unitPrice = unitPrice;
        this.sumPrice = sumPrice;
        this.reason = reason;
        this.createDate = createDate;
        this.status = status;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
