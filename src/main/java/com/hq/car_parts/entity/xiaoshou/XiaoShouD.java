package com.hq.car_parts.entity.xiaoshou;

import java.io.Serializable;
import java.util.Map;

public class XiaoShouD implements Serializable {
    private String dNum;
    private String client;
    private String goodsName;
    private String goodsUnit;
    private Integer goodsNum;
    private Float unitPrice;
    private Float sumPrice;
    private String createDate;
    private String deLiveryDate;
    private String status;

    public XiaoShouD() {
    }

    public XiaoShouD(String dNum, String status) {
        this.dNum = dNum;
        this.status = status;
    }

    public XiaoShouD(Map<String,String> map) {
        this.dNum = map.get("dNum");
        this.client =map.get("client");
        this.goodsName = map.get("goodsName");
        this.goodsUnit = map.get("goodsUnit");
        this.goodsNum = Integer.valueOf(map.get("goodsNum"));
        this.unitPrice = Float.valueOf(map.get("unitPrice"));
        this.sumPrice = Float.valueOf(map.get("sumPrice"));
        this.createDate = map.get("createDate");
        this.deLiveryDate = map.get("deLiveryDate");
        this.status = map.get("status");
    }

    public XiaoShouD(String dNum, String client, String goodsName, String goodsUnit, Integer goodsNum, Float unitPrice, Float sumPrice, String createDate, String deLiveryDate, String status) {
        this.dNum = dNum;
        this.client = client;
        this.goodsName = goodsName;
        this.goodsUnit = goodsUnit;
        this.goodsNum = goodsNum;
        this.unitPrice = unitPrice;
        this.sumPrice = sumPrice;
        this.createDate = createDate;
        this.deLiveryDate = deLiveryDate;
        this.status = status;
    }

    public String getdNum() {
        return dNum;
    }

    public void setdNum(String dNum) {
        this.dNum = dNum;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
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

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getDeLiveryDate() {
        return deLiveryDate;
    }

    public void setDeLiveryDate(String deLiveryDate) {
        this.deLiveryDate = deLiveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
