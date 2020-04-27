package com.hq.car_parts.entity;

import java.io.Serializable;

public class StaffMenu implements Serializable {
    private Integer id;
    private String limitName;

    public StaffMenu() {

    }

    public StaffMenu(Integer id, String limitName) {
        this.id = id;
        this.limitName = limitName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLimitName() {
        return limitName;
    }

    public void setLimitName(String limitName) {
        this.limitName = limitName;
    }

    @Override
    public String toString() {
        return "StaffMenu{" +
                "id=" + id +
                ", limitName='" + limitName + '\'' +
                '}';
    }
}
