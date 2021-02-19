package com.xksquare.thread.design.utils;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class CyclicBarrierDemo {

  public static void main(String[] args) {
    CyclicBarrier barrier = new CyclicBarrier(10, () -> System.out.println("im is ok!"));
    IntStream.range(0, 10).forEach(s -> new Thread(() -> {
      try {
        System.out.println("count :" + s + "到达指定地点!");
        barrier.await();
        System.out.println("count:" + s + "干活....!");
        TimeUnit.SECONDS.sleep(s);
        System.out.println("count:" + s + "收工....!");
        barrier.await();
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (BrokenBarrierException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }).start());
  }

}
