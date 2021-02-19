package com.xksquare.thread.design.fork;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ForkJoinDemo extends RecursiveTask<Long> {

  private long start;

  private long end;

  private long temp = 100000;

  public ForkJoinDemo(long start, long end) {
    super();
    this.start = start;
    this.end = end;
  }

  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    ForkJoinPool joinPool = new ForkJoinPool();
    ForkJoinDemo task = new ForkJoinDemo(0, 123478);
    ForkJoinTask<Long> s = joinPool.submit(task);
    try {
      System.out.println(s.get());
      long end = System.currentTimeMillis();
      System.out.println("sss:" + (end - start));
    } catch (InterruptedException | ExecutionException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    long start2 = System.currentTimeMillis();
    LongStream.rangeClosed(0L, 123478L).parallel().forEach(x -> System.out.println(s));
//    System.out.println(sum);
    long end3 = System.currentTimeMillis();
    System.out.println("aaa:" + (end3 - start2));
  }

  @Override
  protected Long compute() {
    if ((end - start) < temp) {
      long x = 0L;
      for (long i = start; i <= end; i++) {
        x += i;
      }
      return x;
    } else {
      long midle = (end - start) / 2;
      ForkJoinDemo demo1 = new ForkJoinDemo(start, midle);
      demo1.fork();
      ForkJoinDemo demo = new ForkJoinDemo(midle + 1, end);
      demo.fork();
      return demo.join() + demo1.join();
    }
  }

}
