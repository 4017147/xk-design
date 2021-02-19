package com.xksquare.thread.design.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ReetentReadWriteLockDemo {

  static class MyCache {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private Map<String, String> cache = new HashMap<>();

    private ReadLock readLock = lock.readLock();

    private WriteLock writeLock = lock.writeLock();

    public void get(String key) {
      readLock.lock();
      try {
        System.out.println(Thread.currentThread().getName() + ":" + "读取" + key);
        String s = this.cache.get(key);
        System.out.println("读取成功!" + s);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } finally {
        readLock.unlock();
      }
    }

    public void put(String key, String value) {
      writeLock.lock();
      try {
        System.out.println(Thread.currentThread().getName() + ":" + "写入" + key);
        this.cache.put(key, value);
        System.out.println("写入成功!");
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } finally {
        writeLock.unlock();
      }
    }

  }

  public static void main(String[] args) {
    MyCache cache = new MyCache();
    process(2, "write", s -> s.put("marker", "marker@@@@"), cache);
    process(4, "read", s -> s.get("marker"), cache);
    process(2, "write", s -> s.put("marker", "marker@@@@"), cache);
    process(16, "read", s -> s.get("marker"), cache);

  }

  public static void process(int nums, String threadName, Consumer<MyCache> c, MyCache data) {
    IntStream.range(0, nums).forEach(s -> new Thread(() -> c.accept(data), threadName).start());
  }

}
