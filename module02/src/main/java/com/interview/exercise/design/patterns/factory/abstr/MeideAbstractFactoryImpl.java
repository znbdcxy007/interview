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
 * @date 2019/03/10
 */
public class MeideAbstractFactoryImpl extends AbstractFactory {


    @Override
    public AirConditionerInterface productAirConditioner() {
        AirConditionerInterface airConditioner = initWork(new AirConditioner(),"美的");
        airConditioner.setStatus("美的立式空调");
        return airConditioner;
    }

    @Override
    public WasherInterface productWasher() {
        WasherInterface washer = initWork(new Washer(), "美的");
        washer.setBucket("美的二合一单桶洗衣机");
        return washer;
    }

    @Override
    public RefrigeratorInterface productRefrigerator() {
        RefrigeratorInterface refrigerator = initWork(new Refrigerator(), "美的");
        refrigerator.setDoor("美的双门冰箱");
        return refrigerator;
    }
}