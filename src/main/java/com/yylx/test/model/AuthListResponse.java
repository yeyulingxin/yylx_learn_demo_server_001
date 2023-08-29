package com.yylx.test.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AuthListResponse extends BaseResponse {

    private List<AuthInfo> authList;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class AuthInfo implements Serializable {

        private String authName;

        private Integer level;

        private String path;
    }
}
