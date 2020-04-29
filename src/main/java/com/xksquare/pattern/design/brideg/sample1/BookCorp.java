package com.xksquare.pattern.design.brideg.sample1;

public class BookCorp extends AbstractCorp {

  public BookCorp(Product product) {
    super(product);
  }

  @Override
  public void makeMoney() {
    System.out.println("书店挣钱:");
    super.makeMoney();
  }

}
