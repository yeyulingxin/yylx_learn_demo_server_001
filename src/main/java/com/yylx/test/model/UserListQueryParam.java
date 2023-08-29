package com.yylx.test.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class UserListQueryParam extends PageRequest {

    private String query;
}
