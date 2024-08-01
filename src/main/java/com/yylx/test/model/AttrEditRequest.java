package com.yylx.test.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class AttrEditRequest implements Serializable {

    private String attrId;

    private String attrName;

    private String type;

    private String categoryId;
}
