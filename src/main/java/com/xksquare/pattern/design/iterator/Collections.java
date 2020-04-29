package com.xksquare.pattern.design.iterator;

import java.util.ArrayList;
import java.util.List;

public class Collections {

  List<String> list = new ArrayList<String>();


  private Iterator iterator;

  public void add(String element) {
    list.add(element);
  }


  public Iterator iterator() {
    return iterator = new DefaultIterator(this.list);
  }


}
