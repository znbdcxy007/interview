package com.interview.exercise.design.patterns.factory.function;

import com.interview.exercise.design.patterns.factory.productor.bean.Millk;
import com.interview.exercise.design.patterns.factory.productor.bean.TeLunSu_MillkImpl;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/05
 */
public class TeLunSu_FunctionFactoryPatternImpl implements FunctionFactoryPattern {

    @Override
    public Millk getProduct() {
        return new TeLunSu_MillkImpl();
    }
}