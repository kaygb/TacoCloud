package com.kaygb.tacocloud.entity;


import lombok.Data;
import lombok.RequiredArgsConstructor;



@Data
@RequiredArgsConstructor  // 生成所有以final属性作为参数的构造器
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type{
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
    }
}
