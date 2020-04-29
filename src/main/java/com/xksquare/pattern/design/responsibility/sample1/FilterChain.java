package com.xksquare.pattern.design.responsibility.sample1;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

  private List<Filter> filters;

  private int current = -1;

  public FilterChain() {
    super();
    this.filters = new ArrayList<Filter>();
  }

  public void addfilter(Filter filter) {
    this.filters.add(filter);
  }

  public void doProcess2(Request request, Respion respion) {
    if (current < filters.size()) {
      Filter filter = this.filters.get(++current);
      filter.dofilter2(request, respion, this);
    }
  }

  public void doProcess(Request request, Respion respion) {
    this.filters.stream().forEach(s -> {
      s.dofilter(request, respion);
    });
  }


}
