package com.hq.car_parts.entity.grant;

public class StaffLimitMenus {
    private Integer id;
    private String staffName;
    private Integer limit;

    public StaffLimitMenus(){

    }

    public StaffLimitMenus(String staffName, Integer limit){
        this.staffName = staffName;
        this.limit = limit;
    }
    public StaffLimitMenus(Integer id,String staffName, Integer limit){
        this.id = id;
        this.staffName = staffName;
        this.limit = limit;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "StaffLimitMenus{" +
                "id=" + id +
                ", staffName='" + staffName + '\'' +
                ", limit=" + limit +
                '}';
    }
}
