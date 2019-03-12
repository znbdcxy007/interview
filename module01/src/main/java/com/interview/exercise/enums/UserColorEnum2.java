package com.interview.exercise.enums;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/12
 */
public class UserColorEnum2 {

    public static void main( String[] args ){
        ColorEnums color = ColorEnums.RED;
        int count = 10;
        while (count-->0){
            switch (color){
                case RED:
                    System.out.println("红色");
                    color = ColorEnums.GREEN;
                    break;
                case GREEN:
                    System.out.println("绿色");
                    color = ColorEnums.YELLOW;
                    break;
                case YELLOW:
                    System.out.println("黄色");
                    color = ColorEnums.RED;
                    break;
            }
        }
    }
}