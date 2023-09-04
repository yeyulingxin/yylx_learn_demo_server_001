package com.yylx.test.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class AttrListQueryParam implements Serializable {

    private String type;

    private String categoryId;
}
