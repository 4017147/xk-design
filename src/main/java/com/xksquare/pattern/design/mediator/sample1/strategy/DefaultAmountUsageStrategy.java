package com.xksquare.pattern.design.mediator.sample1.strategy;

import java.util.Arrays;

import com.xksquare.pattern.design.mediator.sample1.CareForDividedType;
import com.xksquare.pattern.design.mediator.sample1.RecommandDivided;
import com.xksquare.pattern.design.mediator.sample1.RevenueType.DividedType.Recommend;

public class DefaultAmountUsageStrategy implements CareForDividedType, AmountUsageStrategy {

  @Override
  public long cardinalAmount(RecommandDivided recommandDivided) {
    return recommandDivided.getCardinalMoney();
  }

  @Override
  public boolean supportDivided(String dividedCode) {
    return Arrays.asList(this.careForDividedType()).contains(dividedCode);
  }

  @Override
  public String[] careForDividedType() {
    return new String[] {Recommend.R1M.getCode(), Recommend.R1M.getCode(), Recommend.R2D.getCode(),
        Recommend.R2M.getCode(), Recommend.R3D.getCode(), Recommend.R3M.getCode()};
  }

}
