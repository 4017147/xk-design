package com.xksquare.pattern.design.mediator.sample1.responsibility;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.xksquare.pattern.design.mediator.sample1.RecommandDivided;
import com.xksquare.pattern.design.mediator.sample1.strategy.AmountUsageStrategy;
import com.xksquare.pattern.design.mediator.sample1.strategy.DefaultAmountUsageStrategy;

public abstract class AbstractDividedProcess implements DividedProcess {


  public AbstractDividedProcess() {
    super();
  }

  public abstract String[] careForDividedType();


  public abstract List<AmountUsageStrategy> amountUsageStrategies();

  public abstract String currentDividedType();


  public void handler(RecommandDivided current, List<RecommandDivided> divideds) {
    final String code = current.getDividedType().getCode();
    Optional.ofNullable(this.currentDividedType()).filter(s -> Objects.equals(s, code))
        .ifPresent(s -> {
          divideds.stream().filter(
              x -> Arrays.asList(this.careForDividedType()).contains(x.getDividedType().getCode()))
              .forEach(q -> {
                long cardinalMoney = this.amountUsageStrategies().stream()
                    .filter(a -> a.supportDivided(q.getDividedType().getCode())).findFirst()
                    .orElse(new DefaultAmountUsageStrategy()).cardinalAmount(current);
                q.calculate(cardinalMoney);
              });
        });

  }

}
