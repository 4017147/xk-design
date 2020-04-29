package com.xksquare.pattern.design.decorator;

public class SugarMilkyTea implements MilkyTea {

  private MilkyTea milkyTea;

  public SugarMilkyTea(MilkyTea milkyTea) {
    super();
    this.milkyTea = milkyTea;
  }

  @Override
  public long amount() {
    // TODO Auto-generated method stub
    return milkyTea.amount() + 1;
  }

  @Override
  public void desc() {
    // TODO Auto-generated method stub
    milkyTea.desc();
    System.out.println("加糖");
  }

}
