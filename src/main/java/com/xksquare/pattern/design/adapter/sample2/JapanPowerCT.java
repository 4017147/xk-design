package com.xksquare.pattern.design.adapter.sample2;

public class JapanPowerCT implements Adapter5V {

  private static final int voltage = 110;

  @Override
  public boolean support(CT ct) {
    // TODO Auto-generated method stub
    return (voltage == ct.outPutPower());
  }

  @Override
  public int output5V(CT ct) {
    System.out.println("日本电压适配器");
    return ct.outPutPower() / 22;
  }

}
