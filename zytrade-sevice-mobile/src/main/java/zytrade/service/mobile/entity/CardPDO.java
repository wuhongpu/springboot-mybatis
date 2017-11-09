package zytrade.service.mobile.entity;

import java.util.Date;

public class CardPDO {
    private Long id;

    private Long userid;

    private Short isclearcard;

    private String username;

    private String openingbank;

    private String bankcard;

    private String track2data;

    private String track3data;

    private Short cardtype;

    private String billdate;

    private String repaydate;

    private String mobile;

    private Date createdate;

    private Date updatedate;

    private String branchesbank;

    private Short bbankprovince;

    private Short bbankcity;

    private String branchesbankcode;

    private String accbankcode;

    private Short status;

    private String idcard;

    private Short ispay;

    private Short isquick;

    private String cvn2;

    private String expiredate;

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

    public Short getIsclearcard() {
        return isclearcard;
    }

    public void setIsclearcard(Short isclearcard) {
        this.isclearcard = isclearcard;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getOpeningbank() {
        return openingbank;
    }

    public void setOpeningbank(String openingbank) {
        this.openingbank = openingbank == null ? null : openingbank.trim();
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard == null ? null : bankcard.trim();
    }

    public String getTrack2data() {
        return track2data;
    }

    public void setTrack2data(String track2data) {
        this.track2data = track2data == null ? null : track2data.trim();
    }

    public String getTrack3data() {
        return track3data;
    }

    public void setTrack3data(String track3data) {
        this.track3data = track3data == null ? null : track3data.trim();
    }

    public Short getCardtype() {
        return cardtype;
    }

    public void setCardtype(Short cardtype) {
        this.cardtype = cardtype;
    }

    public String getBilldate() {
        return billdate;
    }

    public void setBilldate(String billdate) {
        this.billdate = billdate == null ? null : billdate.trim();
    }

    public String getRepaydate() {
        return repaydate;
    }

    public void setRepaydate(String repaydate) {
        this.repaydate = repaydate == null ? null : repaydate.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
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

    public String getBranchesbankcode() {
        return branchesbankcode;
    }

    public void setBranchesbankcode(String branchesbankcode) {
        this.branchesbankcode = branchesbankcode == null ? null : branchesbankcode.trim();
    }

    public String getAccbankcode() {
        return accbankcode;
    }

    public void setAccbankcode(String accbankcode) {
        this.accbankcode = accbankcode == null ? null : accbankcode.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Short getIspay() {
        return ispay;
    }

    public void setIspay(Short ispay) {
        this.ispay = ispay;
    }

    public Short getIsquick() {
        return isquick;
    }

    public void setIsquick(Short isquick) {
        this.isquick = isquick;
    }

    public String getCvn2() {
        return cvn2;
    }

    public void setCvn2(String cvn2) {
        this.cvn2 = cvn2 == null ? null : cvn2.trim();
    }

    public String getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(String expiredate) {
        this.expiredate = expiredate == null ? null : expiredate.trim();
    }
}