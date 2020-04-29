package com.xksquare.pattern.design.mediator.sample2;

public abstract class Database {

  private DataMediator dataMediator;

  public Database(DataMediator dataMediator) {
    super();
    this.dataMediator = dataMediator;
  }

  public DataMediator dataMediator() {
    return this.dataMediator;
  }

  
  public abstract void add(String data);
  
}
