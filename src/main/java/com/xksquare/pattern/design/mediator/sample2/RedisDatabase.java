package com.xksquare.pattern.design.mediator.sample2;

import java.util.ArrayList;
import java.util.List;

public class RedisDatabase extends Database {

  private List<String> list = new ArrayList<>();

  public RedisDatabase(DataMediator dataMediator) {
    super(dataMediator);
  }

  @Override
  public void add(String data) {
    // TODO Auto-generated method stub
    System.out.println("redis database add data >>>>" + data);
    list.add(data);
  }

  @Override
  public void synAdd(String data) {
    this.dataMediator().syn(DatabaseType.redis, data);
  }

}
