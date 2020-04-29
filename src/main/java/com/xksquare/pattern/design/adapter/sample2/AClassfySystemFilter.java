package com.xksquare.pattern.design.adapter.sample2;

public class AClassfySystemFilter implements SystemWordsFilter {

  @Override
  public String filter(String words) {
    System.out.println("A类过滤器开始过滤--->>>>");
    if (words == null || words == "") {
      return null;
    }
    String nWords = words.replaceAll("中国", "***");
    return nWords;
  }

}
