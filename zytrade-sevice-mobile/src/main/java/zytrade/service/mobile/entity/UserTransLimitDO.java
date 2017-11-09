package zytrade.service.mobile.entity;

import java.math.BigDecimal;

public class UserTransLimitDO {
    private Long id;

    private Long userid;

    private String functionkey;

    private Short limittype;

    private BigDecimal dayallamt;

    private Long daycnt;

    private BigDecimal dayminamt;

    private BigDecimal daymaxamt;

    private BigDecimal daycardallamt;

    private Long daycardcnt;

    private BigDecimal fddayallamt;

    private Long fddaycnt;

    private BigDecimal fddayminamt;

    private BigDecimal fddaymaxamt;

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

    public String getFunctionkey() {
        return functionkey;
    }

    public void setFunctionkey(String functionkey) {
        this.functionkey = functionkey == null ? null : functionkey.trim();
    }

    public Short getLimittype() {
        return limittype;
    }

    public void setLimittype(Short limittype) {
        this.limittype = limittype;
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

    public BigDecimal getDayminamt() {
        return dayminamt;
    }

    public void setDayminamt(BigDecimal dayminamt) {
        this.dayminamt = dayminamt;
    }

    public BigDecimal getDaymaxamt() {
        return daymaxamt;
    }

    public void setDaymaxamt(BigDecimal daymaxamt) {
        this.daymaxamt = daymaxamt;
    }

    public BigDecimal getDaycardallamt() {
        return daycardallamt;
    }

    public void setDaycardallamt(BigDecimal daycardallamt) {
        this.daycardallamt = daycardallamt;
    }

    public Long getDaycardcnt() {
        return daycardcnt;
    }

    public void setDaycardcnt(Long daycardcnt) {
        this.daycardcnt = daycardcnt;
    }

    public BigDecimal getFddayallamt() {
        return fddayallamt;
    }

    public void setFddayallamt(BigDecimal fddayallamt) {
        this.fddayallamt = fddayallamt;
    }

    public Long getFddaycnt() {
        return fddaycnt;
    }

    public void setFddaycnt(Long fddaycnt) {
        this.fddaycnt = fddaycnt;
    }

    public BigDecimal getFddayminamt() {
        return fddayminamt;
    }

    public void setFddayminamt(BigDecimal fddayminamt) {
        this.fddayminamt = fddayminamt;
    }

    public BigDecimal getFddaymaxamt() {
        return fddaymaxamt;
    }

    public void setFddaymaxamt(BigDecimal fddaymaxamt) {
        this.fddaymaxamt = fddaymaxamt;
    }
}