package com.xksquare.pattern.design.adapter.sample1;

public class Voltage50VObjectAdapter implements Voltage50V {

  private Voltage220V voltage220v;

  public Voltage50VObjectAdapter(Voltage220V voltage220v) {
    super();
    this.voltage220v = voltage220v;
  }

  @Override
  public int outPut50V() {
    // TODO Auto-generated method stub
    return voltage220v.outPutVoltage220V() / 44;
  }

}
