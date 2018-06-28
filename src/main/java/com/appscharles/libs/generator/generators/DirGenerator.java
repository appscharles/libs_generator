package com.appscharles.libs.generator.generators;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Dir generator.
 */
public class DirGenerator extends AbstractFileGenerator {

    private String rootPath;

    private Integer number;

    private Integer maxDepth;

    /**
     * Instantiates a new Dir generator.
     *
     * @param rootPath the root path
     * @param number   the number
     * @param maxDepth the max depth
     */
    public DirGenerator(String rootPath, Integer number, Integer maxDepth) {
        this.rootPath = rootPath;
        this.number = number;
        this.maxDepth = maxDepth;
        this.integerGenerator = new IntegerGenerator();
        this.stringGenerator = new StringGenerator(this.integerGenerator);
    }

    @Override
    public List<File> random() {
        List<File> dirs = new ArrayList<>();
        for (Integer i = 0; i < this.number; i++) {
            Integer depth = this.integerGenerator.random(0, this.maxDepth);
            String relativePath = createRelativePath(depth);
            File dir = new File(this.rootPath, relativePath);
            dir.mkdirs();
            dirs.add(dir);
        }
        return dirs;
    }
}
