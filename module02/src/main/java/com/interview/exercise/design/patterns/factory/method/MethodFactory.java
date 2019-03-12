package com.interview.exercise.design.patterns.factory.method;

import com.interview.exercise.design.patterns.factory.bean.feature.HouseholdElectricalAppliances;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/10
 */
public interface MethodFactory {

    /**
     * 生产对象
     */
    HouseholdElectricalAppliances getBean();
}