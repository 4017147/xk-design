package com.xksquare.pattern.design.command;

public class Client {

  public static void main(String[] args) {
    LightRevier lightRevier = new LightRevier();
    OpenCommand openCommand = new OpenCommand(lightRevier);
    openCommand.exe();

  }

}
