package zytrade.service.mobile.entity;

import java.util.Date;

public class TerminalTypeDO {
    private Long id;

    private String name;

    private String description;

    private Date createdate;

    private Short deleted;

    private String privatekey;

    private String privatekeyx509;

    private String publickey;

    private Short type;

    private String fliospath;

    private String fdiospath;

    private String qbiospath;

    private Short roletype;

    private Short status;

    private Short isd0fee;

    private String appsurl;

    private String domainname;

    private String nickname;

    private String headerurl;

    private String appkey;

    private String mastersecret;

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

    public String getPrivatekey() {
        return privatekey;
    }

    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey == null ? null : privatekey.trim();
    }

    public String getPrivatekeyx509() {
        return privatekeyx509;
    }

    public void setPrivatekeyx509(String privatekeyx509) {
        this.privatekeyx509 = privatekeyx509 == null ? null : privatekeyx509.trim();
    }

    public String getPublickey() {
        return publickey;
    }

    public void setPublickey(String publickey) {
        this.publickey = publickey == null ? null : publickey.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getFliospath() {
        return fliospath;
    }

    public void setFliospath(String fliospath) {
        this.fliospath = fliospath == null ? null : fliospath.trim();
    }

    public String getFdiospath() {
        return fdiospath;
    }

    public void setFdiospath(String fdiospath) {
        this.fdiospath = fdiospath == null ? null : fdiospath.trim();
    }

    public String getQbiospath() {
        return qbiospath;
    }

    public void setQbiospath(String qbiospath) {
        this.qbiospath = qbiospath == null ? null : qbiospath.trim();
    }

    public Short getRoletype() {
        return roletype;
    }

    public void setRoletype(Short roletype) {
        this.roletype = roletype;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getIsd0fee() {
        return isd0fee;
    }

    public void setIsd0fee(Short isd0fee) {
        this.isd0fee = isd0fee;
    }

    public String getAppsurl() {
        return appsurl;
    }

    public void setAppsurl(String appsurl) {
        this.appsurl = appsurl == null ? null : appsurl.trim();
    }

    public String getDomainname() {
        return domainname;
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname == null ? null : domainname.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getHeaderurl() {
        return headerurl;
    }

    public void setHeaderurl(String headerurl) {
        this.headerurl = headerurl == null ? null : headerurl.trim();
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey == null ? null : appkey.trim();
    }

    public String getMastersecret() {
        return mastersecret;
    }

    public void setMastersecret(String mastersecret) {
        this.mastersecret = mastersecret == null ? null : mastersecret.trim();
    }
}