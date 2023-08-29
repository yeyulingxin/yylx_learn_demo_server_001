package com.yylx.test.controller;

import com.yylx.test.model.TestContentQueryParam;
import com.yylx.test.model.TestContentResult;
import com.yylx.test.model.TestResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/test/")
public class TestController {

    @PostMapping("getUserName")
    public TestResult getUserName(Integer id) {
        TestResult result = new TestResult();
        result.setId(id);
        result.setName("夜雨铃心");
        return result;
    }

    @PostMapping("getContentList")
    public List<TestContentResult> getContentList(@RequestBody TestContentQueryParam param) {
        if (param.getPageIndex() > 5) {
            return new ArrayList<>();
        }
        List<TestContentResult> resultList = new ArrayList<>();
        for (int i = 0; i < param.getPageSize(); i++) {
            resultList.add(generateResult(0, i + 1, param.getPageSize(), param.getPageIndex()));
        }
        return resultList;
    }

    private TestContentResult generateResult(Integer isTop, Integer i, Integer size, Integer page) {
        TestContentResult r1 = new TestContentResult();
        r1.setId((page - 1) * size + i);
        r1.setArtId("1111");
        r1.setTitle(page + "文章文章文章文章文章文章文章文章");
        r1.setAutId("10000");
        r1.setPubDate("2022-01-02 00:00:00");
        r1.setAutName("夜雨铃心");
        r1.setIsTop(isTop);
        r1.setCommCount("200");
        TestContentResult.TestCover testCover = new TestContentResult.TestCover();
        testCover.setType(3);
        testCover.setImages(Arrays.asList(
                "http://e.hiphotos.baidu.com/image/pic/item/a1ec08fa513d2697e542494057fbb2fb4316d81e.jpg",
                "http://c.hiphotos.baidu.com/image/pic/item/30adcbef76094b36de8a2fe5a1cc7cd98d109d99.jpg",
                "http://h.hiphotos.baidu.com/image/pic/item/7c1ed21b0ef41bd5f2c2a9e953da81cb39db3d1d.jpg"

        ));
        r1.setCover(testCover);
        return r1;
    }
}
