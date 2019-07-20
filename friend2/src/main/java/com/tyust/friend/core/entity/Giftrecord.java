package com.tyust.friend.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "giftrecord")
public class Giftrecord {
    @Id
    private String  gid       ;
    private String  fromuser  ;
    private String  touser    ;
    private String  giftid    ;
    private String  timeg     ;
    private String  remark    ;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getFromuser() {
        return fromuser;
    }

    public void setFromuser(String fromuser) {
        this.fromuser = fromuser;
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getGiftid() {
        return giftid;
    }

    public void setGiftid(String giftid) {
        this.giftid = giftid;
    }

    public String getTimeg() {
        return timeg;
    }

    public void setTimeg(String timeg) {
        this.timeg = timeg;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
