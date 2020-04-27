package com.hq.car_parts.entity;


import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 10592
 */
public class User implements Serializable {
    private static final long serialVersionUID = -6059341711098260768L;

    private String id;
    private Integer age;
    private String username;
    private String password;
    private String sex;
    private String realName;
    private String email;
    private Date createTime;
    private Date loginTime;
    private String status;
    private String code;
    private Integer roleId;
    private List<StaffMenu> staffMenus;



    public User() {

    }

    public User(Map<String,String> map) {
        this.username = map.get("username");
        this.password = map.get("password");
        this.email = map.get("email");
        this.realName = map.get("realName");
        this.roleId = 1;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String id, Integer age, String username, String password, String sex, String realName, String email, Date createTime, Date loginTime, String status, String code, Integer roleId) {
        System.out.println("user cons");
        this.id = id;
        this.age = age;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.realName = realName;
        this.email = email;
        this.createTime = createTime;
        this.loginTime = loginTime;
        this.status = status;
        this.code = code;
        this.roleId = roleId;
    }

    public User(String id, Integer age, String username, String password, String sex, String realName, String email, Date createTime, Date loginTime, String status, String code, Integer roleId, List<StaffMenu> staffMenus) {
        System.out.println("user cons");
        this.id = id;
        this.age = age;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.realName = realName;
        this.email = email;
        this.createTime = createTime;
        this.loginTime = loginTime;
        this.status = status;
        this.code = code;
        this.roleId = roleId;
        this.staffMenus = staffMenus;
    }

    //    username,sex,age,real_name,email
    public User(String username,String sex,String realName, String email,Integer roleId, List<StaffMenu> staffMenus) {
        this.username = username;
        this.sex = sex;
        this.age = age;
        this.realName = realName;
        this.email = email;
        this.roleId = roleId;
        this.staffMenus = staffMenus;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public String getRealName() {
        return realName;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public String getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public List<StaffMenu> getStaffMenus() {
        return staffMenus;
    }

    public void setStaffMenus(List<StaffMenu> staffMenus) {
        this.staffMenus = staffMenus;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", realName='" + realName + '\'' +
                ", email='" + email + '\'' +
                ", createTime=" + createTime +
                ", loginTime=" + loginTime +
                ", status='" + status + '\'' +
                ", code='" + code + '\'' +
                ", roleId=" + roleId +
                ", staffMenus=" + staffMenus.toString() +
                '}';
    }
}
