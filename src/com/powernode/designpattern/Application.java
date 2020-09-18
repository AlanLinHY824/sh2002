package com.powernode.designpattern;

import java.lang.reflect.Field;

/**
 * @Author AlanLin
 * @Description
 * @Date 2020/9/15
 * 测试类
 */
public class Application {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<String> stringClass = String.class;
        Field hash = stringClass.getDeclaredField("hash");
        Class<?> type = hash.getType();
        int modifiers = hash.getModifiers();
        System.out.println(type);
    }
}
