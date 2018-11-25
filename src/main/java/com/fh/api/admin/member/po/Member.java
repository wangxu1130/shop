package com.fh.api.admin.member.po;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {

    private static final long serialVersionUID = 3877269434020713554L;

    private Integer id;

    private String  username;

    private String password;

    private String phone;

    private String email;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date regTime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date lastLoginTime;
    private String phoneCode;
    private Integer shengId;
    private Integer shiId;
    private Integer xianId;

    private String areaName;

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public Integer getShengId() {
        return shengId;
    }

    public void setShengId(Integer shengId) {
        this.shengId = shengId;
    }

    public Integer getShiId() {
        return shiId;
    }

    public void setShiId(Integer shiId) {
        this.shiId = shiId;
    }

    public Integer getXianId() {
        return xianId;
    }

    public void setXianId(Integer xianId) {
        this.xianId = xianId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
