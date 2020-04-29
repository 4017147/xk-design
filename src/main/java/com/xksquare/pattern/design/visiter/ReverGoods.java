package com.xksquare.pattern.design.visiter;

public class ReverGoods implements Goods {

  private String name;



  public ReverGoods(String name) {
    super();
    this.name = name;
  }



  @Override
  public void accept(Visitor visitor) {
    // TODO Auto-generated method stub
    visitor.visit(this);
  }



  @Override
  public String toString() {
    return "ReverGoods [name=" + name + "]";
  }



}
