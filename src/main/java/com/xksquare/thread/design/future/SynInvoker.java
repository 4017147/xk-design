package com.xksquare.thread.design.future;

import java.util.concurrent.TimeUnit;

public class SynInvoker {
  public static void main(String[] args) {
    FutureService futureService = new FutureService();
    FutureTask<String> ss = () -> {
      try {
        TimeUnit.SECONDS.sleep(2);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      return "marker";
    };
    Future<String> fu = futureService.submit(ss, s -> System.out.println(s));
    System.out.println("===========");
    System.out.println("do other thing........");
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try {
      System.out.println("result:" + fu.get());
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
