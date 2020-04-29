package com.xksquare.pattern.design.builder.sample;

public class SysUserBuilder implements UserBuilder {

  private User user = new SysUser();

  public SysUserBuilder() {
    super();
  }

  @Override
  public UserBuilder name() {
    user.setName("marker.li");
    return this;
  }

  @Override
  public UserBuilder age() {
    // TODO Auto-generated method stub
    user.setAge(29);
    return this;
  }

  @Override
  public User build() {
    return user;
  }

}
