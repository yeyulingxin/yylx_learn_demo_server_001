package com.yylx.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class CategoryListResponse extends BaseResponse {

    private List<CategoryPageResponse.CategoryInfoDTO> parentCategoryList;
}
