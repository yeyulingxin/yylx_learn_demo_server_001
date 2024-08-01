package com.yylx.test.utils;

import com.google.common.collect.Maps;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * 如果Map的KEY类型是对象类型, gson默认实现会用KEY的toString()方法把KEY转成String, 这样就不能再反序列化了.
 * 把Map按EntrySet的方式序列化, 并支持反序列化.
 *
 * @author yushouqiu
 * @date 2021-07-30
 */
public final class MapCodec {
    private MapCodec() {
    }

    /**
     * 在gsonBuilder中注册使用自定义Map的编解码实现.
     *
     * @param gsonBuilder
     * @return
     */
    public static GsonBuilder registerAllMapType(GsonBuilder gsonBuilder) {
        return registerType(Map.class, gsonBuilder);
    }

    /**
     * 在gsonBuilder中注册指定类型使用自定义Map的编解码实现.
     *
     * @param type 指定的Map类型. 比如: new TypeToken<Map<MyKey, String>>(){}.getType().
     * @param gsonBuilder
     * @return
     */
    public static GsonBuilder registerType(Type type, GsonBuilder gsonBuilder) {
        return gsonBuilder
                .registerTypeAdapter(type, SERIALIZER)
                .registerTypeAdapter(type, DESERIALIZER);
    }

    private static final Object DESERIALIZER = new JsonDeserializer<Map<?, ?>>() {
        @Override
        public Map<?, ?> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
                throws JsonParseException {
            ParameterizedType pt = (ParameterizedType) typeOfT;
            Type keyType = pt.getActualTypeArguments()[0];
            Type valType = pt.getActualTypeArguments()[1];

            JsonArray array = json.getAsJsonArray();
            Map<Object, Object> map = Maps.newHashMapWithExpectedSize(array.size());
            for (JsonElement entryJson : array) {
                JsonObject entry = entryJson.getAsJsonObject();
                JsonElement keyJson = entry.get("k");
                JsonElement valJson = entry.get("v");

                Object key = context.deserialize(keyJson, keyType);
                Object val = context.deserialize(valJson, valType);

                map.put(key, val);
            }
            return map;
        }
    };

    private static final Object SERIALIZER = new JsonSerializer<Map<?, ?>>() {
        @Override
        public JsonElement serialize(Map<?, ?> src, Type typeOfSrc, JsonSerializationContext context) {
            JsonArray array = new JsonArray();
            for (Map.Entry<?, ?> kv : src.entrySet()) {
                JsonElement keyJson = context.serialize(kv.getKey());
                JsonElement valJson = context.serialize(kv.getValue());

                JsonObject entry = new JsonObject();
                entry.add("k", keyJson);
                entry.add("v", valJson);

                array.add(entry);
            }
            return array;
        }
    };
}
