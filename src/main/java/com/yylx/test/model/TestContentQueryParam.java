package com.yylx.test.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TestContentQueryParam implements Serializable {

    private Integer pageIndex;

    private Integer pageSize;
}
