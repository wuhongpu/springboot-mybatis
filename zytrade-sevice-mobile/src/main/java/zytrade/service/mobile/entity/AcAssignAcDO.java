package zytrade.service.mobile.entity;

import java.math.BigDecimal;

public class AcAssignAcDO {
    private Long assignid;

    private String acides;

    private Long orgid;

    private BigDecimal feerate;

    private BigDecimal fdmaxmoney;

    private BigDecimal fdminmoney;

    private BigDecimal fdfeerate;

    private BigDecimal cashrate;

    public Long getAssignid() {
        return assignid;
    }

    public void setAssignid(Long assignid) {
        this.assignid = assignid;
    }

    public String getAcides() {
        return acides;
    }

    public void setAcides(String acides) {
        this.acides = acides == null ? null : acides.trim();
    }

    public Long getOrgid() {
        return orgid;
    }

    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }

    public BigDecimal getFeerate() {
        return feerate;
    }

    public void setFeerate(BigDecimal feerate) {
        this.feerate = feerate;
    }

    public BigDecimal getFdmaxmoney() {
        return fdmaxmoney;
    }

    public void setFdmaxmoney(BigDecimal fdmaxmoney) {
        this.fdmaxmoney = fdmaxmoney;
    }

    public BigDecimal getFdminmoney() {
        return fdminmoney;
    }

    public void setFdminmoney(BigDecimal fdminmoney) {
        this.fdminmoney = fdminmoney;
    }

    public BigDecimal getFdfeerate() {
        return fdfeerate;
    }

    public void setFdfeerate(BigDecimal fdfeerate) {
        this.fdfeerate = fdfeerate;
    }

    public BigDecimal getCashrate() {
        return cashrate;
    }

    public void setCashrate(BigDecimal cashrate) {
        this.cashrate = cashrate;
    }
}