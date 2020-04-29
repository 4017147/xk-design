package com.xksquare.pattern.design.builder.sample;

public class UserDirector {

  private UserBuilder builder;

  public UserDirector(UserBuilder builder) {
    super();
    this.builder = builder;
  }

  public User buildUser() {
    builder.age();
    builder.name();
    return builder.build();
  }



}
