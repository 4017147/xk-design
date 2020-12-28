package com.xksquare.pattern.design.decorator.sample2;

import java.math.BigDecimal;

/**
 * 支付基本类
 * 
 * @describe
 * @author marker.li lyl
 * @date 2021/12/28
 */
public class BaseCount implements IBaseCount {

  public BigDecimal countPayMoney(OrderDetail orderDetail) {
    orderDetail.setPayMoney(orderDetail.getMerchandise().getPrice());
    System.out.println("商品原单价金额为：" + orderDetail.getPayMoney());

    return orderDetail.getPayMoney();
  }

}
