package com.xksquare.thread.design.utils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class CountDownLatchDemo {

  public static void main(String[] args) {

    CountDownLatch downLatch = new CountDownLatch(10);

    IntStream.range(0, 10).forEach(s -> new Thread(() -> {
      try {
        TimeUnit.SECONDS.sleep(s);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      downLatch.countDown();
      System.out.println("count:" + downLatch.getCount());
    }).start());

    try {
      downLatch.await();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("down all thread.");
  }

}
