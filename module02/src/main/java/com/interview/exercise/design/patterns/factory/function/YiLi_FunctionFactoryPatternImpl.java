package com.interview.exercise.design.patterns.factory.function;

import com.interview.exercise.design.patterns.factory.productor.bean.Millk;
import com.interview.exercise.design.patterns.factory.productor.bean.YiLi_MillkImpl;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/05
 */
public class YiLi_FunctionFactoryPatternImpl implements FunctionFactoryPattern {

    @Override
    public Millk getProduct() {
        return new YiLi_MillkImpl();
    }
}