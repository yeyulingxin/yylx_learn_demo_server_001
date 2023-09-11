package com.yylx.test.controller;

import com.yylx.test.model.LoginRequest;
import com.yylx.test.model.LoginResponse;
import com.yylx.test.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yylx9/login/")
public class LoginController {

    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        return LoginResponse.builder().token(jwtUtils.getToken("11111", loginRequest.getUsername())).code(200).msg("")
                .build();
    }
}
