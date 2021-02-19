package com.xksquare.thread.design.future;

import java.util.function.Consumer;

public class FutureService {

  public <T> Future<T> submit(FutureTask<T> task) {
    AsynFuture<T> asynFuture = new AsynFuture<>();
    new Thread(() -> {
      T result = task.call();
      asynFuture.done(result);
    }).start();
    return asynFuture;
  }

  public <T> Future<T> submit(FutureTask<T> task, Consumer<T> consumer) {
    AsynFuture<T> asynFuture = new AsynFuture<>();
    new Thread(() -> {
      T result = task.call();
      asynFuture.done(result);
      consumer.accept(result);
    }).start();
    return asynFuture;
  }

}
