package com.xksquare.thread.design.utils;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SemaphoreDemo {

  public static void main(String[] args) {
    Semaphore semaphore = new Semaphore(3);
    IntStream.range(0, 10).forEach(s -> new Thread(() -> {
      try {
        semaphore.acquire();
        System.out.println("thread start s:" + s);
        TimeUnit.SECONDS.sleep(s);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } finally {
        System.out.println("thread end s:" + s);
        semaphore.release();
      }
    }).start());
  }


}
