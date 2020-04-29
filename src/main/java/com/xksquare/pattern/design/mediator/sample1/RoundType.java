package com.xksquare.pattern.design.mediator.sample1;

public enum RoundType {

    //向上保留
    ROUND_UP(0), ROUND_DOWN(1),//向下保留
    //四舍五入
	ROUND_HALF_UP(4);
    private int type;

    private RoundType(int type) {
        this.type = type;
    }

    public int getValue() {
        return this.type;
    }

}
