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
public class RoleListResponse extends BaseResponse {

    private List<RoleInfo> roleList;

    private List<AuthDTO> rightList;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class RoleInfo implements Serializable {
        private String roleId;

        private String roleName;

        private String roleDesc;

        private List<AuthDTO> authDTOList;

    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class AuthDTO implements Serializable {

        private String authId;

        private String authName;

        private Integer level;

        private String path;

        private List<AuthDTO> children;
    }
}
