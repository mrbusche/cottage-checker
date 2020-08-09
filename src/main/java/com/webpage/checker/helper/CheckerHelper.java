package com.webpage.checker.helper;

public class CheckerHelper {
    public static String removeStuff(String s) {
        return s.replace("\n", "")
                .replace("\r", "")
                .replace("\t", "")
                .replaceAll("\\s", " ")
                .replaceAll(" +", " ")
                .replace("\"", "'")
                .replace(" style='color:red;'", "")
                .replace("> <", "><");
    }
}
