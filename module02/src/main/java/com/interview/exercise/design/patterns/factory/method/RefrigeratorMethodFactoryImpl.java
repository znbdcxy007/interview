package com.interview.exercise.design.patterns.factory.method;

import com.interview.exercise.design.patterns.factory.bean.feature.HouseholdElectricalAppliances;
import com.interview.exercise.design.patterns.factory.bean.Refrigerator;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/10
 */
public class RefrigeratorMethodFactoryImpl implements MethodFactory {

    @Override
    public HouseholdElectricalAppliances getBean() {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setBrand("海尔");
        refrigerator.setDoor("单门冰箱");
        return refrigerator;
    }
}