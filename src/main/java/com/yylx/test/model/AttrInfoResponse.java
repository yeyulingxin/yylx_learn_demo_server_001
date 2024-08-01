package com.yylx.test.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class AttrInfoResponse extends BaseResponse {

    private String attrId;

    private String attrName;

}
