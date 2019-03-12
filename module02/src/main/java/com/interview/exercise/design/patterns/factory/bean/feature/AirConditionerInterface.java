package com.interview.exercise.design.patterns.factory.bean.feature;

public interface AirConditionerInterface extends HouseholdElectricalAppliances{

    /**
     * 空调形态：立式，挂式
     */
    void setStatus(String status);

}
