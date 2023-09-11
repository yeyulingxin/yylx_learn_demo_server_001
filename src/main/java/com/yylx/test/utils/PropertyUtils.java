package com.yylx.test.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

    public static final String RESOURCES_PATH = "classpath:application.properties";

    public static Properties properties;

    public static Properties readProperties(String... confFile) {
        if (properties != null) {
            return properties;
        }
        properties = new Properties();
        try {
            for (String path : confFile) {
                properties.load(PropertyUtils.class.getClassLoader().getResourceAsStream(path));
            }
        } catch (IOException e) {
            return null;
        }
        return properties;
    }
}
