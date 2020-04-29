package com.xksquare.pattern.design.mediator.sample1;

/**
 * @param <M>
 * @param <T>
 * @ClassName: Tuple
 * @Description:TODO(元祖封装枚举)
 * @author: marker/lyl
 * @date: 2019年2月20日 上午10:14:46
 */
public class Tuple<M, T> {
    private final M m;
    private final T t;

    public Tuple(M m, T t) {
        this.m = m;
        this.t = t;
    }

    public M getM() {
        return m;
    }

    public T getT() {
        return t;
    }
}
