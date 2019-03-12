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
public class GeliAbstractFactoryImpl extends AbstractFactory {


    @Override
    public AirConditionerInterface productAirConditioner() {
        AirConditionerInterface airConditioner = initWork(new AirConditioner(),"格力");
        airConditioner.setStatus("格力立式空调");
        return airConditioner;
    }

    @Override
    public WasherInterface productWasher() {
        WasherInterface washer = initWork(new Washer(), "格力");
        washer.setBucket("格力二合一单桶洗衣机");
        return washer;
    }

    @Override
    public RefrigeratorInterface productRefrigerator() {
        RefrigeratorInterface refrigerator = initWork(new Refrigerator(), "格力");
        refrigerator.setDoor("格力双门冰箱");
        return refrigerator;
    }
}