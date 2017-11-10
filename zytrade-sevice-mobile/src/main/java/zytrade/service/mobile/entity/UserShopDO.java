package zytrade.service.mobile.entity;

public class UserShopDO {
    private Long id;

    private Long userid;

    private String shonname;

    private String shonaddress;

    private String img1;

    private String img2;

    private String img3;

    private String licenseimg;

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

    public String getShonname() {
        return shonname;
    }

    public void setShonname(String shonname) {
        this.shonname = shonname == null ? null : shonname.trim();
    }

    public String getShonaddress() {
        return shonaddress;
    }

    public void setShonaddress(String shonaddress) {
        this.shonaddress = shonaddress == null ? null : shonaddress.trim();
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1 == null ? null : img1.trim();
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2 == null ? null : img2.trim();
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3 == null ? null : img3.trim();
    }

    public String getLicenseimg() {
        return licenseimg;
    }

    public void setLicenseimg(String licenseimg) {
        this.licenseimg = licenseimg == null ? null : licenseimg.trim();
    }
}