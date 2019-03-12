package com.interview.exercise.design.patterns.factory.abstr;

import com.interview.exercise.design.patterns.factory.bean.AirConditioner;
import com.interview.exercise.design.patterns.factory.bean.Refrigerator;
import com.interview.exercise.design.patterns.factory.bean.Washer;
import com.interview.exercise.design.patterns.factory.bean.feature.AirConditionerInterface;
import com.interview.exercise.design.patterns.factory.bean.feature.RefrigeratorInterface;
import com.interview.exercise.design.patterns.factory.bean.feature.WasherInterface;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/12
 */
public class HaierAbstractFactoryImpl extends AbstractFactory {


    @Override
    public AirConditionerInterface productAirConditioner() {
        AirConditionerInterface airConditioner = initWork(new AirConditioner(),"海尔");
        airConditioner.setStatus("海尔立式空调");
        return airConditioner;
    }

    @Override
    public WasherInterface productWasher() {
        WasherInterface washer = initWork(new Washer(), "海尔");
        washer.setBucket("海尔二合一单桶洗衣机");
        return washer;
    }

    @Override
    public RefrigeratorInterface productRefrigerator() {
        RefrigeratorInterface refrigerator = initWork(new Refrigerator(), "海尔");
        refrigerator.setDoor("海尔双门冰箱");
        return refrigerator;
    }
}