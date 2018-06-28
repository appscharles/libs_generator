package com.appscharles.libs.generator.generators;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * The type String generator test.
 */
public class StringGeneratorTest {

    private final IStringGenerator stringGenerator = new StringGenerator(new IntegerGenerator());

    /**
     * Should contains string.
     */
    @Test
    public void shouldContainsString(){
        String string = this.stringGenerator.random(2, 5);
        assertTrue(string.length() > 1);
        assertTrue(string.length() < 6);
    }

    /**
     * Should contains six characters.
     */
    @Test
    public void shouldContainsSixCharacters(){
        String string = this.stringGenerator.random(6, 6);
        assertEquals(string.length(), 6);
    }


}