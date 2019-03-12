package com.interview.exercise.design.patterns.factory.bean.feature;

public interface RefrigeratorInterface extends HouseholdElectricalAppliances {

    /**
     * 冰箱开门方式：单开，双开
     */
    void setDoor(String door);


}
