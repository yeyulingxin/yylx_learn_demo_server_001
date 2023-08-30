package com.yylx.test.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class CategoryListQueryParam extends PageRequest {

    private Integer type;
}
