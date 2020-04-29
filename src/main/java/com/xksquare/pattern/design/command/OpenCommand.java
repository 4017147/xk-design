package com.xksquare.pattern.design.command;

public class OpenCommand implements Command {

  private LightRevier lightRevier;

  public OpenCommand(LightRevier lightRevier) {
    super();
    this.lightRevier = lightRevier;
  }

  @Override
  public void exe() {
    // TODO Auto-generated method stub
    lightRevier.open();
  }

}
