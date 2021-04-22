package com.sunwoda.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (UserAddressInfo)实体类
 *
 * @author makejava
 * @since 2021-04-22 16:09:24
 */
public class UserAddressInfo implements Serializable {
    private static final long serialVersionUID = -36859058294568356L;

    private Long id;

    private Date createAt;

    private Long createBy;

    private Date updateAt;

    private Long updateBy;

    private String address;

    private Long userId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
