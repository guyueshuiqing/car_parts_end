package com.hq.car_parts.entity.caigou;

import java.io.Serializable;
import java.util.Map;

public class DingDanSelect implements Serializable {

    private String dingDanNum;
    private String supplier;
    private String createDateStart;
    private String createDateEnd;
    private String deLiveryDateStart;
    private String deLiveryDateEnd;

    public DingDanSelect(Map<String,String> map) {
        if (map.get("dingDanNum") != null){
            this.dingDanNum = map.get("dingDanNum");
        }
        if (map.get("supplier") != null){
            this.supplier = map.get("supplier");
        }
        if (map.get("createDateStart") != null){
            this.createDateStart = map.get("createDateStart");
            this.createDateEnd =  map.get("createDateEnd");
        }
        if (map.get("deLiveryDateStart") != null){
            this.deLiveryDateStart = map.get("deLiveryDateStart");
            this.deLiveryDateEnd =  map.get("deLiveryDateEnd");
        }
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
