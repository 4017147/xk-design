package com.xksquare.pattern.design.mediator.sample1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Optional;

import com.xksquare.pattern.design.mediator.sample1.RevenueType.DividedType;

/**
 * 分成条目
 * 
 * @author marker.李云龙
 * @date 2019/08/09
 */
public abstract class DividedArticle implements Divided, Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   * 主业务收益类型
   */
  private RevenueType revenueType;

  /**
   * 详细业务收益类型
   */
  private DividedType dividedType;

  /**
   * 分成比例
   */
  private BigDecimal dividedRatio;

  /**
   * 受益者
   */
  private Beneficiary beneficiary;

  protected DividedArticle(Beneficiary beneficiary, RevenueType revenueType,
      DividedType dividedType, BigDecimal dividedRatio, Currency currency) {
    super();
    this.beneficiary = beneficiary;
    this.revenueType = revenueType;
    this.dividedType = dividedType;
    this.dividedRatio = dividedRatio;
    this.currency = currency;
  }

  /**
   * 收益类型
   */
  private Currency currency;

  /**
   * 分成金额
   */
  private long dividedAmount;

  /**
   * 分成基数
   */
  private long cardinalMoney;

  /**
   * 是否扣除分成金額
   */
  private int isDeduct = 0;


  @Override
  public void calculate(long cardinalMoney) {
    Optional.ofNullable(dividedRatio).orElseThrow(() -> new IllegalArgumentException("分成比例不能为空!"));
    BigDecimal decimal = dividedRatio.divide(BigDecimal.valueOf(100));
    BigDecimal dividedPrice = BigDecimal.valueOf(cardinalMoney).multiply(decimal);
    this.dividedAmount = dividedPrice.setScale(0, RoundType.ROUND_DOWN.getValue()).longValue();
    this.cardinalMoney = cardinalMoney;
  }

  @Override
  public long matchingAmount(long profitMoney) {
    if (profitMoney >= dividedAmount) {
      this.isDeduct = 1;
      return profitMoney - dividedAmount;
    } else {
      return profitMoney;
    }
  }

  public RevenueType getRevenueType() {
    return revenueType;
  }

  public DividedType getDividedType() {
    return dividedType;
  }

  public BigDecimal getDividedRatio() {
    return dividedRatio;
  }

  public Beneficiary getBeneficiary() {
    return beneficiary;
  }

  public Currency getCurrency() {
    return currency;
  }

  public long getDividedAmount() {
    return dividedAmount;
  }

  public long getCardinalMoney() {
    return cardinalMoney;
  }

  public int getIsDeduct() {
    return isDeduct;
  }

  @Override
  public String toString() {
    return "DividedArticle [revenueType=" + revenueType + ", dividedType=" + dividedType
        + ", dividedRatio=" + dividedRatio + ", beneficiary=" + beneficiary + ", currency="
        + currency + ", dividedAmount=" + dividedAmount + ", cardinalMoney=" + cardinalMoney
        + ", isDeduct=" + isDeduct + "]";
  }



}
