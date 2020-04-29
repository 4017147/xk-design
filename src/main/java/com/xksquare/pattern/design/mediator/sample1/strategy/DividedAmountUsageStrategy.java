package com.xksquare.pattern.design.mediator.sample1.strategy;

import java.util.Arrays;

import com.xksquare.pattern.design.mediator.sample1.CareForDividedType;
import com.xksquare.pattern.design.mediator.sample1.RecommandDivided;
import com.xksquare.pattern.design.mediator.sample1.RevenueType.DividedType.Recommend;

public class DividedAmountUsageStrategy implements CareForDividedType, AmountUsageStrategy {

  @Override
  public long cardinalAmount(RecommandDivided recommandDivided) {
    return recommandDivided.getDividedAmount();
  }

  @Override
  public boolean supportDivided(String dividedCode) {
    return Arrays.asList(this.careForDividedType()).contains(dividedCode);
  }

  @Override
  public String[] careForDividedType() {
    return new String[] {Recommend.RPAMD1.getCode(), Recommend.RPAMM1.getCode()};
  }

}
