package com.xksquare.pattern.design.mediator.sample1;

/**
 * Created with IntelliJ IDEA.
 * created by  chenhongbo[maskwerewolf@163.com]
 * Date: 2018/11/21
 */
public enum Currency {

//
    zs,//钻石
    xkb,//星钻
    xfq,//积分
    xfqs,//商家券
    swq, //实物券
    rmb,//人民币
    xkq,//余额
    wls,//物流余额
    yhq,//优惠券 todo 正常情况下不需要【不是支付币种】
    offline;//线下支付


    /**
     * 核实是否内部收费币种
     */
    public  Boolean inner() {
        return xkb == this  || swq == this || xfq == this || offline == this;
    }
    /**
    *判断是内部支付 并且没有用户账户
    */
    public Boolean innerNoUser(){
        return offline == this;
    }

}
