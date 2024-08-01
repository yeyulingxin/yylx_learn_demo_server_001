package com.yylx.test.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
public class ElasticsearchDO implements Serializable {

    private String content;

    private Map<String, Object> metadata;

    private List<Float> embedding;
}
