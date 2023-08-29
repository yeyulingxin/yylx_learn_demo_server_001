package com.yylx.test.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserUpdateStatusRequest implements Serializable {

    private Boolean newStatus;
}

