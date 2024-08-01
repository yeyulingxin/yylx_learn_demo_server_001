package com.yylx.test;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class Item implements Serializable {

    private List<Element> items;

    @Data
    public static class Element implements Serializable {
        private Integer count;

        private BigDecimal price;

        private String sku;
    }
}
