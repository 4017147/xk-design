package com.xksquare.pattern.design.mediator.sample2;

import java.util.ArrayList;
import java.util.List;

public class MysqlDatabase extends Database {

  private List<String> list = new ArrayList<>();

  public MysqlDatabase(DataMediator dataMediator) {
    super(dataMediator);
  }

  @Override
  public void add(String data) {
    // TODO Auto-generated method stub
    System.out.println("mysql database add data >>>>" + data);
    list.add(data);
  }

  @Override
  public void synAdd(String data) {
    this.dataMediator().syn(DatabaseType.mysql, data);
  }

}
