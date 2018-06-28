package com.appscharles.libs.generator.generators;

import java.security.SecureRandom;

/**
 * The type Integer generator.
 */
public class IntegerGenerator implements IIntegerGenerator {

    /**
     * The Secure random.
     */
    static final SecureRandom SECURE_RANDOM = new SecureRandom();


    @Override
    public Integer random(Integer min, Integer max) {
        return SECURE_RANDOM.nextInt(max - min + 1)+min;
    }
}
