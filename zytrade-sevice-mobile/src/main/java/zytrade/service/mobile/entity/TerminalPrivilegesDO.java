package zytrade.service.mobile.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TerminalPrivilegesDO {
    private Long id;

    private String name;

    private String functionkey;

    private String description;

    private Date createdate;

    private Short deleted;

    private Short status;

    private Long tchannel;

    private Long paytchannel;

    private Short tptype;

    private String passmsg;

    private String pausemsg;

    private BigDecimal mintransamt;

    private BigDecimal maxtransamt;

    private String limittransmsg;

    private BigDecimal dayallamt;

    private Long daycnt;

    private Short crasht1type;

    private String operatestarttime;

    private String operateendtime;

    private String nooperatemsg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFunctionkey() {
        return functionkey;
    }

    public void setFunctionkey(String functionkey) {
        this.functionkey = functionkey == null ? null : functionkey.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Short getDeleted() {
        return deleted;
    }

    public void setDeleted(Short deleted) {
        this.deleted = deleted;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long getTchannel() {
        return tchannel;
    }

    public void setTchannel(Long tchannel) {
        this.tchannel = tchannel;
    }

    public Long getPaytchannel() {
        return paytchannel;
    }

    public void setPaytchannel(Long paytchannel) {
        this.paytchannel = paytchannel;
    }

    public Short getTptype() {
        return tptype;
    }

    public void setTptype(Short tptype) {
        this.tptype = tptype;
    }

    public String getPassmsg() {
        return passmsg;
    }

    public void setPassmsg(String passmsg) {
        this.passmsg = passmsg == null ? null : passmsg.trim();
    }

    public String getPausemsg() {
        return pausemsg;
    }

    public void setPausemsg(String pausemsg) {
        this.pausemsg = pausemsg == null ? null : pausemsg.trim();
    }

    public BigDecimal getMintransamt() {
        return mintransamt;
    }

    public void setMintransamt(BigDecimal mintransamt) {
        this.mintransamt = mintransamt;
    }

    public BigDecimal getMaxtransamt() {
        return maxtransamt;
    }

    public void setMaxtransamt(BigDecimal maxtransamt) {
        this.maxtransamt = maxtransamt;
    }

    public String getLimittransmsg() {
        return limittransmsg;
    }

    public void setLimittransmsg(String limittransmsg) {
        this.limittransmsg = limittransmsg == null ? null : limittransmsg.trim();
    }

    public BigDecimal getDayallamt() {
        return dayallamt;
    }

    public void setDayallamt(BigDecimal dayallamt) {
        this.dayallamt = dayallamt;
    }

    public Long getDaycnt() {
        return daycnt;
    }

    public void setDaycnt(Long daycnt) {
        this.daycnt = daycnt;
    }

    public Short getCrasht1type() {
        return crasht1type;
    }

    public void setCrasht1type(Short crasht1type) {
        this.crasht1type = crasht1type;
    }

    public String getOperatestarttime() {
        return operatestarttime;
    }

    public void setOperatestarttime(String operatestarttime) {
        this.operatestarttime = operatestarttime == null ? null : operatestarttime.trim();
    }

    public String getOperateendtime() {
        return operateendtime;
    }

    public void setOperateendtime(String operateendtime) {
        this.operateendtime = operateendtime == null ? null : operateendtime.trim();
    }

    public String getNooperatemsg() {
        return nooperatemsg;
    }

    public void setNooperatemsg(String nooperatemsg) {
        this.nooperatemsg = nooperatemsg == null ? null : nooperatemsg.trim();
    }
}