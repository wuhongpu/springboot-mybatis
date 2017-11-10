package zytrade.service.mobile.entity;

import java.util.Date;

public class LoginMessageDO {
    private Long id;

    private Long terminalid;

    private Long userid;

    private Short status;

    private Short type;

    private String message;

    private Date createdate;

    private Date invalidtime;

    private Long invalidtimelong;

    private Long roleid;

    private Short flag;

    private Short pushstatus;

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

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getInvalidtime() {
        return invalidtime;
    }

    public void setInvalidtime(Date invalidtime) {
        this.invalidtime = invalidtime;
    }

    public Long getInvalidtimelong() {
        return invalidtimelong;
    }

    public void setInvalidtimelong(Long invalidtimelong) {
        this.invalidtimelong = invalidtimelong;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public Short getPushstatus() {
        return pushstatus;
    }

    public void setPushstatus(Short pushstatus) {
        this.pushstatus = pushstatus;
    }
}