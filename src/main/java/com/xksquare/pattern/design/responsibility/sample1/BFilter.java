package com.xksquare.pattern.design.responsibility.sample1;

public class BFilter implements Filter {

  @Override
  public void dofilter(Request request, Respion respion) {
    // TODO Auto-generated method stub
    System.out.println("filterB:" + request.name);
    String result = respion.getResult() + ":B";
    respion.setResult(result);
  }

  @Override
  public void dofilter2(Request request, Respion respion, FilterChain chain) {
    // TODO Auto-generated method stub
    System.out.println("filterB:" + request.name);
    String result = respion.getResult() + ":B";
    respion.setResult(result);
  }

}
