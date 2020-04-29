package com.xksquare.pattern.design.mediator.sample1.factory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.xksquare.pattern.design.mediator.sample1.Beneficiary;
import com.xksquare.pattern.design.mediator.sample1.RecommandDivided;
import com.xksquare.pattern.design.mediator.sample1.RevenueType.DividedType;

public class RecommendDividedFactory {

  private List<RecommandDivided> list = new ArrayList<>();

  public RecommandDivided buildRecommendDivided(Beneficiary beneficiary,
      DividedType.Recommend recommend, BigDecimal dividedRatio) {
    RecommandDivided divided = new RecommandDivided(beneficiary, recommend, dividedRatio);
    list.add(divided);
    return divided;
  }

  public List<RecommandDivided> recommandDivideds() {
    return this.list;
  }


}
