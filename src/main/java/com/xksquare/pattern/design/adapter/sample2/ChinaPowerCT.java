package com.xksquare.pattern.design.adapter.sample2;

public class ChinaPowerCT implements Adapter5V {

  public static final int voltage = 220;

  @Override
  public boolean support(CT ct) {
    // TODO Auto-generated method stub
    return (voltage == ct.outPutPower());
  }

  @Override
  public int output5V(CT ct) {
    System.out.println("中国电压适配器");
    return ct.outPutPower() / 44;
  }

}
