package com.yylx.test.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class AttrQueryRequest implements Serializable {

    private String type;

    private String categoryId;

    private String attrId;
}
