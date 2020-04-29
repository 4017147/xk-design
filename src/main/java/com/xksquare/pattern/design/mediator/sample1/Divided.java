package com.xksquare.pattern.design.mediator.sample1;

import com.xksquare.pattern.design.mediator.sample1.visitor.DividedVisitor;

public interface Divided {

    /**
     * 计算分成
     */
    void calculate(long cardinalMoney);

    /**
     * 匹配最终分成
     */
    long matchingAmount(long profitMoney);
    
    
    void accpet(DividedVisitor dividedVisitor);
}
