package com.xksquare.pattern.design.proxy.sample5;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import com.xksquare.pattern.design.proxy.sample1.Animal;
import com.xksquare.pattern.design.proxy.sample1.Cat;


public class Client2 {

  public static void main(String[] args) {
    // 1. 构造目标对象
    Animal catTarget = new Cat();

    // 2. 通过目标对象，构造 ProxyFactory 对象
    ProxyFactory factory = new ProxyFactory(catTarget);
    factory.setProxyTargetClass(true);

    // 添加一个 Advice (DefaultPointcutAdvisor)
    factory.addAdvice(new MyMethodInterceptor());

    // 添加一个 PointcutAdvisor
    MyPointcutAdvistor myPointcutAdvisor = new MyPointcutAdvistor(new MyMethodBeforeAdvice());
    factory.addAdvisor(myPointcutAdvisor);

    // 3. 根据目标对象生成代理对象
    Object proxy = factory.getProxy();

    Animal cat = (Animal) proxy;
    System.out.println(cat.getClass());
    cat.eat();

    System.out.println("---------------------------------------");

    cat.go();
  }

  public static class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
      System.out.println("MyMethodInterceptor invoke 调用 before invocation.proceed");

      Object ret = invocation.proceed();

      System.out.println("MyMethodInterceptor invoke 调用 after invocation.proceed");
      return ret;
    }
  }

  public static class MyMethodBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
      System.out.println("MyMethodBeforeAdvice before 调用");

      System.out.println(method.getName());
    }
  }
}
