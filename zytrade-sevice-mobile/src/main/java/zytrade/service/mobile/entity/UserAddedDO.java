package zytrade.service.mobile.entity;

public class UserAddedDO {
    private Long id;

    private Long type;

    private Long userid;

    private String otherdata;

    private String reqcode;

    private String reqmsg;

    private Short status;

    private String account;

    private String password;

    private String privatekey;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getOtherdata() {
        return otherdata;
    }

    public void setOtherdata(String otherdata) {
        this.otherdata = otherdata == null ? null : otherdata.trim();
    }

    public String getReqcode() {
        return reqcode;
    }

    public void setReqcode(String reqcode) {
        this.reqcode = reqcode == null ? null : reqcode.trim();
    }

    public String getReqmsg() {
        return reqmsg;
    }

    public void setReqmsg(String reqmsg) {
        this.reqmsg = reqmsg == null ? null : reqmsg.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPrivatekey() {
        return privatekey;
    }

    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey == null ? null : privatekey.trim();
    }
}