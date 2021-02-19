package com.xksquare.thread.design.syn;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Test2 {

  public static void main(String[] args) {
    Data data = new Data();
    process("a", s -> s.increment(), data);
    process("b", s -> s.decrement(), data);
    process("c", s -> s.increment(), data);
    process("d", s -> s.decrement(), data);
  }

  public static void process(String threadName, Consumer<Data> c, Data data) {
    IntStream.range(0, 10).forEach(s -> new Thread(() -> c.accept(data), threadName).start());;
  }

  public static class Data {

    private int number;

    private ReentrantLock lock = new ReentrantLock();

    private Condition a = lock.newCondition();

    private Condition b = lock.newCondition();

    public void increment() {
      lock.lock();
      try {
        while (this.number != 0) {
          try {
            a.await();
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
        number++;
        b.signalAll();
        System.out.println("increment:" + Thread.currentThread().getName() + "=====>>>" + number);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } finally {
        lock.unlock();
      }
    }

    public void decrement() {
      lock.lock();
      try {
        while (this.number == 0) {
          try {
            b.await();
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
        number--;
        a.signalAll();
        System.out.println("decrement:" + Thread.currentThread().getName() + "=====>>>" + number);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } finally {
        lock.unlock();
      }
    }
  }



}
