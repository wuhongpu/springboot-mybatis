package zytrade.service.mobile.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ActivationCodeBatchDO {
    private Long id;

    private Long cnt;

    private Date createdate;

    private Long organizationid;

    private BigDecimal totalmoney;

    private Long createuserid;

    private Long checkuserid;

    private Short ischeck;

    private Short ispaid;

    private String paytype;

    private String description;

    private Long terminaltypeid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCnt() {
        return cnt;
    }

    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Long getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(Long organizationid) {
        this.organizationid = organizationid;
    }

    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Long getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Long createuserid) {
        this.createuserid = createuserid;
    }

    public Long getCheckuserid() {
        return checkuserid;
    }

    public void setCheckuserid(Long checkuserid) {
        this.checkuserid = checkuserid;
    }

    public Short getIscheck() {
        return ischeck;
    }

    public void setIscheck(Short ischeck) {
        this.ischeck = ischeck;
    }

    public Short getIspaid() {
        return ispaid;
    }

    public void setIspaid(Short ispaid) {
        this.ispaid = ispaid;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getTerminaltypeid() {
        return terminaltypeid;
    }

    public void setTerminaltypeid(Long terminaltypeid) {
        this.terminaltypeid = terminaltypeid;
    }
}