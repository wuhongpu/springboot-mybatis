package zytrade.service.mobile.entity;

import java.util.Date;

public class DPIDO {
    private Long id;

    private Long userid;

    private String idcard;

    private Short cardtype;

    private Short status;

    private String positivepath;

    private String backpath;

    private Date applydate;

    private Date throughdate;

    private Long verifyuserid;

    private String description;

    private String headpath;

    private Short ishistory;

    private String cardholder;

    private Short type;

    private String creditpath;

    private String bankcard;

    private String mobile;

    private String reqcode;

    private String reqmsg;

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

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Short getCardtype() {
        return cardtype;
    }

    public void setCardtype(Short cardtype) {
        this.cardtype = cardtype;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getPositivepath() {
        return positivepath;
    }

    public void setPositivepath(String positivepath) {
        this.positivepath = positivepath == null ? null : positivepath.trim();
    }

    public String getBackpath() {
        return backpath;
    }

    public void setBackpath(String backpath) {
        this.backpath = backpath == null ? null : backpath.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public Date getThroughdate() {
        return throughdate;
    }

    public void setThroughdate(Date throughdate) {
        this.throughdate = throughdate;
    }

    public Long getVerifyuserid() {
        return verifyuserid;
    }

    public void setVerifyuserid(Long verifyuserid) {
        this.verifyuserid = verifyuserid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getHeadpath() {
        return headpath;
    }

    public void setHeadpath(String headpath) {
        this.headpath = headpath == null ? null : headpath.trim();
    }

    public Short getIshistory() {
        return ishistory;
    }

    public void setIshistory(Short ishistory) {
        this.ishistory = ishistory;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder == null ? null : cardholder.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getCreditpath() {
        return creditpath;
    }

    public void setCreditpath(String creditpath) {
        this.creditpath = creditpath == null ? null : creditpath.trim();
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard == null ? null : bankcard.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getReqcode() {
        return reqcode;
    }

    public void setReqcode(String reqcode) {
        this.reqcode = reqcode == null ? null : reqcode.trim();
    }

    public String getReqmsg() {
        return reqmsg;
    }

    public void setReqmsg(String reqmsg) {
        this.reqmsg = reqmsg == null ? null : reqmsg.trim();
    }
}