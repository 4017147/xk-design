package com.xksquare.pattern.design.visiter;

public class Client {

  public static void main(String[] args) {
    Visitor shop = new Shop();
    ObjectStructure structure = new ObjectStructure();
    structure.add(new ServiceGoods("服务"));
    structure.add(new ReverGoods("预约"));
    structure.visit(shop);
  }


}
