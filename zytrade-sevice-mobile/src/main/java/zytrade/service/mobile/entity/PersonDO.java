package zytrade.service.mobile.entity;

import java.util.Date;

public class PersonDO {
    private Long id;

    private Long userid;

    private String username;

    private Short sex;

    private String mobile;

    private String phone;

    private String post;

    private Date birthday;

    private String qq;

    private String msn;

    private String province;

    private String city;

    private String blogaddress;

    private Short dpistatus;

    private Long businessrangeid;

    private String businessaddress;

    private Short registerprovince;

    private Short registercity;

    private String registeraddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn == null ? null : msn.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getBlogaddress() {
        return blogaddress;
    }

    public void setBlogaddress(String blogaddress) {
        this.blogaddress = blogaddress == null ? null : blogaddress.trim();
    }

    public Short getDpistatus() {
        return dpistatus;
    }

    public void setDpistatus(Short dpistatus) {
        this.dpistatus = dpistatus;
    }

    public Long getBusinessrangeid() {
        return businessrangeid;
    }

    public void setBusinessrangeid(Long businessrangeid) {
        this.businessrangeid = businessrangeid;
    }

    public String getBusinessaddress() {
        return businessaddress;
    }

    public void setBusinessaddress(String businessaddress) {
        this.businessaddress = businessaddress == null ? null : businessaddress.trim();
    }

    public Short getRegisterprovince() {
        return registerprovince;
    }

    public void setRegisterprovince(Short registerprovince) {
        this.registerprovince = registerprovince;
    }

    public Short getRegistercity() {
        return registercity;
    }

    public void setRegistercity(Short registercity) {
        this.registercity = registercity;
    }

    public String getRegisteraddress() {
        return registeraddress;
    }

    public void setRegisteraddress(String registeraddress) {
        this.registeraddress = registeraddress == null ? null : registeraddress.trim();
    }
}