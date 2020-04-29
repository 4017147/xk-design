package com.xksquare.pattern.design.brideg.sample1;

public abstract class AbstractCorp {

  private Product product;

  public AbstractCorp(Product product) {
    super();
    this.product = product;
  }


  public void makeMoney() {
    this.product.make();
    this.product.sale();
  }


}
