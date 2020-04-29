package com.xksquare.pattern.design.adapter.sample2;

public class BClassfySystemFilter implements SystemWordsFilter {

  private SystemWordsFilter systemWordsFilter;

  public BClassfySystemFilter(SystemWordsFilter systemWordsFilter) {
    super();
    this.systemWordsFilter = systemWordsFilter;
  }

  @Override
  public String filter(String words) {
    String nWord = systemWordsFilter.filter(words);
    System.out.println("B类过滤器开始过滤--->>>>");
    if (nWord == null || nWord == "") {
      return null;
    }
    return nWord.replace("*", "-");
  }

}
