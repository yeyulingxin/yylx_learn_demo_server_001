package com.yylx.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserInfoResponse extends BaseResponse {

    private String userId;

    private String username;

    private String mobile;

    private String email;
}
