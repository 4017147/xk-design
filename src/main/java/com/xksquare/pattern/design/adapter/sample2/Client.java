package com.xksquare.pattern.design.adapter.sample2;

public class Client {
  public static void main(String[] args) {
    SystemWordsFilter wordsFilter = new AClassfySystemFilter();
    String word = wordsFilter.filter("我爱中国.....");
    System.out.println(word);
    // 先有加了需求 要多加B类别过滤,在不改动原有代码

    wordsFilter = new BClassfySystemFilter(wordsFilter);
    word = wordsFilter.filter(word);
    System.out.println(word);
  }
}
