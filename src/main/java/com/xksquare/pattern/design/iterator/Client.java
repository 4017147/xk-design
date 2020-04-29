package com.xksquare.pattern.design.iterator;

public class Client {

  public static void main(String[] args) {
    Collections collections = new Collections();
    collections.add("aaaaa");
    collections.add("cccc");
    Iterator iterator = collections.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }


}
