package com.xksquare.pattern.design.mediator.sample1.responsibility;

import java.util.List;

import com.xksquare.pattern.design.mediator.sample1.RecommandDivided;

public interface DividedProcess {

  public void doProcess(RecommandDivided current, List<RecommandDivided> divideds,
      DividedPorcessChain chain);

}
