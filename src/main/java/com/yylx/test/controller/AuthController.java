package com.yylx.test.controller;

import com.yylx.test.model.AuthListResponse;
import com.yylx.test.model.RoleListResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/yylx9/auth/")
public class AuthController {

    @PostMapping("getAuthList")
    public AuthListResponse getAuthList() {
        AuthListResponse.AuthInfo auth1 =
                AuthListResponse.AuthInfo.builder().authName("用户管理").level(0).path("users").build();
        AuthListResponse.AuthInfo auth2 =
                AuthListResponse.AuthInfo.builder().authName("商品管理").level(1).path("goods").build();
        AuthListResponse.AuthInfo auth3 =
                AuthListResponse.AuthInfo.builder().authName("订单管理").level(2).path("orders").build();
        return AuthListResponse.builder().code(200).msg("").authList(Arrays.asList(auth1, auth2, auth3)).build();
    }

    @PostMapping("getRightList")
    public RoleListResponse getRightList() {
        return RoleListResponse.builder().code(200).msg("")
                .rightList(Arrays.asList(
                        RoleListResponse.AuthDTO.builder().authId("11").authName("商品管理").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("111").authName("商品列表").level(0).path("").children(Arrays.asList(
                                                RoleListResponse.AuthDTO.builder().authId("1111").authName("商品添加").level(0).path("").build(),
                                                RoleListResponse.AuthDTO.builder().authId("1112").authName("商品修改").level(0).path("").build(),
                                                RoleListResponse.AuthDTO.builder().authId("1113").authName("商品删除").level(0).path("").build()
                                        )
                                ).build(),
                                RoleListResponse.AuthDTO.builder().authId("112").authName("商品属性").level(0).path("").children(Arrays.asList(
                                        RoleListResponse.AuthDTO.builder().authId("1121").authName("商品明细").level(0).path("").build(),
                                        RoleListResponse.AuthDTO.builder().authId("1122").authName("商品价格").level(0).path("").build(),
                                        RoleListResponse.AuthDTO.builder().authId("1123").authName("商品重量").level(0).path("").build()
                                )).build()
                        )).build(),
                        RoleListResponse.AuthDTO.builder().authId("12").authName("订单管理").level(1).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("121").authName("订单列表").level(0).path("").children(Arrays.asList(
                                        RoleListResponse.AuthDTO.builder().authId("1211").authName("订单添加").level(0).path("").build(),
                                        RoleListResponse.AuthDTO.builder().authId("1212").authName("订单修改").level(0).path("").build(),
                                        RoleListResponse.AuthDTO.builder().authId("1213").authName("订单删除").level(0).path("").build()
                                )).build(),
                                RoleListResponse.AuthDTO.builder().authId("122").authName("订单属性").level(0).path("").children(Arrays.asList(
                                        RoleListResponse.AuthDTO.builder().authId("1221").authName("订单明细").level(0).path("").build(),
                                        RoleListResponse.AuthDTO.builder().authId("1222").authName("订单价格").level(0).path("").build(),
                                        RoleListResponse.AuthDTO.builder().authId("1223").authName("订单时效").level(0).path("").build()
                                )).build()
                        )).build(),
                        RoleListResponse.AuthDTO.builder().authId("13").authName("权限管理").level(2).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("131").authName("权限列表").level(0).path("").children(Arrays.asList(
                                        RoleListResponse.AuthDTO.builder().authId("1311").authName("权限添加").level(0).path("").build(),
                                        RoleListResponse.AuthDTO.builder().authId("1312").authName("权限修改").level(0).path("").build(),
                                        RoleListResponse.AuthDTO.builder().authId("1313").authName("权限删除").level(0).path("").build()
                                )).build(),
                                RoleListResponse.AuthDTO.builder().authId("132").authName("角色列表").level(0).path("").children(Arrays.asList(
                                        RoleListResponse.AuthDTO.builder().authId("1321").authName("角色添加").level(0).path("").build(),
                                        RoleListResponse.AuthDTO.builder().authId("1322").authName("角色修改").level(0).path("").build(),
                                        RoleListResponse.AuthDTO.builder().authId("1323").authName("角色删除").level(0).path("").build()
                                )).build()
                        )).build()
                ))
                .build();
    }

    @PostMapping("getRoleList")
    public RoleListResponse getRoleList() {
        RoleListResponse.RoleInfo role1 = RoleListResponse.RoleInfo.builder().roleId("1").roleName("管理员").roleDesc(
                "管理员desc").authDTOList(Arrays.asList(
                RoleListResponse.AuthDTO.builder().authId("11").authName("商品管理").level(0).path("").children(Arrays.asList(
                        RoleListResponse.AuthDTO.builder().authId("111").authName("商品列表").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("1111").authName("商品添加").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("1112").authName("商品修改").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("1113").authName("商品删除").level(0).path("").build()
                                )
                        ).build(),
                        RoleListResponse.AuthDTO.builder().authId("112").authName("商品属性").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("1121").authName("商品明细").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("1122").authName("商品价格").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("1123").authName("商品重量").level(0).path("").build()
                        )).build()
                )).build(),
                RoleListResponse.AuthDTO.builder().authId("12").authName("订单管理").level(1).path("").children(Arrays.asList(
                        RoleListResponse.AuthDTO.builder().authId("121").authName("订单列表").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("1211").authName("订单添加").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("1212").authName("订单修改").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("1213").authName("订单删除").level(0).path("").build()
                        )).build(),
                        RoleListResponse.AuthDTO.builder().authId("122").authName("订单属性").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("1221").authName("订单明细").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("1222").authName("订单价格").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("1223").authName("订单时效").level(0).path("").build()
                        )).build()
                )).build(),
                RoleListResponse.AuthDTO.builder().authId("13").authName("权限管理").level(2).path("").children(Arrays.asList(
                        RoleListResponse.AuthDTO.builder().authId("131").authName("权限列表").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("1311").authName("权限添加").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("1312").authName("权限修改").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("1313").authName("权限删除").level(0).path("").build()
                        )).build(),
                        RoleListResponse.AuthDTO.builder().authId("132").authName("角色列表").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("1321").authName("角色添加").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("1322").authName("角色修改").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("1323").authName("角色删除").level(0).path("").build()
                        )).build()
                )).build()
        )).build();
        RoleListResponse.RoleInfo role2 = RoleListResponse.RoleInfo.builder().roleId("2").roleName("渠道管理员").roleDesc(
                "渠道管理员desc").authDTOList(Arrays.asList(
                RoleListResponse.AuthDTO.builder().authId("21").authName("商品管理").level(0).path("").children(Arrays.asList(
                        RoleListResponse.AuthDTO.builder().authId("211").authName("商品列表").level(0).path("").children(Arrays.asList(
                                        RoleListResponse.AuthDTO.builder().authId("2111").authName("商品添加").level(0).path("").build(),
                                        RoleListResponse.AuthDTO.builder().authId("2112").authName("商品修改").level(0).path("").build(),
                                        RoleListResponse.AuthDTO.builder().authId("2113").authName("商品删除").level(0).path("").build()
                                )
                        ).build(),
                        RoleListResponse.AuthDTO.builder().authId("212").authName("商品属性").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("2121").authName("商品明细").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("2122").authName("商品价格").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("2123").authName("商品重量").level(0).path("").build()
                        )).build()
                )).build(),
                RoleListResponse.AuthDTO.builder().authId("22").authName("订单管理").level(1).path("").children(Arrays.asList(
                        RoleListResponse.AuthDTO.builder().authId("221").authName("订单列表").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("2211").authName("订单添加").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("2212").authName("订单修改").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("2213").authName("订单删除").level(0).path("").build()
                        )).build(),
                        RoleListResponse.AuthDTO.builder().authId("222").authName("订单属性").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("2221").authName("订单明细").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("2222").authName("订单价格").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("2223").authName("订单时效").level(0).path("").build()
                        )).build()
                )).build(),
                RoleListResponse.AuthDTO.builder().authId("23").authName("权限管理").level(2).path("").children(Arrays.asList(
                        RoleListResponse.AuthDTO.builder().authId("231").authName("权限列表").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("2311").authName("权限添加").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("2312").authName("权限修改").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("2313").authName("权限删除").level(0).path("").build()
                        )).build(),
                        RoleListResponse.AuthDTO.builder().authId("232").authName("角色列表").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("2321").authName("角色添加").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("2322").authName("角色修改").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("2323").authName("角色删除").level(0).path("").build()
                        )).build()
                )).build()
        )).build();
        RoleListResponse.RoleInfo role3 = RoleListResponse.RoleInfo.builder().roleId("3").roleName("商品管理员").roleDesc(
                "渠道管理员desc").authDTOList(Arrays.asList(
                RoleListResponse.AuthDTO.builder().authId("31").authName("商品管理").level(0).path("").children(Arrays.asList(
                        RoleListResponse.AuthDTO.builder().authId("311").authName("商品列表").level(0).path("").children(Arrays.asList(
                                        RoleListResponse.AuthDTO.builder().authId("3111").authName("商品添加").level(0).path("").build(),
                                        RoleListResponse.AuthDTO.builder().authId("3112").authName("商品修改").level(0).path("").build(),
                                        RoleListResponse.AuthDTO.builder().authId("3113").authName("商品删除").level(0).path("").build()
                                )
                        ).build(),
                        RoleListResponse.AuthDTO.builder().authId("312").authName("商品属性").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("3121").authName("商品明细").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("3122").authName("商品价格").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("3123").authName("商品重量").level(0).path("").build()
                        )).build()
                )).build(),
                RoleListResponse.AuthDTO.builder().authId("32").authName("订单管理").level(1).path("").children(Arrays.asList(
                        RoleListResponse.AuthDTO.builder().authId("321").authName("订单列表").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("3211").authName("订单添加").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("3212").authName("订单修改").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("3213").authName("订单删除").level(0).path("").build()
                        )).build(),
                        RoleListResponse.AuthDTO.builder().authId("322").authName("订单属性").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("3221").authName("订单明细").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("3222").authName("订单价格").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("3223").authName("订单时效").level(0).path("").build()
                        )).build()
                )).build(),
                RoleListResponse.AuthDTO.builder().authId("33").authName("权限管理").level(2).path("").children(Arrays.asList(
                        RoleListResponse.AuthDTO.builder().authId("331").authName("权限列表").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("3311").authName("权限添加").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("3312").authName("权限修改").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("3313").authName("权限删除").level(0).path("").build()
                        )).build(),
                        RoleListResponse.AuthDTO.builder().authId("332").authName("角色列表").level(0).path("").children(Arrays.asList(
                                RoleListResponse.AuthDTO.builder().authId("3321").authName("角色添加").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("3322").authName("角色修改").level(0).path("").build(),
                                RoleListResponse.AuthDTO.builder().authId("3323").authName("角色删除").level(0).path("").build()
                        )).build()
                )).build()
        )).build();
        return RoleListResponse.builder().code(200).msg("")
                .roleList(Arrays.asList(role1, role2, role3))
                .build();
    }
}
