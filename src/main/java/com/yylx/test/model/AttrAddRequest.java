package com.yylx.test.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class AttrAddRequest implements Serializable {

    private String attrName;

    private String type;

    private String categoryId;
}
