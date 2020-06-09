package com.hq.car_parts.entity.caigou;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ShenGou implements Serializable {

    private String purchaseNum;
    private String applyStaff;
    private String goodsName;
    private String supplier;
    private Integer goodsNum;
    private String goodsUnit;
    private Float unitPrice;
    private Float sumPrice;
    private String createDate;
    private String purchaseDate;
    private String auditStaff;
    private String status;
    private String remarks;

    public ShenGou(Map<String,String> map) {
            this.purchaseNum = map.get("purchaseNum");
            this.applyStaff = map.get("applyStaff");
            this.goodsName = map.get("goodsName");
            this.supplier =map.get("supplier");
            this.goodsNum = Integer.valueOf(map.get("goodsNum"));
            this.goodsUnit = map.get("goodsUnit");
            this.unitPrice = Float.valueOf(map.get("unitPrice"));
            this.sumPrice = Float.valueOf(map.get("sumPrice"));
            this.createDate = map.get("createDate");
            this.purchaseDate = map.get("purchaseDate");
//            this.auditStaff = map.get("auditStaff");
            this.status = map.get("status");
            this.remarks = map.get("remarks");

    }

    public ShenGou(String purchaseNum,String status,String auditStaff){
        this.purchaseNum = purchaseNum;
        this.auditStaff = auditStaff;
        this.status = status;
    }

    public ShenGou(String purchaseNum,String status){
        this.purchaseNum = purchaseNum;
        this.status = status;
    }

    public ShenGou(String purchaseNum, String applyStaff, String goodsName,String supplier, Integer goodsNum, String goodsUnit, Float unitPrice, Float sumPrice, String createDate, String purchaseDate,String auditStaff, String status, String remarks) {
        this.purchaseNum = purchaseNum;
        this.applyStaff = applyStaff;
        this.goodsName = goodsName;
        this.supplier = supplier;
        this.goodsNum = goodsNum;
        this.goodsUnit = goodsUnit;
        this.unitPrice = unitPrice;
        this.sumPrice = sumPrice;
        this.createDate = createDate;
        this.purchaseDate = purchaseDate;
        this.auditStaff = auditStaff;
        this.status = status;
        this.remarks = remarks;
    }

    public ShenGou() {
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getAuditStaff() {
        return auditStaff;
    }

    public void setAuditStaff(String auditStaff) {
        this.auditStaff = auditStaff;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public Float getSumPrice() {
        return sumPrice;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public String getStatus() {
        return status;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setSumPrice(Float sumPrice) {
        this.sumPrice = sumPrice;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(String purchaseNum) {
        this.purchaseNum = purchaseNum;
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

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "ShenGou{" +
                "purchaseNum='" + purchaseNum + '\'' +
                ", applyStaff='" + applyStaff + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", supplier='" + supplier + '\'' +
                ", goodsNum=" + goodsNum +
                ", goodsUnit='" + goodsUnit + '\'' +
                ", unitPrice=" + unitPrice +
                ", sumPrice=" + sumPrice +
                ", createDate='" + createDate + '\'' +
                ", purchaseDate='" + purchaseDate + '\'' +
                ", auditStaff='" + auditStaff + '\'' +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
