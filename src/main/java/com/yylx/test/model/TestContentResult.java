package com.yylx.test.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TestContentResult implements Serializable {

    private Integer id;

    private String artId;

    private String title;

    private String autId;

    private String commCount;

    private String pubDate;

    private String autName;

    private Integer isTop;

    private TestCover cover;

    @Data
    public static class TestCover implements Serializable {

        private Integer type;

        private List<String> images;
    }
}
