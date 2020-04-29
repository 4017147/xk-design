package com.xksquare.pattern.design.factory.sample2;

public class BmwCarFactory extends CarFactory {

  @Override
  Fadongji createFadongji() {
    return new NiuBiFaDongji();
  }

  @Override
  Lunzi createLunzi() {
    return null;
  }

}
