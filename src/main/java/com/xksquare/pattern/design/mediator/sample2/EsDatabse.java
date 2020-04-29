package com.xksquare.pattern.design.mediator.sample2;

public class EsDatabse extends Database {

  public EsDatabse(DataMediator dataMediator) {
    super(dataMediator);
  }

  @Override
  public void add(String data) {
    System.out.println("es database add data >>>>" + data);
    this.dataMediator().syn(DatabaseType.es, data);
  }

}
