package com.xksquare.pattern.design.mediator.sample1;

import java.math.BigDecimal;

import com.xksquare.pattern.design.mediator.sample1.RevenueType.DividedType;
import com.xksquare.pattern.design.mediator.sample1.visitor.DividedVisitor;

public class RecommandDivided extends DividedArticle {
  /**
  *
  */
  private static final long serialVersionUID = 1L;

  private RecommandMediator mediator;

  public RecommandDivided(Beneficiary beneficiary, DividedType.Recommend recommend,
      BigDecimal dividedRatio) {
    super(beneficiary, RevenueType.RECOMMEND, recommend, dividedRatio, recommend.currency());
  }

  public RecommandDivided bindMediator(RecommandMediator mediator) {
    this.mediator = mediator;
    return this;
  }

  @Override
  public void calculate(long cardinalMoney) {
    // TODO Auto-generated method stub
    super.calculate(cardinalMoney);
    this.mediator.hander(this);
  }

  @Override
  public long matchingAmount(long profitMoney) {
    // TODO Auto-generated method stub
    return super.matchingAmount(profitMoney);
  }

  @Override
  public void accpet(DividedVisitor dividedVisitor) {
    // TODO Auto-generated method stub
    dividedVisitor.visit(this);
  }

}
