package com.company.lesson3.lesson3_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class EnumExample<E extends EnumExample<E>> {
    private final String name;
    private final int ordinal;
    private static int count;
    private static HashMap<String,EnumExample> map = new HashMap<>();

    private EnumExample(String name){
        this.name=name;
        this.ordinal=count++;
        map.put(name,this);
    }

    public static EnumExample RED = new EnumExample("RED");
    public static EnumExample ORANGE = new EnumExample("ORANGE");
    public static EnumExample YELLOW = new EnumExample("YELLOW");
    public static EnumExample GREEN = new EnumExample("GREEN");
    public static EnumExample SKYBLUE = new EnumExample("SKYBLUE");
    public static EnumExample BLUE = new EnumExample("BLUE");
    public static EnumExample  PURPLE= new EnumExample("PURPLE");

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
