package com.interview.exercise.test.design.patterns.factory;

import com.interview.exercise.design.patterns.factory.abstr.AbstractFactory;
import com.interview.exercise.design.patterns.factory.abstr.MeideAbstractFactoryImpl;
import com.interview.exercise.design.patterns.factory.method.AirConditionerMethodFactoryImpl;
import com.interview.exercise.design.patterns.factory.method.MethodFactory;
import com.interview.exercise.design.patterns.factory.method.RefrigeratorMethodFactoryImpl;
import com.interview.exercise.design.patterns.factory.method.WasherMethodFactoryImpl;
import com.interview.exercise.design.patterns.factory.bean.feature.HouseholdElectricalAppliances;
import com.interview.exercise.design.patterns.factory.simple.SimpleFactory;
import org.junit.Test;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/10
 */
public class FactoryTest {

    /**
     * 简单工厂模式
     * 这种方式违反了设计原则中的开闭原则。
     */
    @Test
    public void testSimple(){
        /**
         * 工厂对象
         */
        SimpleFactory simplePattern = new SimpleFactory();

        /**
         * 通过工厂对象得到目标对象：要知道产品型号，不同产品型号对应不同产品
         */
        HouseholdElectricalAppliances washer = simplePattern.getBean("washer");
        HouseholdElectricalAppliances refrigerator = simplePattern.getBean("Refrigerator");
        HouseholdElectricalAppliances airConditioner = simplePattern.getBean("AirConditioner");

        /**
         * 使用目标对象
         */
        washer.doWork();
        refrigerator.doWork();
        airConditioner.doWork();
    }

    /**
     * 工厂方法模式
     * 这中方式扩展性很好，但会导致有大量的工厂类，用户的使用成本增加
     */
    @Test
    public void testMethod(){
        /**
         * 得到对应的工厂：生产洗衣机的工厂，生产冰箱的工厂，生产空调的工厂：要知道什么产品由什么工厂创建
         * 通过通常创建对象，
         * 使用对象
         */
        MethodFactory washerMethodFactory = new WasherMethodFactoryImpl();
        HouseholdElectricalAppliances washer = washerMethodFactory.getBean();
        washer.doWork();

        MethodFactory refrigeratorMethodFactory = new RefrigeratorMethodFactoryImpl();
        HouseholdElectricalAppliances refrigerator = refrigeratorMethodFactory.getBean();
        refrigerator.doWork();

        MethodFactory airConditionerMethodFactory = new AirConditionerMethodFactoryImpl();
        HouseholdElectricalAppliances airConditioner = airConditionerMethodFactory.getBean();
        airConditioner.doWork();
    }

    @Test
    public void testAbstract(){
        /**
         * 得到工厂：这个工厂可以生产你需要的所有产品
         * 破坏开闭原则
         */
        AbstractFactory abstractFactory = new MeideAbstractFactoryImpl();

        /**
         * 得到产品
         */
        HouseholdElectricalAppliances airConditioner = abstractFactory.productAirConditioner();
        HouseholdElectricalAppliances refrigerator = abstractFactory.productRefrigerator();
        HouseholdElectricalAppliances washer = abstractFactory.productWasher();

        airConditioner.doWork();
        refrigerator.doWork();
        washer.doWork();
    }

}