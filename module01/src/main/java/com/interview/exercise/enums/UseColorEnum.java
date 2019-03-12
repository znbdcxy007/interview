package com.interview.exercise.enums;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/08
 */
public class UseColorEnum {
    public static void main(String[] args) {
        System.out.println(ColorEnums.RED.getName());
        System.out.println(ColorEnums.RED.getColor());

        System.out.println(ColorEnums.getEnumByName("yellow"));
        System.out.println(ColorEnums.getEnumByName("yellow").getName());
        System.out.println(ColorEnums.getEnumByName("yellow").getColor());
    }
}