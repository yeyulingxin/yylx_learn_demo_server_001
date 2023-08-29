package com.yylx.test.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class CategoryTreeResponse extends BaseResponse {

    private List<CategoryTreeItem> categoryList;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class CategoryTreeItem implements Serializable {

        private Long categoryId;

        private String categoryName;

        private String categoryPath;

        private List<CategoryTreeItem> childCategoryList;
    }
}
