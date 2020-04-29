package com.xksquare.pattern.design.proxy.sample5;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.StaticMethodMatcher;

public class MyPointCut implements Pointcut {

  @Override
  public ClassFilter getClassFilter() {
    // 匹配所有的类
    return new ClassFilter() {
      @Override
      public boolean matches(Class<?> clazz) {
        // TODO Auto-generated method stub
        return true;
      }
    };
  }

  @Override
  public MethodMatcher getMethodMatcher() {
    // 继承 StaticMethodMatcher，忽略方法实参，只对方法进行动态匹配。
    return new StaticMethodMatcher() {
      @Override
      public boolean matches(Method method, Class<?> targetClass) {
        // 如果方法名称是 go，则匹配，否则不匹配
        if (method.getName().equals("go")) {
          return true;
        }
        return false;
      }
    };
  }

}
