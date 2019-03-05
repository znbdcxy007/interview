package com.interview.exercise.design.patterns.factory.function;

import com.interview.exercise.design.patterns.factory.productor.bean.MengNiu_MillkImpl;
import com.interview.exercise.design.patterns.factory.productor.bean.Millk;

/**
 * @describtion
 * @author chenpeiqiang
 * @date 2019/03/05
 */
public class MengNiu_FunctionFactoryPatternImpl implements FunctionFactoryPattern {

    @Override
    public Millk getProduct() {
        return new MengNiu_MillkImpl();
    }
}