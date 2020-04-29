package com.xksquare.pattern.design.mediator.sample1.responsibility;

import java.util.List;

import com.xksquare.pattern.design.mediator.sample1.RecommandDivided;
import com.xksquare.pattern.design.mediator.sample1.strategy.AmountUsageStrategy;

public class DefaultDividedProcess extends AbstractDividedProcess {

  private String[] careForDividedType;


  private List<AmountUsageStrategy> amountUsageStrategies;


  private String currentDividedType;

  public DefaultDividedProcess(List<AmountUsageStrategy> amountUsageStrategies,
      String[] careForDividedType, String currentDividedType) {
    super();
    this.amountUsageStrategies = amountUsageStrategies;
    this.careForDividedType = careForDividedType;
    this.currentDividedType = currentDividedType;
  }


  @Override
  public void doProcess(RecommandDivided current, List<RecommandDivided> divideds,
      DividedPorcessChain chain) {
    super.handler(current, divideds);
    chain.doDividedProcess(current, divideds);
  }


  @Override
  public String[] careForDividedType() {
    // TODO Auto-generated method stub
    return this.careForDividedType;
  }


  @Override
  public List<AmountUsageStrategy> amountUsageStrategies() {
    // TODO Auto-generated method stub
    return this.amountUsageStrategies;
  }


  @Override
  public String currentDividedType() {
    // TODO Auto-generated method stub
    return this.currentDividedType;
  }

}
