package com.yylx.test.security;

import com.yylx.test.exception.AuthenticationException;
import com.yylx.test.model.dto.UserInfoDTO;
import com.yylx.test.utils.JwtUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthLoginFilter extends BasicAuthenticationFilter {

    private static final String HEADER_TOKEN = "Authorization";

    private JwtUtils jwtUtils;

    public AuthLoginFilter(AuthenticationManager authenticationManager, JwtUtils jwtUtils) {
        super(authenticationManager);
        this.jwtUtils = jwtUtils;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        String token = request.getHeader(HEADER_TOKEN);
        if (StringUtils.isEmpty(token)) {
            throw new AuthenticationException("当前登录状态异常");
        }
        UserInfoDTO userInfo = jwtUtils.authWithReturnUserDto(token.replace("Bearer", ""));
        SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(userInfo, null));
        super.doFilterInternal(request, response, chain);
    }
}
