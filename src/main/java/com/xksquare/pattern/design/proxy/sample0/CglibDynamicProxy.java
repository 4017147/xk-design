package com.xksquare.pattern.design.proxy.sample0;

import java.lang.reflect.Method;

import org.springframework.util.ClassUtils;

import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibDynamicProxy implements MethodInterceptor {

  private Object target;


  public CglibDynamicProxy(Object target) {
    super();
    this.target = target;
  }


  @Override
  public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
      throws Throwable {
    System.out.println("执行方法前-----》》》》》");
    Object res = proxy.invokeSuper(obj, args);
    System.out.println("执行方法后-----》》》》》");
    return res;
  }


  @SuppressWarnings("unchecked")
  public <T> T proxy() {
    Enhancer enhancer = new Enhancer();
    Class<?> superclass = this.target.getClass();
    if (ClassUtils.isCglibProxyClass(this.target.getClass())) {
      superclass = this.target.getClass().getSuperclass();
    }
    enhancer.setSuperclass(superclass);
    enhancer.setCallback(this);
    // 添加 CallbackFilter，让代理类名发生变化
    // 主要是改变了 DefaultNamingPolicy 类中 getClassName 方法的 key 参数的 hashCode 值
    enhancer.setCallbackFilter(new CallbackFilter() {
      @Override
      public int accept(Method method) {
        return 0;
      }
    });
    return (T) enhancer.create();
  }


}
