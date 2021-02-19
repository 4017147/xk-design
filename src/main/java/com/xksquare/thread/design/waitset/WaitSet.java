package com.xksquare.thread.design.waitset;

public class WaitSet {

  private static final Object lock = new Object();

  private static void work() {
    synchronized (lock) {
      System.out.println("begin ......");

      System.out.println("thread will coming");
      try {
        lock.wait();
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println("thread out ....");
    }
  }

  public static void main(String[] args) {
    new Thread(() -> {
      work();
    }).start();

    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("notify ...");
    synchronized (lock) {
      lock.notifyAll();
    }
  }

}
