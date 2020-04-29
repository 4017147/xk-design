package com.xksquare.pattern.design.mediator.sample1.responsibility;

import java.util.ArrayList;
import java.util.List;

import com.xksquare.pattern.design.mediator.sample1.RecommandDivided;

public class DividedPorcessChain {

  private int currentIndex = 0;

  private List<DividedProcess> processes;


  public DividedPorcessChain() {
    super();
    this.processes = new ArrayList<DividedProcess>();
  }

  public DividedPorcessChain addProcess(DividedProcess process) {
    this.processes.add(process);
    return this;
  }

  public void doDividedProcess(RecommandDivided current, List<RecommandDivided> divideds) {
    if (this.currentIndex >= processes.size()) {
      return;
    }
    DividedProcess process = this.processes.get(currentIndex++);
    process.doProcess(current, divideds, this);
  }


  public void resetNonius() {
    this.currentIndex = 0;
  }

}
