package com.yylx.test.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class TestResult implements Serializable {

    private String name;

    private Integer id;
}
