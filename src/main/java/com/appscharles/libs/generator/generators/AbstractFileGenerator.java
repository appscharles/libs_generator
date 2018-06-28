package com.appscharles.libs.generator.generators;

/**
 * The type File generator abstract.
 */
public abstract class AbstractFileGenerator implements IListFileGenerator {

    /**
     * The Integer generator.
     */
    protected IIntegerGenerator integerGenerator;

    /**
     * The String generator.
     */
    protected IStringGenerator stringGenerator;

    /**
     * Create relative path string.
     *
     * @param depth the depth
     * @return the string
     */
    protected String createRelativePath(Integer depth) {
        StringBuilder path = new StringBuilder();
        Integer i = 0;
        do {
            path.append("/");
            path.append(this.stringGenerator.random(5, 10));
        } while (i++ < depth);
        return path.toString();
    }
}
