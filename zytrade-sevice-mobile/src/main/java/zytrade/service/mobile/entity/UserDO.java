package zytrade.service.mobile.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserDO {
    private Long id;

    private String loginname;

    private String bankcard;

    private String identitycard;

    private String nickname;

    private String password;

    private String email;

    private Short roletype;

    private Long terminaltypeid;

    private Date regdate;

    private Short active;

    private String headerurl;

    private Short clienttype;

    private String openingbank;

    private Short deleted;

    private Long roleid;

    private String branchesbank;

    private Short bbankprovince;

    private Short bbankcity;

    private Long puserid;

    private String cardholder;

    private Long organizationid;

    private String paypassword;

    private String activationcode;

    private String branchesbankcode;

    private Short bankstatus;

    private String riskdescription;

    private String accbankcode;

    private BigDecimal feerate;

    private BigDecimal clearrate;

    private BigDecimal ownbrokeragerate;

    private BigDecimal clearfee;

    private BigDecimal fdmaxfee;

    private BigDecimal fdminfee;

    private Long channelid;

    private BigDecimal cashrate;

    private BigDecimal fdfeerate;

    private Date updatetime;

    private Long updateouid;

    private Short machinetype;

    private String uuid;

    private String clearmac;

    private Short clearstatus;

    private String description;

    private Short crasht1type;

    private Short speedcash;

    private Long cardpid;

    private Short chargectype;

    private Short isopensma;

    private String ulayer;

    private Short smagrade;

    private BigDecimal smfeerate;

    private Long smchannelid;

    private BigDecimal smfjfeerate;

    private Short regtype;

    private Long soncnt;

    private String shopnickname;

    private Long spuserid;

    private String shopid;

    private Long debitcnt;

    private Long creditcnt;

    private BigDecimal alipayfeerate;

    private BigDecimal quickfeerate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard == null ? null : bankcard.trim();
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard == null ? null : identitycard.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Short getRoletype() {
        return roletype;
    }

    public void setRoletype(Short roletype) {
        this.roletype = roletype;
    }

    public Long getTerminaltypeid() {
        return terminaltypeid;
    }

    public void setTerminaltypeid(Long terminaltypeid) {
        this.terminaltypeid = terminaltypeid;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public String getHeaderurl() {
        return headerurl;
    }

    public void setHeaderurl(String headerurl) {
        this.headerurl = headerurl == null ? null : headerurl.trim();
    }

    public Short getClienttype() {
        return clienttype;
    }

    public void setClienttype(Short clienttype) {
        this.clienttype = clienttype;
    }

    public String getOpeningbank() {
        return openingbank;
    }

    public void setOpeningbank(String openingbank) {
        this.openingbank = openingbank == null ? null : openingbank.trim();
    }

    public Short getDeleted() {
        return deleted;
    }

    public void setDeleted(Short deleted) {
        this.deleted = deleted;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getBranchesbank() {
        return branchesbank;
    }

    public void setBranchesbank(String branchesbank) {
        this.branchesbank = branchesbank == null ? null : branchesbank.trim();
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

    public Long getPuserid() {
        return puserid;
    }

    public void setPuserid(Long puserid) {
        this.puserid = puserid;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder == null ? null : cardholder.trim();
    }

    public Long getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(Long organizationid) {
        this.organizationid = organizationid;
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword == null ? null : paypassword.trim();
    }

    public String getActivationcode() {
        return activationcode;
    }

    public void setActivationcode(String activationcode) {
        this.activationcode = activationcode == null ? null : activationcode.trim();
    }

    public String getBranchesbankcode() {
        return branchesbankcode;
    }

    public void setBranchesbankcode(String branchesbankcode) {
        this.branchesbankcode = branchesbankcode == null ? null : branchesbankcode.trim();
    }

    public Short getBankstatus() {
        return bankstatus;
    }

    public void setBankstatus(Short bankstatus) {
        this.bankstatus = bankstatus;
    }

    public String getRiskdescription() {
        return riskdescription;
    }

    public void setRiskdescription(String riskdescription) {
        this.riskdescription = riskdescription == null ? null : riskdescription.trim();
    }

    public String getAccbankcode() {
        return accbankcode;
    }

    public void setAccbankcode(String accbankcode) {
        this.accbankcode = accbankcode == null ? null : accbankcode.trim();
    }

    public BigDecimal getFeerate() {
        return feerate;
    }

    public void setFeerate(BigDecimal feerate) {
        this.feerate = feerate;
    }

    public BigDecimal getClearrate() {
        return clearrate;
    }

    public void setClearrate(BigDecimal clearrate) {
        this.clearrate = clearrate;
    }

    public BigDecimal getOwnbrokeragerate() {
        return ownbrokeragerate;
    }

    public void setOwnbrokeragerate(BigDecimal ownbrokeragerate) {
        this.ownbrokeragerate = ownbrokeragerate;
    }

    public BigDecimal getClearfee() {
        return clearfee;
    }

    public void setClearfee(BigDecimal clearfee) {
        this.clearfee = clearfee;
    }

    public BigDecimal getFdmaxfee() {
        return fdmaxfee;
    }

    public void setFdmaxfee(BigDecimal fdmaxfee) {
        this.fdmaxfee = fdmaxfee;
    }

    public BigDecimal getFdminfee() {
        return fdminfee;
    }

    public void setFdminfee(BigDecimal fdminfee) {
        this.fdminfee = fdminfee;
    }

    public Long getChannelid() {
        return channelid;
    }

    public void setChannelid(Long channelid) {
        this.channelid = channelid;
    }

    public BigDecimal getCashrate() {
        return cashrate;
    }

    public void setCashrate(BigDecimal cashrate) {
        this.cashrate = cashrate;
    }

    public BigDecimal getFdfeerate() {
        return fdfeerate;
    }

    public void setFdfeerate(BigDecimal fdfeerate) {
        this.fdfeerate = fdfeerate;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Long getUpdateouid() {
        return updateouid;
    }

    public void setUpdateouid(Long updateouid) {
        this.updateouid = updateouid;
    }

    public Short getMachinetype() {
        return machinetype;
    }

    public void setMachinetype(Short machinetype) {
        this.machinetype = machinetype;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getClearmac() {
        return clearmac;
    }

    public void setClearmac(String clearmac) {
        this.clearmac = clearmac == null ? null : clearmac.trim();
    }

    public Short getClearstatus() {
        return clearstatus;
    }

    public void setClearstatus(Short clearstatus) {
        this.clearstatus = clearstatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Short getCrasht1type() {
        return crasht1type;
    }

    public void setCrasht1type(Short crasht1type) {
        this.crasht1type = crasht1type;
    }

    public Short getSpeedcash() {
        return speedcash;
    }

    public void setSpeedcash(Short speedcash) {
        this.speedcash = speedcash;
    }

    public Long getCardpid() {
        return cardpid;
    }

    public void setCardpid(Long cardpid) {
        this.cardpid = cardpid;
    }

    public Short getChargectype() {
        return chargectype;
    }

    public void setChargectype(Short chargectype) {
        this.chargectype = chargectype;
    }

    public Short getIsopensma() {
        return isopensma;
    }

    public void setIsopensma(Short isopensma) {
        this.isopensma = isopensma;
    }

    public String getUlayer() {
        return ulayer;
    }

    public void setUlayer(String ulayer) {
        this.ulayer = ulayer == null ? null : ulayer.trim();
    }

    public Short getSmagrade() {
        return smagrade;
    }

    public void setSmagrade(Short smagrade) {
        this.smagrade = smagrade;
    }

    public BigDecimal getSmfeerate() {
        return smfeerate;
    }

    public void setSmfeerate(BigDecimal smfeerate) {
        this.smfeerate = smfeerate;
    }

    public Long getSmchannelid() {
        return smchannelid;
    }

    public void setSmchannelid(Long smchannelid) {
        this.smchannelid = smchannelid;
    }

    public BigDecimal getSmfjfeerate() {
        return smfjfeerate;
    }

    public void setSmfjfeerate(BigDecimal smfjfeerate) {
        this.smfjfeerate = smfjfeerate;
    }

    public Short getRegtype() {
        return regtype;
    }

    public void setRegtype(Short regtype) {
        this.regtype = regtype;
    }

    public Long getSoncnt() {
        return soncnt;
    }

    public void setSoncnt(Long soncnt) {
        this.soncnt = soncnt;
    }

    public String getShopnickname() {
        return shopnickname;
    }

    public void setShopnickname(String shopnickname) {
        this.shopnickname = shopnickname == null ? null : shopnickname.trim();
    }

    public Long getSpuserid() {
        return spuserid;
    }

    public void setSpuserid(Long spuserid) {
        this.spuserid = spuserid;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public Long getDebitcnt() {
        return debitcnt;
    }

    public void setDebitcnt(Long debitcnt) {
        this.debitcnt = debitcnt;
    }

    public Long getCreditcnt() {
        return creditcnt;
    }

    public void setCreditcnt(Long creditcnt) {
        this.creditcnt = creditcnt;
    }

    public BigDecimal getAlipayfeerate() {
        return alipayfeerate;
    }

    public void setAlipayfeerate(BigDecimal alipayfeerate) {
        this.alipayfeerate = alipayfeerate;
    }

    public BigDecimal getQuickfeerate() {
        return quickfeerate;
    }

    public void setQuickfeerate(BigDecimal quickfeerate) {
        this.quickfeerate = quickfeerate;
    }
}