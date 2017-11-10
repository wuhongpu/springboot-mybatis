package zytrade.service.mobile.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AcAssignDO {
    private Long id;

    private Long roleid;

    private Long cnt;

    private BigDecimal feerate;

    private Long organizationid;

    private BigDecimal fdmaxmoney;

    private BigDecimal fdminmoney;

    private Date assigntime;

    private Long assignouid;

    private Short type;

    private Short status;

    private Short busstype;

    private BigDecimal fdfeerate;

    private BigDecimal cashrate;

    private Long orgid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Long getCnt() {
        return cnt;
    }

    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    public BigDecimal getFeerate() {
        return feerate;
    }

    public void setFeerate(BigDecimal feerate) {
        this.feerate = feerate;
    }

    public Long getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(Long organizationid) {
        this.organizationid = organizationid;
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

    public Date getAssigntime() {
        return assigntime;
    }

    public void setAssigntime(Date assigntime) {
        this.assigntime = assigntime;
    }

    public Long getAssignouid() {
        return assignouid;
    }

    public void setAssignouid(Long assignouid) {
        this.assignouid = assignouid;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getBusstype() {
        return busstype;
    }

    public void setBusstype(Short busstype) {
        this.busstype = busstype;
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

    public Long getOrgid() {
        return orgid;
    }

    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }
}