package com.xksquare.pattern.design.decorator;

public class Client {

  public static void main(String[] args) {

    MilkyTea milkyTea = new DefaultMilkyTea();
    System.out.println(milkyTea.amount());
    milkyTea.desc();
    System.out.println("=====");
    
    MilkyTea milkyTea2 = new AppleMilkyTea(milkyTea);
    System.out.println(milkyTea2.amount());
    milkyTea2.desc();
    
    System.out.println("=====");
    
    MilkyTea milkyTea3 = new SugarMilkyTea(milkyTea2);
    System.out.println(milkyTea3.amount());
    milkyTea3.desc();
  }


}
