package com.yylx.test.security;

import com.yylx.test.model.BaseResponse;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthLoginEnterPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {
        response.setContentType("application/json;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(GsonBuilderUtils.gsonBuilderWithBase64EncodedByteArrays().create()
                .toJson(BaseResponse.builder().code(500).msg("当前登录状态异常").build())
                .getBytes(StandardCharsets.UTF_8));
        outputStream.flush();
        outputStream.close();
    }
}
