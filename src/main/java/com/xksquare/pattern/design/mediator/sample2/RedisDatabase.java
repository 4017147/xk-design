package com.xksquare.pattern.design.mediator.sample2;

public class RedisDatabase extends Database {

  public RedisDatabase(DataMediator dataMediator) {
    super(dataMediator);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void add(String data) {
    // TODO Auto-generated method stub
    System.out.println("redis database add data >>>>" + data);
    this.dataMediator().syn(DatabaseType.redis, data);
  }

}
