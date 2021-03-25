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
public class User implements Serializable{

    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
