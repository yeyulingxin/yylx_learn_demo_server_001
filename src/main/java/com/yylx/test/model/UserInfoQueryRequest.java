package com.yylx.test.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfoQueryRequest implements Serializable {

    private String userId;
}
