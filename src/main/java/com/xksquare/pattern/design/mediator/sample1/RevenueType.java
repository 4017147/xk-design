package com.xksquare.pattern.design.mediator.sample1;

import java.util.Arrays;

/**
 * @ClassName: RevenueType
 * @Description:TODO(收益分成类型)
 * @author: marker/lyl
 * @date: 2019年2月20日 上午10:14:00
 */
public enum RevenueType {
  // 订单分派
  ORDER_ALLOCATION(DividedType.OrderAllocation.class),
  // 推荐分成
  RECOMMEND(DividedType.Recommend.class),
  // 销售
  SALES(DividedType.Sales.class),
  // 货源
  SOURCE_AWARD(DividedType.SourceAward.class),
  // 直播收益
  LIVE_EARNINGS(DividedType.LiveEarnings.class),
  // 平台收益
  PLATFORM_EARN(DividedType.PlatformEarn.class);

  private DividedType[] values;

  RevenueType(Class<? extends DividedType> kind) {
    // 通过class对象获取枚举实例
    values = kind.getEnumConstants();
  }

  // 使用interface将子枚举类型包装
  public interface DividedType {

    String getCode();

    String getDescription();

    // 推荐分成收益 直接分成收益 维护 区域维护收益
    enum Recommend implements DividedType {

      R1D("r1d", Currency.rmb, "终身客户-直接分成收益"), R1M("r1m", Currency.rmb, "终身客户-维护分成收益"), R2D("r2d",
          Currency.rmb, "终身联盟商-直接分成收益"), R2M("r2m", Currency.rmb, "终身联盟商-维护分成收益"), R3D("r3d",
              Currency.rmb, "终身联盟商招募-直接分成收益"), R3M("r3m", Currency.rmb, "终身联盟商招募-维护分成收益"), RPMD1(
                  "rpmd1", Currency.rmb, "区域合伙人维护收益-(一级维护联盟商客户收益)-直接分成收益"), RPMM1("rpmm1",
                      Currency.rmb, "区域合伙人维护收益-(一级维护联盟商客户收益)-维护分成收益"), RPAMD1("rpamd1",
                          Currency.rmb, "区域合伙人维护收益-(一级维护联盟商客户考核坐享补贴)-直接分成补贴"), RPAMM1("rpamm1",
                              Currency.rmb, "区域合伙人维护收益-(一级维护联盟商客户考核维护补贴)-维护分成补贴"), RPMD2("rpmd2",
                                  Currency.rmb, "区域合伙人维护收益-(二级维护联盟商招募收益)-直接分成收益"), RPMM2("rpmm2",
                                      Currency.rmb, "区域合伙人维护收益-(二级维护联盟商招募收益)-维护分成收益"), RPAMD2(
                                          "rpamd2", Currency.rmb,
                                          "区域合伙人维护收益-(二级维护联盟商招募考核坐享收益)-直接分成补贴"), RPAMM2("rpamm2",
                                              Currency.rmb,
                                              "区域合伙人维护收益-(二级维护联盟商招募考核维护补贴)-维护分成补贴"), WDM("wdm",
                                                  Currency.rmb, "批发商城直推联盟商收益"), WRPMD("wrpmd",
                                                      Currency.rmb,
                                                      "区域合伙人维护收益-(维护联盟商批发商城收益)-直接分成收益"), WRPMM(
                                                          "wrpmm", Currency.rmb,
                                                          "区域合伙人维护收益-(维护联盟商批发商城收益)-维护分成收益"), FERROUS(
                                                              "ferrous", Currency.rmb, "主播铁粉收益");

      private String code;
      private String description;
      private Currency currency;

      Recommend(String code, Currency currency, String desciption) {
        this.code = code;
        this.currency = currency;
        this.description = desciption;
      }

      @Override
      public String getCode() {
        return code;
      }

      @Override
      public String getDescription() {
        return description;
      }

      public Currency currency() {
        return currency;
      }

    }

    // 销售分成收益
    enum Sales implements DividedType {

      SINGLE_SALE("ss", "（商戶）单笔销售"), MAINTAIN_SALE("ms", "（商戶）维护收益"),

      // 购买者是商户用户-分给商户的
      // M_SINGLE_BATCH_SALE("msbs", "（商戶）单次批量销售"),
      M_MONTH_SALE("mms", "（商戶）月销售额"), M_SALE_SUBSIDY_BUYER("mssb", "（商戶）销售补贴-购买用户"),

      // 购买者是普通用户-分给普通用户的
      // U_SINGLE_BATCH_SALE("usbs", "（普通用戶）单次批量销售"),
      // U_MONTH_SALE("ums", "（普通用戶）月销售额"),
      U_SALE_SUBSIDY_BUYER("ussb", "（普通用戶）销售补贴-购买用户"),

      SALE_SUBSIDY_RP("ssr", "（商戶）销售补贴-区域合伙人");

      private String code;
      private String description;

      Sales(String code, String desciption) {
        this.code = code;
        this.description = desciption;
      }

      @Override
      public String getCode() {
        return code;
      }

      @Override
      public String getDescription() {
        return description;
      }
    }

    // 货源奖励收益
    enum SourceAward implements DividedType {
      SOURCE_AWARD_UNION("sau", "货源奖励-推荐联盟商"), SOURCE_AWARD_UNION_SUBSIDY("saus",
          "货源奖励-推荐联盟商-补贴"), SOURCE_AWARD_UNION_PARTNER("saup",
              "货源奖励-维护推荐联盟商的合伙人"), SOURCE_AWARD_UNION_PARTNER_SUBSIDY("saups",
                  "货源奖励-维护推荐联盟商的合伙人-补贴");

      private String code;
      private String description;

      SourceAward(String code, String desciption) {
        this.code = code;
        this.description = desciption;
      }

      @Override
      public String getCode() {
        return code;
      }

      @Override
      public String getDescription() {
        return description;
      }
    }

    // 直播体系收益
    enum LiveEarnings implements DividedType {

      FAMILYL1("familyl1", "普通家族收益"), O_FAMILYL1("o_familyl1", "原始家族收益"), FAMILYL2("familyl2",
          "砖石家族收益-工会收益"), O_FAMILYL2("o_familyl2", "原始砖石家族收益"), ANCHOR("anchor",
              "主播收益"), FAMILYL1_ESCROW("familyl1_escrow",
                  "普通家族-代管主播收益"), FAMILYL2_ESCROW("familyl2_escrow", "砖石家族-代管主播收益");

      private String code;
      private String description;

      LiveEarnings(String code, String desciption) {
        this.code = code;
        this.description = desciption;
      }

      @Override
      public String getCode() {
        return code;
      }

      @Override
      public String getDescription() {
        return description;
      }
    }

    enum OrderAllocation implements DividedType {
      // 平台
      TRUNCATION("truncation", "分成舍账金额"), PLATFORM("platform", "平台收入金额"), JACKPOT("jackpot",
          "奖池抽成金额"),
      // 商圈
      BCIRCLE_MR("bcircle_mr", "(商户用户)商圈订单-商家收入金额"),
      // 游戏
      GAME_CE("gce", "游戏订单-公司收入金额"),
      // 礼物
      GIFT_RP("grp", "礼物订单-(普通用户)收礼者所得"),
      // 平台代管普通家族收益
      P_P_F1("ppf1", "平台代管普通家族收益"),
      // 平台代管原始家族收益
      P_P_0F1("ppof1", "平台代管原始家族收益"),
      // 平台代管砖石家族收益
      P_P_F2("ppf2", "平台代管砖石家族收益"),
      // 彩票
      LOTTERY_MI("lottery_mi", "(商户用户)彩票-彩票来源是商户,中奖后分得的金额");

      private String code;
      private String description;

      OrderAllocation(String code, String desciption) {
        this.code = code;
        this.description = desciption;
      }


      @Override
      public String getCode() {
        return code;
      }

      @Override
      public String getDescription() {
        return description;
      }

    }

    // 平台收益
    enum PlatformEarn implements DividedType {
      ;
      private String code;
      private String description;

      PlatformEarn(String code, String desciption) {
        this.code = code;
        this.description = desciption;
      }

      @Override
      public String getCode() {
        return code;
      }

      @Override
      public String getDescription() {
        return description;
      }

    }

  }

  public DividedType randomSelection() {
    return Enums.random(values);
  }

  public static void verify(String revenue) {
    if (!isExist(revenue)) {
      throw new IllegalArgumentException("分成类型不存在!");
    }
  }

  public static boolean isExist(String revenue) {
    return Arrays.asList(RevenueType.values()).stream().map(s -> s.name())
        .anyMatch(p -> p.equals(revenue));
  }

  public static Tuple<RevenueType, DividedType> get(String channel) {
    for (RevenueType e : RevenueType.values()) {
      for (DividedType t : e.values) {
        if (t.getCode().equals(channel)) {
          return new Tuple<RevenueType, DividedType>(e, t);
        }
      }
    }
    return null;
  }

}
