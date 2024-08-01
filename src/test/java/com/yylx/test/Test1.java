package com.yylx.test;

import java.util.Arrays;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("2024WK11", "2024WK12", "2024WK13", "2024WK14", "2024WK15", "2024WK16", "2024WK17",
                        "2024WK18A", "2024WK18B", "2024WK19", "2024WK20", "2024WK21", "2024WK22A");
        System.out.println(list.subList(0, list.size() - 1));
    }
}
