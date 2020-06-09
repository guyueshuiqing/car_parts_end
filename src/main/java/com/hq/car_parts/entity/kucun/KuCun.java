package com.hq.car_parts.entity.kucun;

import java.util.Map;

public class KuCun {
    private String kuCunNum;
    private String supplier;
    private String goodsName;
    private String goodsUnit;
    private Integer goodsNum;
    private Float unitPrice;
    private Float sumPrice;
    private Integer breakdown;
    private String status;

    public KuCun() {
    }

    public KuCun(String kuCunNum, Float unitPrice,Float sumPrice) {
        this.kuCunNum = kuCunNum;
        this.unitPrice = unitPrice;
        this.sumPrice = sumPrice;
    }

    public KuCun(String kuCunNum, Integer breakdown) {
        this.kuCunNum = kuCunNum;
        this.breakdown = breakdown;

    }

    public KuCun(String kunCunNum, Integer goodsNum, Float sumPrice) {
        this.kuCunNum = kunCunNum;
        this.goodsNum = goodsNum;
        this.sumPrice = sumPrice;
    }

    public KuCun(Map<String,String> map) {
        this.kuCunNum = map.get("kuCunNum");
        this.supplier =map.get("supplier");
        this.goodsName = map.get("goodsName");
        this.goodsUnit = map.get("goodsUnit");
        this.goodsNum = Integer.valueOf(map.get("goodsNum"));
        this.unitPrice = Float.valueOf(map.get("unitPrice"));
        this.sumPrice = Float.valueOf(map.get("sumPrice"));
        this.status = map.get("status");
    }

    public KuCun(String kuCunNum, String supplier, String goodsName, String goodsUnit, Integer goodsNum, Float unitPrice, Float sumPrice, Integer breakdown, String status) {
        this.kuCunNum = kuCunNum;
        this.supplier = supplier;
        this.goodsName = goodsName;
        this.goodsUnit = goodsUnit;
        this.goodsNum = goodsNum;
        this.unitPrice = unitPrice;
        this.sumPrice = sumPrice;
        this.breakdown = breakdown;
        this.status = status;
    }

    public String getKuCunNum() {
        return kuCunNum;
    }

    public void setKuCunNum(String kuCunNum) {
        this.kuCunNum = kuCunNum;
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

    public Integer getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(Integer breakdown) {
        this.breakdown = breakdown;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

