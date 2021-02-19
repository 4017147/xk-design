package com.xksquare.thread.design.future;

public class AsynFuture<T> implements Future<T> {

  private T result;

  private volatile boolean isDone = false;

  @Override
  public T get() throws InterruptedException {
    synchronized (this) {
      while (!isDone) {
        this.wait();
      }
    }
    return this.result;
  }

  public void done(T result) {
    synchronized (this) {
      this.result = result;
      this.isDone = true;
      this.notifyAll();
    }
  }

}
