package com.xksquare.pattern.design.adapter.sample1;

/**
 * 类适配器
 * 
 * @author marker.李云龙
 * @date 2019/12/27
 */
public class Voltage50VClazzAdapter extends Voltage220VAdaptee implements Voltage50V {

  @Override
  public int outPut50V() {
    // TODO Auto-generated method stub
    return super.outPutVoltage220V() / 44;
  }

}
