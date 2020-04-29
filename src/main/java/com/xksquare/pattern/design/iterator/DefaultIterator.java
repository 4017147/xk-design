package com.xksquare.pattern.design.iterator;

import java.util.List;

public class DefaultIterator implements Iterator {

  private List<String> list;

  private int position;

  public DefaultIterator(List<String> list) {
    super();
    this.list = list;
  }

  @Override
  public Object next() {
    if (this.hasNext()) {
      return this.list.get(position++);
    }
    return null;
  }

  @Override
  public boolean hasNext() {
    if (position >= list.size()) {
      return false;
    }
    return true;
  }

}
