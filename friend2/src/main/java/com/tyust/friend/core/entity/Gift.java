package com.tyust.friend.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gift")
public class Gift {
    @Id
    private String  gid     ;
    private String  val     ;
    private String  gtype   ;
    private String  filepat ;
    private String  desc    ;
    private String  ifuse   ;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype;
    }

    public String getFilepat() {
        return filepat;
    }

    public void setFilepat(String filepat) {
        this.filepat = filepat;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIfuse() {
        return ifuse;
    }

    public void setIfuse(String ifuse) {
        this.ifuse = ifuse;
    }
}
