package com.appscharles.libs.generator.generators;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The type File generator.
 */
public class FileGenerator extends AbstractFileGenerator {

    private String rootPath;

    private Integer number;

    private Integer maxDepth;

    /**
     * Instantiates a new File generator.
     *
     * @param rootPath the root path
     * @param number   the number
     * @param maxDepth the max depth
     */
    public FileGenerator(String rootPath, Integer number, Integer maxDepth) {
        this.rootPath = rootPath;
        this.number = number;
        this.maxDepth = maxDepth;
        this.integerGenerator = new IntegerGenerator();
        this.stringGenerator = new StringGenerator(this.integerGenerator);
    }

    @Override
    public List<File> random() throws IOException {
        List<File> files = new ArrayList<>();
        for (Integer i = 0; i < this.number; i++) {
            Integer depth = this.integerGenerator.random(0, this.maxDepth);
            String relativePath = createRelativePath(depth) + "." + this.stringGenerator.random(3);
            File file = new File(this.rootPath, relativePath);
            file.getParentFile().mkdirs();
            file.createNewFile();
            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file), "UTF-8"))) {
                writer.write(this.stringGenerator.random(100, 2000));
            }
            files.add(file);
        }
        return files;
    }
}
