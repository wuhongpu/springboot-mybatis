package zytrade.service.mobile.entity;

public class ActivationCodeStatisticDO {
    private Long id;

    private Long organizationid;

    private String month;

    private Long totalQty;

    private Long totalActiveQty;

    private Long addQty;

    private Long addActiveQty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(Long organizationid) {
        this.organizationid = organizationid;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public Long getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(Long totalQty) {
        this.totalQty = totalQty;
    }

    public Long getTotalActiveQty() {
        return totalActiveQty;
    }

    public void setTotalActiveQty(Long totalActiveQty) {
        this.totalActiveQty = totalActiveQty;
    }

    public Long getAddQty() {
        return addQty;
    }

    public void setAddQty(Long addQty) {
        this.addQty = addQty;
    }

    public Long getAddActiveQty() {
        return addActiveQty;
    }

    public void setAddActiveQty(Long addActiveQty) {
        this.addActiveQty = addActiveQty;
    }
}