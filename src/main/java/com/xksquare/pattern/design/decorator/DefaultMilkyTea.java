package com.xksquare.pattern.design.decorator;

/**
 * 原味奶茶
 * 
 * @author marker.李云龙
 * @date 2019/12/28
 */
public class DefaultMilkyTea implements MilkyTea {

  @Override
  public long amount() {
    // TODO Auto-generated method stub
    return 2;
  }

  @Override
  public void desc() {
    // TODO Auto-generated method stub
    System.out.println("普通原味奶茶");
  }

}
