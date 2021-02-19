package com.xksquare.thread.design.collections;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;

public class TestList {
  public static void main(String[] args) {
    List<String> list = new CopyOnWriteArrayList<String>();
    IntStream.rangeClosed(1, 10).forEach(s -> new Thread(() -> {
      list.add(UUID.randomUUID().toString());
      System.out.println(s + ":" + list.toString());
    }, "Index:" + s).start());
  }
}
