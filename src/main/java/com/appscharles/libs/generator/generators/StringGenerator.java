package com.appscharles.libs.generator.generators;

import java.security.SecureRandom;

/**
 * The type String generator.
 */
public class StringGenerator implements IStringGenerator {

    /**
     * The Characters.
     */
    static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    /**
     * The Secure random.
     */
    static final SecureRandom SECURE_RANDOM = new SecureRandom();

    private final IIntegerGenerator integerGenerator;

    /**
     * Instantiates a new String generator.
     *
     * @param integerGenerator the integer generator
     */
    public StringGenerator(IIntegerGenerator integerGenerator) {
        this.integerGenerator = integerGenerator;
    }

    public String random(Integer minLength, Integer maxLength){
        return random(this.integerGenerator.random(minLength, maxLength));
    }

    public String random(Integer lenght){
        StringBuilder sB = new StringBuilder(lenght);
        for(Integer i = 0; i < lenght ; i++){
            sB.append(CHARACTERS.charAt(SECURE_RANDOM.nextInt(CHARACTERS.length())));
        }
        return sB.toString();
    }
}
