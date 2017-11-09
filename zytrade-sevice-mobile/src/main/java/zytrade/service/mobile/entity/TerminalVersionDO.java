package zytrade.service.mobile.entity;

import java.util.Date;

public class TerminalVersionDO {
    private Long id;

    private Long terminalid;

    private String version;

    private Short status;

    private Short clienttype;

    private Short isforce;

    private String description;

    private String filepath;

    private Date createdate;

    private String thirdurl;

    private Long roleid;

    private Short versiontype;

    private String plisturl;

    private Short downloadsrc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTerminalid() {
        return terminalid;
    }

    public void setTerminalid(Long terminalid) {
        this.terminalid = terminalid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getClienttype() {
        return clienttype;
    }

    public void setClienttype(Short clienttype) {
        this.clienttype = clienttype;
    }

    public Short getIsforce() {
        return isforce;
    }

    public void setIsforce(Short isforce) {
        this.isforce = isforce;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getThirdurl() {
        return thirdurl;
    }

    public void setThirdurl(String thirdurl) {
        this.thirdurl = thirdurl == null ? null : thirdurl.trim();
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Short getVersiontype() {
        return versiontype;
    }

    public void setVersiontype(Short versiontype) {
        this.versiontype = versiontype;
    }

    public String getPlisturl() {
        return plisturl;
    }

    public void setPlisturl(String plisturl) {
        this.plisturl = plisturl == null ? null : plisturl.trim();
    }

    public Short getDownloadsrc() {
        return downloadsrc;
    }

    public void setDownloadsrc(Short downloadsrc) {
        this.downloadsrc = downloadsrc;
    }
}