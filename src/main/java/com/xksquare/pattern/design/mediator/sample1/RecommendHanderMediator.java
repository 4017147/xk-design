package com.xksquare.pattern.design.mediator.sample1;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.xksquare.pattern.design.mediator.sample1.RevenueType.DividedType;
import com.xksquare.pattern.design.mediator.sample1.RevenueType.DividedType.Recommend;
import com.xksquare.pattern.design.mediator.sample1.responsibility.DividedPorcessChain;
import com.xksquare.pattern.design.mediator.sample1.responsibility.DividedProcess;
import com.xksquare.pattern.design.mediator.sample1.visitor.DividedVisitor;
import com.xksquare.pattern.design.mediator.sample1.visitor.RecommandDividedVisitor;

public class RecommendHanderMediator implements RecommandMediator {

  private DividedPorcessChain chain;

  private List<RecommandDivided> divideds;

  public RecommendHanderMediator(List<RecommandDivided> divideds) {
    super();
    this.chain = new DividedPorcessChain();
    this.divideds = divideds.stream().map(s -> s.bindMediator(this)).collect(Collectors.toList());
  }

  @Override
  public void hander(RecommandDivided recommandDivided) {
    chain.resetNonius();
    chain.doDividedProcess(recommandDivided, divideds);
  }

  public RecommendHanderMediator addDividedProcess(DividedProcess process) {
    chain.addProcess(process);
    return this;
  }

  public List<RecommandDivided> startDivided(DividedType.Recommend recommend, long cardinalMoney,
      long profitMoney) {

    this.divideds.stream().filter(s -> Objects.equals(s.getDividedType(), Recommend.R1D))
        .findFirst().ifPresent(s -> s.calculate(cardinalMoney));

    DividedVisitor dividedVisitor = new RecommandDividedVisitor(profitMoney);

    this.divideds.stream().forEach(s -> s.accpet(dividedVisitor));

    return this.divideds;

  }

}
