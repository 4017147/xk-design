package com.xksquare.pattern.design.decorator.sample2;

import java.math.BigDecimal;

/**
 * 计算使用红包后的金额
 * 
 * @describe
 * @author marker.li lyl
 * @date 2021/12/28
 */
public class RedPacketDecorator extends BaseCountDecorator {

  public RedPacketDecorator(IBaseCount count) {
    super(count);
  }

  public BigDecimal countPayMoney(OrderDetail orderDetail) {
    BigDecimal payTotalMoney = new BigDecimal(0);
    payTotalMoney = super.countPayMoney(orderDetail);
    payTotalMoney = countCouponPayMoney(orderDetail);
    return payTotalMoney;
  }

  private BigDecimal countCouponPayMoney(OrderDetail orderDetail) {

    BigDecimal redPacket = orderDetail.getMerchandise().getSupportPromotions()
        .get(PromotionType.REDPACKED).getUserRedPacket().getRedPacket();
    System.out.println("红包优惠金额：" + redPacket);

    orderDetail.setPayMoney(orderDetail.getPayMoney().subtract(redPacket));
    return orderDetail.getPayMoney();
  }
}
