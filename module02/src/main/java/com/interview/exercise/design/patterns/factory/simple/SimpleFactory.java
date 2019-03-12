package com.interview.exercise.design.patterns.factory.simple;

import com.interview.exercise.design.patterns.factory.bean.AirConditioner;
import com.interview.exercise.design.patterns.factory.bean.feature.HouseholdElectricalAppliances;
import com.interview.exercise.design.patterns.factory.bean.Refrigerator;
import com.interview.exercise.design.patterns.factory.bean.Washer;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/10
 */
public class SimpleFactory {

    /**
     * 生产对应的对象。
     */
    public HouseholdElectricalAppliances getBean(String name){

        if ("washer".equals(name)) {
            Washer washer = new Washer();
            washer.setBrand("海尔");
            washer.setBucket("单桶洗衣机");
            return washer;
        }
        else if("Refrigerator".equals(name)){
            Refrigerator refrigerator = new Refrigerator();
            refrigerator.setBrand("海尔");
            refrigerator.setDoor("双门冰箱");
            return refrigerator;
        }
        else if("AirConditioner".equals(name)){
            AirConditioner airConditioner = new AirConditioner();
            airConditioner.setBrand("美的");
            airConditioner.setStatus("立式空调");
            return airConditioner;
        }else{
            return null;
        }
    }

}