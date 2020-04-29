package com.xksquare.pattern.design.visiter;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

  private List<Goods> goodsList = new ArrayList<Goods>();


  public void add(Goods goods) {
    goodsList.add(goods);
  }

  public void visit(Visitor visitor) {
    this.goodsList.stream().forEach(s -> s.accept(visitor));
  }

}
