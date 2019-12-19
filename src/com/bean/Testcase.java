package com.bean;

import java.util.Date;

public class Testcase {
    private Integer id;

    private String systemname;

    private String caseid;

    private String casename;

    private String requestbody;

    private String requestmethod;

    private String expectkeywords;

    private String otherrequestcaseid;

    private String otherresponsekeys;

    private String actualresponse;

    private String apipath;

    private String headers;

    private String ispass;

    private Date lastupdatetime;

    private String dotables;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSystemname() {
        return systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname == null ? null : systemname.trim();
    }

    public String getCaseid() {
        return caseid;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid == null ? null : caseid.trim();
    }

    public String getCasename() {
        return casename;
    }

    public void setCasename(String casename) {
        this.casename = casename == null ? null : casename.trim();
    }

    public String getRequestbody() {
        return requestbody;
    }

    public void setRequestbody(String requestbody) {
        this.requestbody = requestbody == null ? null : requestbody.trim();
    }

    public String getRequestmethod() {
        return requestmethod;
    }

    public void setRequestmethod(String requestmethod) {
        this.requestmethod = requestmethod == null ? null : requestmethod.trim();
    }

    public String getExpectkeywords() {
        return expectkeywords;
    }

    public void setExpectkeywords(String expectkeywords) {
        this.expectkeywords = expectkeywords == null ? null : expectkeywords.trim();
    }

    public String getOtherrequestcaseid() {
        return otherrequestcaseid;
    }

    public void setOtherrequestcaseid(String otherrequestcaseid) {
        this.otherrequestcaseid = otherrequestcaseid == null ? null : otherrequestcaseid.trim();
    }

    public String getOtherresponsekeys() {
        return otherresponsekeys;
    }

    public void setOtherresponsekeys(String otherresponsekeys) {
        this.otherresponsekeys = otherresponsekeys == null ? null : otherresponsekeys.trim();
    }

    public String getActualresponse() {
        return actualresponse;
    }

    public void setActualresponse(String actualresponse) {
        this.actualresponse = actualresponse == null ? null : actualresponse.trim();
    }

    public String getApipath() {
        return apipath;
    }

    public void setApipath(String apipath) {
        this.apipath = apipath == null ? null : apipath.trim();
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers == null ? null : headers.trim();
    }

    public String getIspass() {
        return ispass;
    }

    public void setIspass(String ispass) {
        this.ispass = ispass == null ? null : ispass.trim();
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public String getDotables() {
        return dotables;
    }

    public void setDotables(String dotables) {
        this.dotables = dotables == null ? null : dotables.trim();
    }
}