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
public class CategoryPageResponse extends BaseResponse {

    private Long total;

    private Long pageNum;

    private Long pageSize;

    private List<CategoryPageResponse.CategoryInfoDTO> cateList;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class CategoryInfoDTO implements Serializable {

        private String cateId;

        private String cateName;

        private String parentCateId;

        private String cateLevel;

        private boolean deleted = false;

        private List<CategoryInfoDTO> children;
    }
}
