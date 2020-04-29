package com.xksquare.pattern.design.mediator.sample1.visitor;

import com.xksquare.pattern.design.mediator.sample1.Divided;

public class RecommandDividedVisitor implements DividedVisitor {

  public long profitMoney;

  public RecommandDividedVisitor(long profitMoney) {
    super();
    this.profitMoney = profitMoney;
    System.out.println("init profitMoney:" + profitMoney);
  }

  @Override
  public void visit(Divided divided) {
    this.profitMoney = divided.matchingAmount(this.profitMoney);
    System.out.println("profitMoney:" + profitMoney);
  }

}
