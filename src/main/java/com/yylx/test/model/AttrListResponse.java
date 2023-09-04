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
public class AttrListResponse extends BaseResponse {

    private List<AttrInfoDTO> paramsList;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class AttrInfoDTO implements Serializable {

        private String attrId;

        private String attrName;
    }
}
