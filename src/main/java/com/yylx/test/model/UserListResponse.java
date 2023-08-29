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
public class UserListResponse extends BaseResponse {

    private Long total;

    private Long pageNum;

    private Long pageSize;

    private List<UserInfoDTO> userList;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class UserInfoDTO implements Serializable {

        private String userId;

        private String userName;

        private Boolean userStatus;

        private String roleId;

        private String roleName;
    }
}
