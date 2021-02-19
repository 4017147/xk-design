package com.xksquare.thread.design.future;

public interface Future<T> {

  T get() throws InterruptedException;

}
