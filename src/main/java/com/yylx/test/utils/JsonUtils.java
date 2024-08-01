package com.yylx.test.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;

/**
 * @author yushouqiu
 * @date 2021-08-02
 */
public final class JsonUtils {
    private JsonUtils() {
    }

    private static final Gson GSON = MapCodec.registerAllMapType(new GsonBuilder()).create();

    public static <T> String toJson(T obj) {
        return GSON.toJson(obj);
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        return GSON.fromJson(json, clazz);
    }

    public static <T> T fromJson(String json, Type typeOfT) {
        return GSON.fromJson(json, typeOfT);
    }

    public static Map<String, String> toStringMap(String str) {
        if (StringUtils.isNotBlank(str)) {
            return new Gson().fromJson(str, new TypeToken<Map<String, String>>() {
            }.getType());
        } else {
            return Collections.emptyMap();
        }
    }

    public static Map<Integer, String> toIntegerStringMap(String str) {
        if (StringUtils.isNotBlank(str)) {
            return new Gson().fromJson(str, new TypeToken<Map<Integer, String>>() {
            }.getType());
        } else {
            return Collections.emptyMap();
        }
    }

    public static <T> Map<String, T> toMap(String str, Type typeOfT) {
        if (StringUtils.isNotBlank(str)) {
            return new Gson().fromJson(str, typeOfT);
        } else {
            return Collections.emptyMap();
        }
    }
}
