package com.jiuhua.user.entity;

/**
 * 用户类 所有属性名全部小写
 * 
 * @author yangq
 */
public class User {
    private int    id;      // 主键
    private String username; // 账户名称
    private String realname; // 真实姓名
    private String idcard;  // 身份证号
    private String password; // 密码
    private String mobinum; // 手机号码
    private String isverify; // 手机号码真实性验证状态，0未验证/1已验证
    private String email;   // 电子邮件
    private String safecode; // 密码找回使用的密保问题
    private String identify; // 账户权限标识，0普通用户/1VIP用户/2管理员
    private String status;  // 账户生命状态，0禁止使用/1正常使用

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobinum() {
        return mobinum;
    }

    public void setMobinum(String mobinum) {
        this.mobinum = mobinum;
    }

    public String getIsverify() {
        return isverify;
    }

    public void setIsverify(String isverify) {
        this.isverify = isverify;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSafecode() {
        return safecode;
    }

    public void setSafecode(String safecode) {
        this.safecode = safecode;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
