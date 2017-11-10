package zytrade.service.mobile.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ActivationCodeDO {
    private Long id;

    private Long roleid;

    private String code;

    private Short effective;

    private Date createdate;

    private Short isactivation;

    private Long batchid;

    private Long organizationid;

    private Long terminaltypeid;

    private Date distributedate;

    private BigDecimal feerate;

    private BigDecimal clearrate;

    private BigDecimal ownbrokeragerate;

    private BigDecimal clearfee;

    private BigDecimal fdmaxfee;

    private BigDecimal fdminfee;

    private Date updatetime;

    private Long updateouid;

    private Date assigntime;

    private Long assignouid;

    private BigDecimal cashrate;

    private BigDecimal fdfeerate;

    private Short speedcash;

    private Short acodetype;

    private Short chargectype;

    private BigDecimal smfeerate;

    private BigDecimal smfjfeerate;

    private Short isdefault;

    private BigDecimal alipayfeerate;

    private BigDecimal quickfeerate;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Short getEffective() {
        return effective;
    }

    public void setEffective(Short effective) {
        this.effective = effective;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Short getIsactivation() {
        return isactivation;
    }

    public void setIsactivation(Short isactivation) {
        this.isactivation = isactivation;
    }

    public Long getBatchid() {
        return batchid;
    }

    public void setBatchid(Long batchid) {
        this.batchid = batchid;
    }

    public Long getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(Long organizationid) {
        this.organizationid = organizationid;
    }

    public Long getTerminaltypeid() {
        return terminaltypeid;
    }

    public void setTerminaltypeid(Long terminaltypeid) {
        this.terminaltypeid = terminaltypeid;
    }

    public Date getDistributedate() {
        return distributedate;
    }

    public void setDistributedate(Date distributedate) {
        this.distributedate = distributedate;
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

    public Short getSpeedcash() {
        return speedcash;
    }

    public void setSpeedcash(Short speedcash) {
        this.speedcash = speedcash;
    }

    public Short getAcodetype() {
        return acodetype;
    }

    public void setAcodetype(Short acodetype) {
        this.acodetype = acodetype;
    }

    public Short getChargectype() {
        return chargectype;
    }

    public void setChargectype(Short chargectype) {
        this.chargectype = chargectype;
    }

    public BigDecimal getSmfeerate() {
        return smfeerate;
    }

    public void setSmfeerate(BigDecimal smfeerate) {
        this.smfeerate = smfeerate;
    }

    public BigDecimal getSmfjfeerate() {
        return smfjfeerate;
    }

    public void setSmfjfeerate(BigDecimal smfjfeerate) {
        this.smfjfeerate = smfjfeerate;
    }

    public Short getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Short isdefault) {
        this.isdefault = isdefault;
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