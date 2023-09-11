package com.yylx.test.utils;

import com.yylx.test.model.dto.UserInfoDTO;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {

    public static UserInfoDTO getUserInfo() {
        return (UserInfoDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
