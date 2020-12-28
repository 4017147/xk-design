package com.xksquare.pattern.design.decorator.sample2;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 计算促销后的支付价格
 * 
 * @describe
 * @author marker.li lyl
 * @date 2021/12/28
 */
public class PromotionFactory {

  public static BigDecimal getPayMoney(OrderDetail orderDetail) {

    // 获取给商品设定的促销类型
    Map<PromotionType, SupportPromotions> supportPromotionslist =
        orderDetail.getMerchandise().getSupportPromotions();

    // 初始化计算类
    IBaseCount baseCount = new BaseCount();
    if (supportPromotionslist != null && supportPromotionslist.size() > 0) {
      for (PromotionType promotionType : supportPromotionslist.keySet()) {// 遍历设置的促销类型，通过装饰器组合促销类型
        baseCount = protmotion(supportPromotionslist.get(promotionType), baseCount);
      }
    }
    return baseCount.countPayMoney(orderDetail);
  }

  /**
   * 组合促销类型
   * 
   * @param supportPromotions
   * @param baseCount
   * @return
   */
  private static IBaseCount protmotion(SupportPromotions supportPromotions, IBaseCount baseCount) {
    if (supportPromotions.getPromotionType() == PromotionType.COUPON) {
      baseCount = new CouponDecorator(baseCount);
    } else if (supportPromotions.getPromotionType() == PromotionType.REDPACKED) {
      baseCount = new RedPacketDecorator(baseCount);
    }
    return baseCount;
  }

}
