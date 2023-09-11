package com.yylx.test.utils;

import com.yylx.test.exception.AuthenticationException;
import com.yylx.test.model.dto.UserInfoDTO;
import com.yylx.test.properties.JwtProperty;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JwtUtils {

    @Autowired
    private JwtProperty jwtProperty;

    private static final String USER_ID_KEY = "userId";
    private static final String USER_NAME_KEY = "username";

    public String getToken(String userId, String username) {
        System.out.println(jwtProperty.getSecret());
        System.out.println(jwtProperty.getSecret());
        Claims claims = Jwts.claims();
        claims.put(USER_ID_KEY, userId);
        claims.put(USER_NAME_KEY, username);
        return Jwts.builder()
                .setClaims(claims)
                .setHeaderParam("typ", "JWT")
                .setHeaderParam("alg", "HS256")
                .setIssuedAt(DateTime.now().toDate())
                .setExpiration(DateTime.now().plusMinutes(jwtProperty.getExpire()).toDate())
                .signWith(SignatureAlgorithm.HS256, jwtProperty.getSecret())
                .compact();
    }

    public boolean checkToken(String token) {
        if (StringUtils.isEmpty(token)) {
            return false;
        }
        try {
            Jwts.parser().setSigningKey(jwtProperty.getSecret()).parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public UserInfoDTO authWithReturnUserDto(String token) {
        if (StringUtils.isEmpty(token)) {
            throw new AuthenticationException("认证失败");
        }
        try {
            Jws<Claims> result = Jwts.parser().setSigningKey(jwtProperty.getSecret()).parseClaimsJws(token);
            return UserInfoDTO.builder()
                    .userId(String.valueOf(result.getBody().get(USER_ID_KEY)))
                    .username(String.valueOf(result.getBody().get(USER_NAME_KEY)))
                    .build();
        } catch (Exception e) {
            throw new AuthenticationException("认证失败");
        }
    }
}
