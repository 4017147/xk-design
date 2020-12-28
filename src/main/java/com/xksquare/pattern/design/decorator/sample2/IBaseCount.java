package com.xksquare.pattern.design.decorator.sample2;

import java.math.BigDecimal;

/**
 * 计算支付金额接口类
 * 
 * @author admin
 *
 */
public interface IBaseCount {

  BigDecimal countPayMoney(OrderDetail orderDetail);

}
