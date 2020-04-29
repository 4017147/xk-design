package com.xksquare.pattern.design.mediator.sample2;

import java.util.Objects;

public class DatabseMediator implements DataMediator {

  private Database redis = new RedisDatabase(this);

  private Database es = new EsDatabse(this);

  private Database mysql = new MysqlDatabase(this);

  @Override
  public void syn(DatabaseType databaseType, String data) {
    // TODO Auto-generated method stub
    if (Objects.equals(DatabaseType.mysql, databaseType)) {
      es.add(data);
      mysql.add(data);
    } else if (Objects.equals(DatabaseType.es, databaseType)) {
      mysql.add(data);
    } else if (Objects.equals(DatabaseType.redis, databaseType)) {
      System.out.println("不做處理!");
    }
  }


  public void add(DatabaseType databaseType, String data) {
    if (Objects.equals(DatabaseType.mysql, databaseType)) {
      mysql.add(data);
    } else if (Objects.equals(DatabaseType.es, databaseType)) {
      es.add(data);
    } else if (Objects.equals(DatabaseType.redis, databaseType)) {
      redis.add(data);
    }
  }

}
