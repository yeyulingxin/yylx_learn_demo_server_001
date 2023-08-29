package com.yylx.test.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageRequest implements Serializable {

    private Long pageNum;

    private Long pageSize;
}
