package com.yylx.test.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserEditRequest implements Serializable {

    private String userId;

    private String username;

    private String email;

    private String mobile;
}
