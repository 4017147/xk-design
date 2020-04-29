package com.xksquare.pattern.design.mediator.sample2;

import java.util.ArrayList;
import java.util.List;

public class EsDatabse extends Database {

  private List<String> list = new ArrayList<>();

  public EsDatabse(DataMediator dataMediator) {
    super(dataMediator);
  }

  @Override
  public void add(String data) {
    // TODO Auto-generated method stub
    System.out.println("es database add data >>>>" + data);
    list.add(data);
  }

  @Override
  public void synAdd(String data) {
    this.dataMediator().syn(DatabaseType.es, data);
  }
}
