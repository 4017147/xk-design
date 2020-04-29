package com.xksquare.pattern.design.adapter.sample1;

public class Client {

  public static void main(String[] args) {

    // Voltage50V voltage50v = new Voltage50VClazzAdapter();
    // System.out.println(voltage50v.outPut50V());
    
    Voltage220V voltage220v = new Voltage220VAdaptee();
    Voltage50V voltage50v = new Voltage50VObjectAdapter(voltage220v);
    System.out.println(voltage50v.outPut50V());

  }

}
