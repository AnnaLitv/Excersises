package com.company.lesson3.lesson3_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class EnumExample<E extends EnumExample<E>> {
    private final String name;
    private final int ordinal;
    private static HashMap<String,EnumExample> map = new HashMap<>();

    private EnumExample(String name, int ordinal){
        this.name=name;
        this.ordinal=ordinal;
        map.put(name,this);
    }

    public static EnumExample RED = new EnumExample("RED",1);
    public static EnumExample ORANGE = new EnumExample("ORANGE",2);
    public static EnumExample YELLOW = new EnumExample("YELLOW",3);
    public static EnumExample GREEN = new EnumExample("GREEN",4);
    public static EnumExample SKYBLUE = new EnumExample("SKYBLUE",5);
    public static EnumExample BLUE = new EnumExample("BLUE",6);
    public static EnumExample  PURPLE= new EnumExample("PURPLE",7);

    public final String getName() {
        return name;
    }

    public final int getOrdinal() {
        return ordinal;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public final boolean equals(Object other) {
        return this == other;
    }
    @Override
    public final int hashCode() {
        return ordinal + (name == null ? 0 : name.hashCode());
    }

    public static EnumExample valueOf(String name) {
        if (name == null) {
            throw new NullPointerException("name == null");
        }
      return map.get(name);
    }


    public final int compareTo(EnumExample o) {
        return ordinal - o.ordinal;
    }
}
