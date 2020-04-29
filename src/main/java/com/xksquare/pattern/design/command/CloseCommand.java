package com.xksquare.pattern.design.command;

public class CloseCommand implements Command {

  private LightRevier lightRevier;

  public CloseCommand(LightRevier lightRevier) {
    super();
    this.lightRevier = lightRevier;
  }
  @Override
  public void exe() {
    // TODO Auto-generated method stub
    lightRevier.close();
  }

}
