package com.xksquare.thread.design.utils;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class BlockingQueueDemo {

  public static final BlockingQueue<String> queue = new LinkedBlockingQueue<>();

  public static void main(String[] args) {
    queue.add("aaa");
    queue.add("bbb");
    queue.add("ccc");

    print(queue, () -> queue.remove());
    print(queue, () -> queue.element());
    print(queue, () -> queue.element());
    print(queue, () -> queue.peek());
    print(queue, () -> queue.poll());
  }

  public static void print(BlockingQueue<String> queue, Supplier<String> s) {
    String e = s.get();
    System.out.println(String.format("s:%s,size:%d,element:%s", queue.toString(), queue.size(), e));
  }



}
