package com.xksquare.pattern.design.adapter.sample2;

public class Client {
  public static void main(String[] args) {
    String word = "我爱中国.....";
    SystemWordsFilter wordsFilterA = new AClassfySystemFilter();
    word = wordsFilterA.filter(word);
    System.out.println(word);
    System.out.println("==========================");
    // 第一次加需求 -> 要多加B类别过滤。不能改动A类代码，A类保持原有系统继续运作
    word = "我爱中国.....";
    SystemWordsFilter wordsFilterB = new BClassfySystemFilter(wordsFilterA);
    word = wordsFilterB.filter(word);
    System.out.println(word);
    System.out.println("==========================");
    // 第二次加需求 -> 要多加C类别过滤。不能改动A类与B类代码，保持原有系统继续运作
    word = "我爱中国.....";
    SystemWordsFilter wordsFilterC = new CClassfySystemFilter(wordsFilterA);
    word = wordsFilterC.filter(word);
    System.out.println(word);
  }
}
