package com.yylx.test.controller;

import com.yylx.test.model.BaseResponse;
import com.yylx.test.model.UserAddRequest;
import com.yylx.test.model.UserDeleteRequest;
import com.yylx.test.model.UserEditRequest;
import com.yylx.test.model.UserInfoQueryRequest;
import com.yylx.test.model.UserInfoResponse;
import com.yylx.test.model.UserListQueryParam;
import com.yylx.test.model.UserPageResponse;
import com.yylx.test.model.UserUpdateStatusRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/yylx9/user/")
public class UserController {

    @PostMapping("getUserList")
    public UserPageResponse getCategoryTree(@RequestBody UserListQueryParam request) {
        UserPageResponse.UserInfoDTO user1 =
                UserPageResponse.UserInfoDTO.builder().userId("1").userName("用户1").userStatus(true).roleName("主管").build();
        UserPageResponse.UserInfoDTO user2 =
                UserPageResponse.UserInfoDTO.builder().userId("2").userName("用户2").userStatus(false).roleName("主管").build();
        return UserPageResponse.builder().total(20L).code(200).pageNum(request.getPageNum()).pageSize(request.getPageSize()).msg("")
                .userList(Arrays.asList(user1, user2)).build();
    }

    @PostMapping("addUser")
    public BaseResponse addUser(@RequestBody UserAddRequest request) {
        System.out.println(request);
        return BaseResponse.builder().code(200).msg("").build();
    }

    @PostMapping("updateUserStatus")
    public BaseResponse addUser(@RequestBody UserUpdateStatusRequest request) {
        System.out.println(request);
        return BaseResponse.builder().code(200).msg("").build();
    }

    @PostMapping("getUserInfo")
    public UserInfoResponse getUserInfo(@RequestBody UserInfoQueryRequest request) {
        System.out.println(request);
        return UserInfoResponse.builder().code(200).msg("").userId("1").username("用户1").mobile("18511761912").email(
                "12345@qq.com").build();
    }

    @PostMapping("editUser")
    public BaseResponse editUser(@RequestBody UserEditRequest request) {
        System.out.println(request);
        return BaseResponse.builder().code(200).msg("").build();
    }

    @PostMapping("deleteUser")
    public BaseResponse deleteUser(@RequestBody UserDeleteRequest request) {
        System.out.println(request);
        return BaseResponse.builder().code(200).msg("").build();
    }
}
