package com.xksquare.pattern.design.mediator.sample1;

import java.io.Serializable;

/**
 * 收益者
 * 
 * @author marker.李云龙
 * @date 2019/08/12
 */
public class Beneficiary implements Serializable {

  /**
   * 是否是普通用户
   */
  private int isNormal;

  /**
   * 商戶分号/用户Id
   */
  private String userId;

  /**
   * 商戶ID
   */
  private String merchantId;

  protected Beneficiary(int isNormal, String userId, String merchantId) {
    super();
    this.isNormal = isNormal;
    this.userId = userId;
    this.merchantId = merchantId;
  }

  @Override
  public String toString() {
    return "Beneficiary [isNormal=" + isNormal + ", userId=" + userId + ", merchantId=" + merchantId
        + "]";
  }

}
