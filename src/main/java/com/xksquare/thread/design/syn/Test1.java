package com.xksquare.thread.design.syn;

import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Test1 {


  public static void main(String[] args) {
    Data data = new Data();
    process("a", s -> s.increment(), data);
    process("b", s -> s.decrement(), data);
    process("c", s -> s.increment(), data);
    process("d", s -> s.decrement(), data);
  }

  public static void process(String threadName, Consumer<Data> c, Data data) {
    IntStream.range(0, 10000).forEach(s -> new Thread(() -> c.accept(data), threadName).start());;
  }

  public static class Data {

    private int number;


    public void increment() {
      synchronized (this) {
        while (this.number != 0) {
          try {
            this.wait();
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
        number++;
        this.notifyAll();
        System.out.println("increment:" + Thread.currentThread().getName() + "=====>>>" + number);
      }
    }

    public void decrement() {
      synchronized (this) {
        while (this.number == 0) {
          try {
            this.wait();
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
        number--;
        this.notifyAll();
        System.out.println("decrement:" + Thread.currentThread().getName() + "=====>>>" + number);
      }
    }

  }

}
