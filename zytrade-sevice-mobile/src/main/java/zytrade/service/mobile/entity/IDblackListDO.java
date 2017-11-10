package zytrade.service.mobile.entity;

import java.util.Date;

public class IDblackListDO {
    private String idcard;

    private Short type;

    private Short deleted;

    private String description;

    private String deletedesc;

    private Date createdate;

    private Long createouid;

    private Date updatedate;

    private Long updateouid;

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getDeleted() {
        return deleted;
    }

    public void setDeleted(Short deleted) {
        this.deleted = deleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDeletedesc() {
        return deletedesc;
    }

    public void setDeletedesc(String deletedesc) {
        this.deletedesc = deletedesc == null ? null : deletedesc.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Long getCreateouid() {
        return createouid;
    }

    public void setCreateouid(Long createouid) {
        this.createouid = createouid;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Long getUpdateouid() {
        return updateouid;
    }

    public void setUpdateouid(Long updateouid) {
        this.updateouid = updateouid;
    }
}