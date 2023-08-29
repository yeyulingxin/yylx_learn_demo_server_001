package com.yylx.test.controller;

import com.yylx.test.model.CategoryTreeResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/yylx9/home/")
public class HomeController {

    @PostMapping("menu")
    public CategoryTreeResponse getCategoryTree() {
        List<CategoryTreeResponse.CategoryTreeItem> itemList = new ArrayList<>();
        List<CategoryTreeResponse.CategoryTreeItem> userSubList = new ArrayList<>();
        userSubList.add(CategoryTreeResponse.CategoryTreeItem.builder()
                .categoryId(11L).categoryName("用户列表").categoryPath("userList").build());
        itemList.add(CategoryTreeResponse.CategoryTreeItem.builder()
                .categoryId(1L).categoryName("用户管理").categoryPath("userManage").childCategoryList(userSubList).build());
        List<CategoryTreeResponse.CategoryTreeItem> authSubList = new ArrayList<>();
        authSubList.add(CategoryTreeResponse.CategoryTreeItem.builder()
                .categoryId(21L).categoryName("角色列表").categoryPath("roleList").build());
        authSubList.add(CategoryTreeResponse.CategoryTreeItem.builder()
                .categoryId(22L).categoryName("权限列表").categoryPath("authList").build());
        itemList.add(CategoryTreeResponse.CategoryTreeItem.builder()
                .categoryId(2L).categoryName("权限管理").categoryPath("authManage").childCategoryList(authSubList).build());
        List<CategoryTreeResponse.CategoryTreeItem> goodsSubList = new ArrayList<>();
        goodsSubList.add(CategoryTreeResponse.CategoryTreeItem.builder()
                .categoryId(31L).categoryName("商品列表").categoryPath("goodsList").build());
        goodsSubList.add(CategoryTreeResponse.CategoryTreeItem.builder()
                .categoryId(32L).categoryName("分类参数").categoryPath("categoryParam").build());
        goodsSubList.add(CategoryTreeResponse.CategoryTreeItem.builder()
                .categoryId(33L).categoryName("商品分类").categoryPath("goodsCategory").build());
        itemList.add(CategoryTreeResponse.CategoryTreeItem.builder()
                .categoryId(3L).categoryName("商品管理").categoryPath("goodsManage").childCategoryList(goodsSubList).build());
        return CategoryTreeResponse.builder().categoryList(itemList).code(200).msg("").build();
    }
}
