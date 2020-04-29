package com.xksquare.pattern.design.builder.sample;

public interface UserBuilder {

  UserBuilder name();

  UserBuilder age();

  User build();
}
