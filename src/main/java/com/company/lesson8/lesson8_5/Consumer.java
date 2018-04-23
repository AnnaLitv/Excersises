package com.company.lesson8.lesson8_5;

@FunctionalInterface
public interface Consumer<T> {
    String convert(T str);

    default boolean isAlive(T str){
        if(str==null){
            return false;
        }else return true;
    }
}
