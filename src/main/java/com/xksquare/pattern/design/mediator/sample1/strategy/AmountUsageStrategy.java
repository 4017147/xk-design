package com.xksquare.pattern.design.mediator.sample1.strategy;

import com.xksquare.pattern.design.mediator.sample1.RecommandDivided;

public interface AmountUsageStrategy {

  public boolean supportDivided(String dividedCode);


  public long cardinalAmount(RecommandDivided recommandDivided);

}
