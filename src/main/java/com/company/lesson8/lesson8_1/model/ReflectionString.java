package com.company.lesson8.lesson8_1.model;

import java.lang.reflect.Field;

public class ReflectionString {
    private String str;

    public String replace(String str1) {
        try {
            Field value = str.getClass().getDeclaredField("value");
            value.setAccessible(true);
            value.set(str,str1.toCharArray());
            return "Success!";
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return "Looser!";
        }

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
