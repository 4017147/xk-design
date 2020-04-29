package com.xksquare.pattern.design.mediator.sample2;

public class MysqlDatabase extends Database {

  public MysqlDatabase(DataMediator dataMediator) {
    super(dataMediator);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void add(String data) {
    // TODO Auto-generated method stub
    System.out.println("mysql database add data >>>>" + data);
    this.dataMediator().syn(DatabaseType.mysql, data);
  }

}
