package com.appscharles.libs.generator.generators;

/**
 * The interface String generator.
 */
public interface IStringGenerator {

    /**
     * Random string.
     *
     * @param minLength the min length
     * @param maxLength the max length
     * @return the string
     */
    String random(Integer minLength, Integer maxLength);

    /**
     * Random string.
     *
     * @param lenght the lenght
     * @return the string
     */
    String random(Integer lenght);
}
