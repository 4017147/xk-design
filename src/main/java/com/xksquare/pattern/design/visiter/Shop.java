package com.xksquare.pattern.design.visiter;

public class Shop implements Visitor {

  @Override
  public void visit(Goods goods) {
    // TODO Auto-generated method stub
    System.out.println("店铺访问商品:" + goods.toString());
  }

}
