package com.shepherd.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author fjZheng
 * @version 1.0
 * @date 2021/3/25 10:03
 */
@Data
public class User implements Serializable {

    private Integer userId;
    private String userName;
    private String userAddress;
    private String userSex;
    private Date userBirthday;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userBirthday=" + userBirthday +
                '}';
    }
}
