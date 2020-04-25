package com.hq.car_parts.entity;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Role implements Serializable {
    private Integer id;
    private String role;
    private Integer auth;

    public Role(){}

    public Role(Integer id, String role, Integer auth) {
        this.id = id;
        this.role = role;
        this.auth = auth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getAuth() {
        return auth;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;
    }
}
