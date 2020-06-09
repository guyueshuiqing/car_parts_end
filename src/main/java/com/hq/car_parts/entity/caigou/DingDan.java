package com.hq.car_parts.entity.caigou;

import java.io.Serializable;
import java.util.Map;

public class DingDan implements Serializable {

    private String dingDanNum;
    private String purchaseNum;
    private String supplier;
    private String contractNum;
    private Float sumPrice;
    private Float applyPrice;
    private String payApplyStaff;
    private Float paidPrice;
    private String createDate;
    private String deLiveryDate;
    private String status;
    private String remarks;


    public DingDan(Map<String,String> map) {
        this.dingDanNum = map.get("dingDanNum");
        this.purchaseNum = map.get("purchaseNum");
        this.supplier =map.get("supplier");
        this.sumPrice = Float.valueOf(map.get("sumPrice"));
        this.createDate = map.get("createDate");
        this.status = map.get("status");
    }

    public DingDan(String dingDanNum, String payApplyStaff,String deLiveryDate, String status) {
        this.dingDanNum =dingDanNum;
        this.payApplyStaff = payApplyStaff;
        this.deLiveryDate = deLiveryDate;
        this.status = status;
    }

    public DingDan(String dingDanNum, Float applyPrice,String status) {
        this.dingDanNum =dingDanNum;
        this.applyPrice = applyPrice;
        this.status = status;
    }

    public DingDan(String dingDanNum, String status) {
        this.dingDanNum =dingDanNum;
        this.status = status;
    }

    public DingDan(String dingDanNum, String purchaseNum, String supplier, String contractNum, Float sumPrice, Float applyPrice, String payApplyStaff, Float paidPrice, String createDate, String deLiveryDate, String status, String remarks) {
        this.dingDanNum = dingDanNum;
        this.purchaseNum = purchaseNum;
        this.supplier = supplier;
        this.contractNum = contractNum;
        this.sumPrice = sumPrice;
        this.applyPrice = applyPrice;
        this.payApplyStaff = payApplyStaff;
        this.paidPrice = paidPrice;
        this.createDate = createDate;
        this.deLiveryDate = deLiveryDate;
        this.status = status;
        this.remarks = remarks;
    }

    public String getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(String purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public String getPayApplyStaff() {
        return payApplyStaff;
    }

    public void setPayApplyStaff(String payApplyStaff) {
        this.payApplyStaff = payApplyStaff;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
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

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    public Float getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Float sumPrice) {
        this.sumPrice = sumPrice;
    }

    public Float getApplyPrice() {
        return applyPrice;
    }

    public void setApplyPrice(Float applyPrice) {
        this.applyPrice = applyPrice;
    }

    public Float getPaidPrice() {
        return paidPrice;
    }

    public void setPaidPrice(Float paidPrice) {
        this.paidPrice = paidPrice;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "DingDan{" +
                "dingDanNum='" + dingDanNum + '\'' +
                ", supplier='" + supplier + '\'' +
                ", contractNum='" + contractNum + '\'' +
                ", sumPrice=" + sumPrice +
                ", applyPrice=" + applyPrice +
                ", paidPrice=" + paidPrice +
                ", createDate='" + createDate + '\'' +
                ", deLiveryDate='" + deLiveryDate + '\'' +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
