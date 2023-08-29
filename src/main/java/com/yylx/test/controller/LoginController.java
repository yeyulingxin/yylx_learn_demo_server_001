package com.yylx.test.controller;

import com.yylx.test.model.LoginRequest;
import com.yylx.test.model.LoginResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yylx9/login/")
public class LoginController {

    @PostMapping("login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        return LoginResponse.builder().username("test").password("test123").code(200).msg("").build();
    }
}
