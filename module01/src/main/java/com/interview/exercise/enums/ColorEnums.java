package com.interview.exercise.enums;

/**
 * @author chenpeiqiang
 * @describtion 枚举多用在switch语句中。
 * @date 2019/03/08
 */
public enum ColorEnums {
    RED("red","红色"),
    GREEN("green","绿色"),
    YELLOW("yellow","黄色");

    /**
     * 颜色名称：枚举中的属性name
     */
    private String name;

    /**
     * 颜色：枚举中的属性color
     */
    private String color;

    /**
     * 私有构造:给上面创建这些枚举类使用的，RED("red","红色"),
     * @param name
     * @param color
     */
    private ColorEnums(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /**
     * 获取颜色名称
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 获取颜色
     * @return
     */
    public String getColor() {
        return color;
    }


    /**
     * 根据key获取枚举类
     */
    public static ColorEnums getEnumByName(String name){
        if (name == null) {
            return null;
        }
        for (ColorEnums colorEnums:ColorEnums.values()){
            if (colorEnums.getName().equals(name)) {
                return colorEnums;
            }
        }
        return null;
    }
}