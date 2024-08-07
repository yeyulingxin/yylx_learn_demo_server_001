package com.yylx.test.controller;

import com.yylx.test.model.AttrAddRequest;
import com.yylx.test.model.AttrEditRequest;
import com.yylx.test.model.AttrInfoResponse;
import com.yylx.test.model.AttrListQueryParam;
import com.yylx.test.model.AttrListResponse;
import com.yylx.test.model.AttrQueryRequest;
import com.yylx.test.model.BaseResponse;
import com.yylx.test.model.CategoryListQueryParam;
import com.yylx.test.model.CategoryListResponse;
import com.yylx.test.model.CategoryPageResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/yylx9/goods/")
public class GoodsController {

    @PostMapping("getCategoryPage")
    public CategoryPageResponse getCategoryPage(@RequestBody CategoryListQueryParam param) {
        return CategoryPageResponse.builder().code(200).msg("").pageNum(1L).pageSize(5L).total(100L).cateList(
                Arrays.asList(
                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("1").parentCateId("0").cateName("大家电")
                                .cateLevel("1").children(
                                        Arrays.asList(
                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("11").parentCateId("1")
                                                        .cateName("电视").cateLevel("2").children(
                                                                Arrays.asList(
                                                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("111")
                                                                                .parentCateId("11").cateName("曲面电视").cateLevel("3")
                                                                                .build(),
                                                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("112")
                                                                                .parentCateId("11").cateName("透明电视").cateLevel("3")
                                                                                .build()
                                                                )
                                                        ).build(),

                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("12").parentCateId("1").cateName("冰箱").cateLevel("2").children(
                                                Arrays.asList(
                                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("121").parentCateId("12").cateName("嵌入式冰箱").deleted(true).cateLevel("3").build(),
                                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("122").parentCateId("12").cateName("纤薄冰箱").cateLevel("3").build()
                                                )
                                        ).build(),

                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("13").parentCateId("1").cateName("洗衣机").cateLevel("2").children(
                                                Arrays.asList(
                                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("131").parentCateId("13").cateName("滚筒洗衣机").cateLevel("3").build(),
                                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("132").parentCateId("13").cateName("波轮洗衣机").cateLevel("3").build()
                                                )
                                        ).build()
                                )
                        ).build(),

                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("2").parentCateId("0").cateName("手机相机").cateLevel("1").children(
                                Arrays.asList(
                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("21").parentCateId("2").cateName("小米").cateLevel("2").children(
                                                Arrays.asList(
                                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("211").parentCateId("21").cateName("红米系列").cateLevel("3").build(),
                                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("212").parentCateId("21").cateName("小米系列").cateLevel("3").build()
                                                )
                                        ).build(),

                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("22").parentCateId("2").cateName("华为").cateLevel("2").children(
                                                Arrays.asList(
                                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("221").parentCateId("22").cateName("华为智能").cateLevel("3").build(),
                                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("222").parentCateId("22").cateName("荣耀").cateLevel("3").build()
                                                )
                                        ).build()
                                )
                        ).build(),

                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("3").parentCateId("0").cateName("海外购").cateLevel("1").children(
                                Arrays.asList(
                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("31").parentCateId("3").cateName("彩妆").cateLevel("2").children(
                                                Arrays.asList(
                                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("311").parentCateId("31").cateName("水乳").cateLevel("3").build(),
                                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("312").parentCateId("31").cateName("精华").cateLevel("3").build()
                                                )
                                        ).build(),

                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("32").parentCateId("3").cateName("冰鲜").cateLevel("2").children(
                                                Arrays.asList(
                                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("321")
                                                                .parentCateId("32").cateName("水产").cateLevel("3")
                                                                .build(),
                                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("322")
                                                                .parentCateId("32").cateName("牛羊肉").cateLevel("3")
                                                                .build()
                                                )
                                        ).build()
                                )
                        ).build()

                )
        ).build();
    }

    @PostMapping("getCategoryList")
    public CategoryListResponse getCategoryList() {
        return CategoryListResponse.builder().code(200).msg("").parentCategoryList(Arrays.asList(
                CategoryPageResponse.CategoryInfoDTO.builder().cateId("1").parentCateId("0").cateName("大家电")
                        .cateLevel("1").children(
                                Arrays.asList(
                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("11").parentCateId("1")
                                                .cateName("电视").cateLevel("2").children(
                                                        Arrays.asList(
                                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("111")
                                                                        .parentCateId("11").cateName("曲面电视").cateLevel("3").build(),
                                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("112")
                                                                        .parentCateId("11").cateName("透明电视").cateLevel("3").build()
                                                        )
                                                ).build(),

                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("12").parentCateId("1")
                                                .cateName("冰箱").cateLevel("2").children(
                                                        Arrays.asList(
                                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("121")
                                                                        .parentCateId("12").cateName("嵌入式冰箱").deleted(true)
                                                                        .cateLevel("3").build(),
                                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("122")
                                                                        .parentCateId("12").cateName("纤薄冰箱").cateLevel("3").build()
                                                        )
                                                ).build(),

                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("13").parentCateId("1")
                                                .cateName("洗衣机").cateLevel("2").children(
                                                        Arrays.asList(
                                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("131")
                                                                        .parentCateId("13").cateName("滚筒洗衣机").cateLevel("3")
                                                                        .build(),
                                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("132")
                                                                        .parentCateId("13").cateName("波轮洗衣机").cateLevel("3")
                                                                        .build()
                                                        )
                                                ).build()
                                )
                        ).build(),

                CategoryPageResponse.CategoryInfoDTO.builder().cateId("2").parentCateId("0").cateName("手机相机")
                        .cateLevel("1").children(
                                Arrays.asList(
                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("21").parentCateId("2")
                                                .cateName("小米").cateLevel("2").children(
                                                        Arrays.asList(
                                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("211")
                                                                        .parentCateId("21").cateName("红米系列").cateLevel("3").build(),
                                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("212")
                                                                        .parentCateId("21").cateName("小米系列").cateLevel("3").build()
                                                        )
                                                ).build(),

                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("22").parentCateId("2")
                                                .cateName("华为").cateLevel("2").children(
                                                        Arrays.asList(
                                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("221")
                                                                        .parentCateId("22").cateName("华为智能").cateLevel("3").build(),
                                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("222")
                                                                        .parentCateId("22").cateName("荣耀").cateLevel("3").build()
                                                        )
                                                ).build()
                                )
                        ).build(),

                CategoryPageResponse.CategoryInfoDTO.builder().cateId("3").parentCateId("0").cateName("海外购")
                        .cateLevel("1").children(
                                Arrays.asList(
                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("31").parentCateId("3")
                                                .cateName("彩妆").cateLevel("2").children(
                                                        Arrays.asList(
                                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("311")
                                                                        .parentCateId("31").cateName("水乳").cateLevel("3").build(),
                                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("312")
                                                                        .parentCateId("31").cateName("精华").cateLevel("3").build()
                                                        )
                                                ).build(),

                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("32").parentCateId("3")
                                                .cateName("冰鲜").cateLevel("2").children(
                                                        Arrays.asList(
                                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("321")
                                                                        .parentCateId("32").cateName("水产").cateLevel("3").build(),
                                                                CategoryPageResponse.CategoryInfoDTO.builder().cateId("322")
                                                                        .parentCateId("32").cateName("牛羊肉").cateLevel("3").build()
                                                        )
                                                ).build()
                                )
                        ).build())).build();
    }

    @PostMapping("getParentCategoryList")
    public CategoryListResponse getParentCategoryList() {
        return CategoryListResponse.builder().code(200).msg("").parentCategoryList(Arrays.asList(
                CategoryPageResponse.CategoryInfoDTO.builder().cateId("1").parentCateId("0").cateName("大家电")
                        .cateLevel("1").children(
                                Arrays.asList(
                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("11").parentCateId("1")
                                                .cateName("电视").cateLevel("2").build(),
                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("12").parentCateId("1")
                                                .cateName("冰箱").cateLevel("2").build(),
                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("13").parentCateId("1")
                                                .cateName("洗衣机").cateLevel("2").build()
                                )
                        ).build(),

                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("2").parentCateId("0").cateName("手机相机").cateLevel("1").children(
                                Arrays.asList(
                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("21").parentCateId("2").cateName("小米").cateLevel("2").build(),
                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("22").parentCateId("2").cateName("华为").cateLevel("2").build()
                                )
                        ).build(),

                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("3").parentCateId("0").cateName("海外购").cateLevel("1").children(
                                Arrays.asList(
                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("31").parentCateId("3").cateName("彩妆").cateLevel("2").build(),
                                        CategoryPageResponse.CategoryInfoDTO.builder().cateId("32").parentCateId("3").cateName("冰鲜").cateLevel("2").build()
                                )
                        ).build()

                )).build();
    }

    @PostMapping("getAttributes")
    public AttrListResponse getAttrList(@RequestBody AttrListQueryParam param) {
        System.out.println(param);
        if ("many".equals(param.getType())) {
            return AttrListResponse.builder().code(200).msg("").paramsList(Arrays.asList(
                    AttrListResponse.AttrInfoDTO.builder().attrId("1").attrName("版型").build(),
                    AttrListResponse.AttrInfoDTO.builder().attrId("2").attrName("颜色").build()
            )).build();
        } else {
            return AttrListResponse.builder().code(200).msg("").paramsList(Arrays.asList(
                    AttrListResponse.AttrInfoDTO.builder().attrId("1").attrName("显示-曲面").build(),
                    AttrListResponse.AttrInfoDTO.builder().attrId("2").attrName("系统-智能电视").build()
            )).build();
        }
    }

    @PostMapping("addAttribute")
    public BaseResponse addAttribute(@RequestBody AttrAddRequest request) {
        System.out.println(request);
        return BaseResponse.builder().code(200).msg("").build();
    }

    @PostMapping("editAttribute")
    public BaseResponse getAttribute(@RequestBody AttrEditRequest request) {
        System.out.println(request);
        return BaseResponse.builder().code(200).msg("").build();
    }

    @PostMapping("getAttribute")
    public AttrInfoResponse getAttribute(@RequestBody AttrQueryRequest request) {
        System.out.println(request);
        return AttrInfoResponse.builder().code(200).msg("").attrId("1").attrName("显示-曲面").build();
    }
}
