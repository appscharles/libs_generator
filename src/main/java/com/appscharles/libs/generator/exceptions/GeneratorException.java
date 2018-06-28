package com.appscharles.libs.generator.exceptions;

/**
 * The type Generator exception.
 */
public class GeneratorException extends Exception {
    /**
     * The Serial version uid.
     */
    static final long serialVersionUID = 7818375828146090432L;

    /**
     * Instantiates a new Generator exception.
     */
    public GeneratorException() {
        super();
    }

    /**
     * Instantiates a new Generator exception.
     *
     * @param message the message
     */
    public GeneratorException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Generator exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public GeneratorException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Generator exception.
     *
     * @param cause the cause
     */
    public GeneratorException(Throwable cause) {
        super(cause);
    }
}

