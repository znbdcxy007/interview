package com.interview.exercise.design.patterns.factory.method;

import com.interview.exercise.design.patterns.factory.bean.AirConditioner;
import com.interview.exercise.design.patterns.factory.bean.feature.HouseholdElectricalAppliances;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/10
 */
public class AirConditionerMethodFactoryImpl implements MethodFactory {

    @Override
    public HouseholdElectricalAppliances getBean() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.setBrand("美的");
        airConditioner.setStatus("挂式空调！");
        return airConditioner;
    }
}