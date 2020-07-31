package com.springboot.beans;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "uu")
public class Uu {
    @TableId
    private String uuid;
    @TableField(value = "uu_name")
    private String uuName;
    @TableField(value = "uu_email")
    private String uuEmail;

    public Uu() {
    }

    public Uu(String uuid, String uu_name, String uu_email) {
        this.uuid = uuid;
        this.uuName = uu_name;
        this.uuEmail = uu_email;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuName() {
        return uuName;
    }

    public void setUuName(String uuName) {
        this.uuName = uuName;
    }

    public String getUuEmail() {
        return uuEmail;
    }

    public void setUuEmail(String uuEmail) {
        this.uuEmail = uuEmail;
    }

    @Override
    public String toString() {
        return "Uu{" +
                "uuid='" + uuid + '\'' +
                ", uu_name='" + uuName + '\'' +
                ", uu_email='" + uuEmail + '\'' +
                '}';
    }
}
