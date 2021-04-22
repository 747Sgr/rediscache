package com.sunwoda.demo.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2021-04-22 10:24:30
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 938526650197809215L;

    private Long id;

    private Date createAt;

    private Long createBy;

    private Date updateAt;

    private Long updateBy;

    private String username;

    private String password;

    private Long tenantId;

    private String perms;

    private String role;

    private String salt;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", createAt=" + createAt +
                ", createBy=" + createBy +
                ", updateAt=" + updateAt +
                ", updateBy=" + updateBy +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", tenantId=" + tenantId +
                ", perms='" + perms + '\'' +
                ", role='" + role + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}
