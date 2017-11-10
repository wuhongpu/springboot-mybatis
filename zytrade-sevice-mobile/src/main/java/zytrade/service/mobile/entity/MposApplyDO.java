package zytrade.service.mobile.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MposApplyDO {
    private String orgmcode;

    private Long userid;

    private String sonmcode;

    private Short postype;

    private String legalname;

    private String idcard;

    private String contactperson;

    private String iphone;

    private String bankcard;

    private String openingbank;

    private String branchesbankcode;

    private String cardholder;

    private String username;

    private String tmname;

    private String licensecode;

    private String licensecodevalid;

    private String bregaddr;

    private Short bregpcode;

    private Short bregccode;

    private String businessaddress;

    private Short businesspcode;

    private Short businessccode;

    private String reqcode;

    private String reqmsg;

    private Short status;

    private Long channelid;

    private Short businesstype;

    private BigDecimal feerate;

    private BigDecimal wechafeerate;

    private BigDecimal alipayfeerate;

    private BigDecimal d0fjrate;

    private Date creatdate;

    private Date updatedate;

    private Long clearcycle;

    private BigDecimal clearfee;

    private Short bbankprovince;

    private Short bbankcity;

    public String getOrgmcode() {
        return orgmcode;
    }

    public void setOrgmcode(String orgmcode) {
        this.orgmcode = orgmcode == null ? null : orgmcode.trim();
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getSonmcode() {
        return sonmcode;
    }

    public void setSonmcode(String sonmcode) {
        this.sonmcode = sonmcode == null ? null : sonmcode.trim();
    }

    public Short getPostype() {
        return postype;
    }

    public void setPostype(Short postype) {
        this.postype = postype;
    }

    public String getLegalname() {
        return legalname;
    }

    public void setLegalname(String legalname) {
        this.legalname = legalname == null ? null : legalname.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson == null ? null : contactperson.trim();
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone == null ? null : iphone.trim();
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard == null ? null : bankcard.trim();
    }

    public String getOpeningbank() {
        return openingbank;
    }

    public void setOpeningbank(String openingbank) {
        this.openingbank = openingbank == null ? null : openingbank.trim();
    }

    public String getBranchesbankcode() {
        return branchesbankcode;
    }

    public void setBranchesbankcode(String branchesbankcode) {
        this.branchesbankcode = branchesbankcode == null ? null : branchesbankcode.trim();
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder == null ? null : cardholder.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTmname() {
        return tmname;
    }

    public void setTmname(String tmname) {
        this.tmname = tmname == null ? null : tmname.trim();
    }

    public String getLicensecode() {
        return licensecode;
    }

    public void setLicensecode(String licensecode) {
        this.licensecode = licensecode == null ? null : licensecode.trim();
    }

    public String getLicensecodevalid() {
        return licensecodevalid;
    }

    public void setLicensecodevalid(String licensecodevalid) {
        this.licensecodevalid = licensecodevalid == null ? null : licensecodevalid.trim();
    }

    public String getBregaddr() {
        return bregaddr;
    }

    public void setBregaddr(String bregaddr) {
        this.bregaddr = bregaddr == null ? null : bregaddr.trim();
    }

    public Short getBregpcode() {
        return bregpcode;
    }

    public void setBregpcode(Short bregpcode) {
        this.bregpcode = bregpcode;
    }

    public Short getBregccode() {
        return bregccode;
    }

    public void setBregccode(Short bregccode) {
        this.bregccode = bregccode;
    }

    public String getBusinessaddress() {
        return businessaddress;
    }

    public void setBusinessaddress(String businessaddress) {
        this.businessaddress = businessaddress == null ? null : businessaddress.trim();
    }

    public Short getBusinesspcode() {
        return businesspcode;
    }

    public void setBusinesspcode(Short businesspcode) {
        this.businesspcode = businesspcode;
    }

    public Short getBusinessccode() {
        return businessccode;
    }

    public void setBusinessccode(Short businessccode) {
        this.businessccode = businessccode;
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

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long getChannelid() {
        return channelid;
    }

    public void setChannelid(Long channelid) {
        this.channelid = channelid;
    }

    public Short getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(Short businesstype) {
        this.businesstype = businesstype;
    }

    public BigDecimal getFeerate() {
        return feerate;
    }

    public void setFeerate(BigDecimal feerate) {
        this.feerate = feerate;
    }

    public BigDecimal getWechafeerate() {
        return wechafeerate;
    }

    public void setWechafeerate(BigDecimal wechafeerate) {
        this.wechafeerate = wechafeerate;
    }

    public BigDecimal getAlipayfeerate() {
        return alipayfeerate;
    }

    public void setAlipayfeerate(BigDecimal alipayfeerate) {
        this.alipayfeerate = alipayfeerate;
    }

    public BigDecimal getD0fjrate() {
        return d0fjrate;
    }

    public void setD0fjrate(BigDecimal d0fjrate) {
        this.d0fjrate = d0fjrate;
    }

    public Date getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(Date creatdate) {
        this.creatdate = creatdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Long getClearcycle() {
        return clearcycle;
    }

    public void setClearcycle(Long clearcycle) {
        this.clearcycle = clearcycle;
    }

    public BigDecimal getClearfee() {
        return clearfee;
    }

    public void setClearfee(BigDecimal clearfee) {
        this.clearfee = clearfee;
    }

    public Short getBbankprovince() {
        return bbankprovince;
    }

    public void setBbankprovince(Short bbankprovince) {
        this.bbankprovince = bbankprovince;
    }

    public Short getBbankcity() {
        return bbankcity;
    }

    public void setBbankcity(Short bbankcity) {
        this.bbankcity = bbankcity;
    }
}