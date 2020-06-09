package com.hq.car_parts.entity.caigou;

import java.util.Map;

public class ShenGouSelect {

    private String purchaseNum;
    private String applyStaff;
    private String goodsName;
    private String createDateStart;
    private String createDateEnd;
    private String purchaseDateStart;
    private String purchaseDateEnd;

    public ShenGouSelect(Map<String,String> map) {
            if (map.get("applyStaff") != null){
                this.applyStaff = map.get("applyStaff");
            }
            if (map.get("purchaseNum") != null){
                this.purchaseNum = map.get("purchaseNum");
            }
            if (map.get("goodsName") != null){
                this.goodsName = map.get("goodsName");
            }
            if (map.get("createDateStart") != null){
                this.createDateStart = map.get("createDateStart");
                this.createDateEnd =  map.get("createDateEnd");
            }
            if (map.get("purchaseDateStart") != null){
                this.purchaseDateStart = map.get("purchaseDateStart");
                this.purchaseDateEnd =  map.get("purchaseDateEnd");
            }
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

    public String getPurchaseDateStart() {
        return purchaseDateStart;
    }

    public void setPurchaseDateStart(String purchaseDateStart) {
        this.purchaseDateStart = purchaseDateStart;
    }

    public String getPurchaseDateEnd() {
        return purchaseDateEnd;
    }

    public void setPurchaseDateEnd(String purchaseDateEnd) {
        this.purchaseDateEnd = purchaseDateEnd;
    }
}
