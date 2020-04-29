package com.xksquare.pattern.design.mediator.sample1;

import java.util.Random;

public class Enums {
    private static Random rand = new Random(47);

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }
}
