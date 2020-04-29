package com.xksquare.pattern.design.visiter;

/**
 * 服务商品
 * 
 * @author marker.李云龙
 * @date 2020/12/30
 */
public class ServiceGoods implements Goods {

  private String name;


  public ServiceGoods(String name) {
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
    return "ServiceGoods [name=" + name + "]";
  }



}
