package com.xksquare.pattern.design.responsibility.sample1;

public class Client {
  public static void main(String[] args) {
    FilterChain chain = new FilterChain();
    chain.addfilter(new AFilter());
    chain.addfilter(new BFilter());
    chain.doProcess(new Request("marker.li"), new Respion(""));
    System.out.println("======================================");
    chain.doProcess2(new Request("marker.li"), new Respion(""));
  }
}
