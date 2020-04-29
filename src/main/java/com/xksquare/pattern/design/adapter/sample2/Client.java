package com.xksquare.pattern.design.adapter.sample2;

import java.util.ArrayList;
import java.util.List;

public class Client {

  private static List<Adapter5V> list = new ArrayList<>();

  static {
    list.add(new ChinaPowerCT());
    list.add(new JapanPowerCT());
  }


  public static void main(String[] args) {
    CT c = new ACV220();
    Adapter5V adapter1 = findCT(c);
    adapter1.output5V(c);

    CT j = new ACV110();
    Adapter5V adapter2 = findCT(j);
    adapter2.output5V(j);
  }


  static Adapter5V findCT(CT ct) {
    Adapter5V adapter = null;
    for (Object ad : list) {
      if (((Adapter5V) ad).support(ct)) {
        adapter = ((Adapter5V) ad);
        break;
      }
    }
    if (adapter == null) {
      throw new IllegalArgumentException("没有找到合适的变压适配器");
    }
    return adapter;
  }


}
