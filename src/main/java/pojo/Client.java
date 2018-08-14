package pojo;

import java.util.Date;

public class Client {
    private Long id;

    private Long userid;

    private Long tagid;

    private String clientname;

    private String legalrepresentative;

    private Date registertime;

    private String companypages;

    private Long clienttypeid;

    private Long documenttypeid;

    private String idnumber;

    private String country;

    private String province;

    private String city;

    private String region;

    private String companytel;

    private String companyfax;

    private String companyaddress;

    private String note;

    private Long state;

    private Long contactid;

    private Long loginaddressid;

    private String iosclientdownload;

    private String iosqrcodedownload;

    private String androidclientdownload;

    private String androidqrcodedownload;

    private Long creationby;

    private Date creationdate;

    private Long modifyby;

    private Date modifydate;

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

    public Long getTagid() {
        return tagid;
    }

    public void setTagid(Long tagid) {
        this.tagid = tagid;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getLegalrepresentative() {
        return legalrepresentative;
    }

    public void setLegalrepresentative(String legalrepresentative) {
        this.legalrepresentative = legalrepresentative == null ? null : legalrepresentative.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getCompanypages() {
        return companypages;
    }

    public void setCompanypages(String companypages) {
        this.companypages = companypages == null ? null : companypages.trim();
    }

    public Long getClienttypeid() {
        return clienttypeid;
    }

    public void setClienttypeid(Long clienttypeid) {
        this.clienttypeid = clienttypeid;
    }

    public Long getDocumenttypeid() {
        return documenttypeid;
    }

    public void setDocumenttypeid(Long documenttypeid) {
        this.documenttypeid = documenttypeid;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getCompanytel() {
        return companytel;
    }

    public void setCompanytel(String companytel) {
        this.companytel = companytel == null ? null : companytel.trim();
    }

    public String getCompanyfax() {
        return companyfax;
    }

    public void setCompanyfax(String companyfax) {
        this.companyfax = companyfax == null ? null : companyfax.trim();
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress == null ? null : companyaddress.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Long getContactid() {
        return contactid;
    }

    public void setContactid(Long contactid) {
        this.contactid = contactid;
    }

    public Long getLoginaddressid() {
        return loginaddressid;
    }

    public void setLoginaddressid(Long loginaddressid) {
        this.loginaddressid = loginaddressid;
    }

    public String getIosclientdownload() {
        return iosclientdownload;
    }

    public void setIosclientdownload(String iosclientdownload) {
        this.iosclientdownload = iosclientdownload == null ? null : iosclientdownload.trim();
    }

    public String getIosqrcodedownload() {
        return iosqrcodedownload;
    }

    public void setIosqrcodedownload(String iosqrcodedownload) {
        this.iosqrcodedownload = iosqrcodedownload == null ? null : iosqrcodedownload.trim();
    }

    public String getAndroidclientdownload() {
        return androidclientdownload;
    }

    public void setAndroidclientdownload(String androidclientdownload) {
        this.androidclientdownload = androidclientdownload == null ? null : androidclientdownload.trim();
    }

    public String getAndroidqrcodedownload() {
        return androidqrcodedownload;
    }

    public void setAndroidqrcodedownload(String androidqrcodedownload) {
        this.androidqrcodedownload = androidqrcodedownload == null ? null : androidqrcodedownload.trim();
    }

    public Long getCreationby() {
        return creationby;
    }

    public void setCreationby(Long creationby) {
        this.creationby = creationby;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Long getModifyby() {
        return modifyby;
    }

    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}