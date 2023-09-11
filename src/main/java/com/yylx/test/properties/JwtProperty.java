package com.yylx.test.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class JwtProperty {

    @Value("${jwt.secret.key}")
    private String secret;

    @Value("${jwt.token.expire}")
    private Integer expire;
}
