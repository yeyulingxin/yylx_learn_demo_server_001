package com.yylx.test.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserAddRequest implements Serializable {

    private String username;

    private String password;

    private String email;

    private String mobile;
}
