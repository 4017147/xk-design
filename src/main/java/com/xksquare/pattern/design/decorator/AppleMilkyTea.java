package com.xksquare.pattern.design.decorator;

public class AppleMilkyTea implements MilkyTea {

  private MilkyTea milkyTea;

  public AppleMilkyTea(MilkyTea milkyTea) {
    super();
    this.milkyTea = milkyTea;
  }

  @Override
  public long amount() {
    // TODO Auto-generated method stub
    return milkyTea.amount() + 4;
  }

  @Override
  public void desc() {
    // TODO Auto-generated method stub
    milkyTea.desc();
    System.out.println("加入 苹果 ");
  }

}
