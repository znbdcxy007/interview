package com.interview.exercise.design.patterns.factory.method;

import com.interview.exercise.design.patterns.factory.bean.feature.HouseholdElectricalAppliances;
import com.interview.exercise.design.patterns.factory.bean.Washer;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/10
 */
public class WasherMethodFactoryImpl implements MethodFactory {

    @Override
    public HouseholdElectricalAppliances getBean() {
        Washer washer = new Washer();
        washer.setBrand("海尔");
        washer.setBucket("双桶洗衣机");
        return washer;
    }

}