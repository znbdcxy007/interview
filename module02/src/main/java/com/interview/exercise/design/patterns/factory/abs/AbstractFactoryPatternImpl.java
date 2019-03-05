package com.interview.exercise.design.patterns.factory.abs;

import com.interview.exercise.design.patterns.factory.productor.bean.MengNiu_MillkImpl;
import com.interview.exercise.design.patterns.factory.productor.bean.Millk;
import com.interview.exercise.design.patterns.factory.productor.bean.TeLunSu_MillkImpl;
import com.interview.exercise.design.patterns.factory.productor.bean.YiLi_MillkImpl;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/05
 */
public class AbstractFactoryPatternImpl extends AbstractFactoryPattern {

    @Override
    public Millk mengNiu() {
        return new MengNiu_MillkImpl();
    }

    @Override
    public Millk yiLi() {
        return new YiLi_MillkImpl();
    }

    @Override
    public Millk teLunSu() {
        return new TeLunSu_MillkImpl();
    }
}