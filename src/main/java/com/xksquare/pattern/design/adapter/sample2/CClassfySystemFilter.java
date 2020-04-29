package com.xksquare.pattern.design.adapter.sample2;

public class CClassfySystemFilter extends BClassfySystemFilter implements SystemWordsFilter {

  public CClassfySystemFilter(SystemWordsFilter systemWordsFilter) {
    super(systemWordsFilter);
  }

  @Override
  public String filter(String words) {
    words = super.filter(words);
    if (words == null || words == "") {
      return null;
    }
    System.out.println("C类过滤器开始过滤--->>>>");
    return words.replace("-", "&");
  }

}
