package zytrade.service.mobile.entity;

import java.util.Date;

public class TerminalErrorLogDO {
    private Long id;

    private Long terminaltypeid;

    private Long roleid;

    private Long userid;

    private Short clienttype;

    private String path;

    private Date createdate;

    private Long dcnt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTerminaltypeid() {
        return terminaltypeid;
    }

    public void setTerminaltypeid(Long terminaltypeid) {
        this.terminaltypeid = terminaltypeid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Short getClienttype() {
        return clienttype;
    }

    public void setClienttype(Short clienttype) {
        this.clienttype = clienttype;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Long getDcnt() {
        return dcnt;
    }

    public void setDcnt(Long dcnt) {
        this.dcnt = dcnt;
    }
}