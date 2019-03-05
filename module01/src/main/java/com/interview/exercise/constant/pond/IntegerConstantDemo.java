package com.interview.exercise.constant.pond;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/01
 */
public class IntegerConstantDemo {

    public static void main(String[] args) {
        intergeConstants();
    }

    /**
     * 整型常量池
     */
    private static void intergeConstants(){
        Integer i01 = 59;
        int i02 = 59;
        Integer i03 = Integer.valueOf(59);
        Integer i04 = new Integer(59);

        System.out.println(i01 == i02);
        System.out.println(i01 == i03);
        System.out.println(i03 == i04);
        System.out.println(i02 == i04);

        /**
         * ==比较：
         * 基本数据类型的==比较，比较的是数值
         * 引用类型的==比较的是对象地址值
         *
         * i01==i02:true
         * 引用类型和基本数据类型的==比较，会有java会游一个拆箱操作，
         * 就是将引用数据类型拆成基本数据类型，然后和基本数据类型进行数值比较
         * 这里会把i01这个引用数据类型拆箱成基本数据类型[i01.intValue()结果是59],然后和59比较为true
         *
         * i01==i03：true
         * Integer i01=59底层使用的就是Integer i01=Integer.value(59)
         * 当.valueOf(num)中num在Integer常量池范围内[byte：-128-127]，返回常量池中的对象地址，
         * 否则就会返回堆中new 出的对象的地址
         * 因为59是在byte范围内，所以结果为true
         *
         * i03==i04：false
         * 因为i04是new的对象，所以俩个对象地址不同，所以false
         *
         * i02==i04
         * 这里也是一个拆箱操作，所以结果值相等，
         */

        Integer i05 = new Integer(0);
        Integer i06 = new Integer(59);

        System.out.println(i06 == i05 + i04);
        /**
         * 因为i05+i04是在栈内存中操作的，会对封装类进行拆箱操作，
         * 所以本质还是基本数据类型的比较
         */

    }
}