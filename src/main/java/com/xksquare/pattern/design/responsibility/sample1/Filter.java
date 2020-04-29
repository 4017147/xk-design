package com.xksquare.pattern.design.responsibility.sample1;

public interface Filter {

  void dofilter(Request request, Respion respion);

  void dofilter2(Request request, Respion respion, FilterChain chain);

}
