package com.xksquare.pattern.design.brideg.sample1;

public class Client {

  public static void main(String[] args) {
    Product book = new JavaBook();
    BookCorp corp = new BookCorp(book);
    corp.makeMoney();

    corp = new BookCorp(new ChineseBook());
    corp.makeMoney();
  }

}
