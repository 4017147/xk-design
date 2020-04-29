package com.xksquare.pattern.design.mediator.sample1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.xksquare.pattern.design.mediator.sample1.RevenueType.DividedType.Recommend;
import com.xksquare.pattern.design.mediator.sample1.factory.RecommendDividedFactory;
import com.xksquare.pattern.design.mediator.sample1.responsibility.DefaultDividedProcess;
import com.xksquare.pattern.design.mediator.sample1.strategy.AmountUsageStrategy;
import com.xksquare.pattern.design.mediator.sample1.strategy.DefaultAmountUsageStrategy;
import com.xksquare.pattern.design.mediator.sample1.strategy.DividedAmountUsageStrategy;

public class Client {

  public static void main(String[] args) {

    RecommendDividedFactory factory = new RecommendDividedFactory();

    Beneficiary beneficiary =
        new Beneficiary(0, UUID.randomUUID().toString(), UUID.randomUUID().toString());
    factory.buildRecommendDivided(beneficiary, Recommend.R1D, BigDecimal.valueOf(2));
    factory.buildRecommendDivided(beneficiary, Recommend.R1M, BigDecimal.valueOf(3));
    factory.buildRecommendDivided(beneficiary, Recommend.R2D, BigDecimal.valueOf(4));
    factory.buildRecommendDivided(beneficiary, Recommend.R2M, BigDecimal.valueOf(5));
    factory.buildRecommendDivided(beneficiary, Recommend.R3D, BigDecimal.valueOf(6));
    factory.buildRecommendDivided(beneficiary, Recommend.R3M, BigDecimal.valueOf(7));
    factory.buildRecommendDivided(beneficiary, Recommend.RPMD1, BigDecimal.valueOf(2));
    factory.buildRecommendDivided(beneficiary, Recommend.RPMM1, BigDecimal.valueOf(3));
    factory.buildRecommendDivided(beneficiary, Recommend.RPAMD1, BigDecimal.valueOf(4));
    factory.buildRecommendDivided(beneficiary, Recommend.RPAMM1, BigDecimal.valueOf(5));
    factory.buildRecommendDivided(beneficiary, Recommend.RPMD2, BigDecimal.valueOf(2));
    factory.buildRecommendDivided(beneficiary, Recommend.RPMM2, BigDecimal.valueOf(3));
    factory.buildRecommendDivided(beneficiary, Recommend.RPAMD2, BigDecimal.valueOf(4));
    factory.buildRecommendDivided(beneficiary, Recommend.RPAMM2, BigDecimal.valueOf(5));

    System.out.println("============================");

    RecommendHanderMediator mediator = new RecommendHanderMediator(factory.recommandDivideds());

    List<AmountUsageStrategy> amountUsageStrategies = new ArrayList<AmountUsageStrategy>();
    amountUsageStrategies.add(new DefaultAmountUsageStrategy());
    amountUsageStrategies.add(new DividedAmountUsageStrategy());

    mediator.addDividedProcess(new DefaultDividedProcess(amountUsageStrategies,
        new String[] {Recommend.R1M.getCode(), Recommend.R1M.getCode(), Recommend.R2D.getCode(),
            Recommend.R2M.getCode(), Recommend.R3D.getCode(), Recommend.R3M.getCode(),
            Recommend.RPAMD1.getCode(), Recommend.RPAMM1.getCode()},
        Recommend.R1D.getCode()));
//    mediator.addDividedProcess(new DefaultDividedProcess(amountUsageStrategies,
//        new String[] {Recommend.R1M.getCode(), Recommend.R1M.getCode(), Recommend.R2D.getCode(),
//            Recommend.R2M.getCode(), Recommend.R3D.getCode(), Recommend.R3M.getCode(),
//            Recommend.RPAMD1.getCode(), Recommend.RPAMM1.getCode()},
//        Recommend.R1D.getCode()));
//    mediator.addDividedProcess(new DefaultDividedProcess(amountUsageStrategies,
//        new String[] {Recommend.R1M.getCode(), Recommend.R1M.getCode(), Recommend.R2D.getCode(),
//            Recommend.R2M.getCode(), Recommend.R3D.getCode(), Recommend.R3M.getCode(),
//            Recommend.RPAMD1.getCode(), Recommend.RPAMM1.getCode()},
//        Recommend.R1D.getCode()));
    
    mediator.startDivided(Recommend.R1D, 100000L, 800000000L);



    System.out.println("============================");


  }

}
