package com.appscharles.libs.generator.services;

import com.appscharles.libs.generator.exceptions.GeneratorException;
import com.appscharles.libs.generator.generators.DirGenerator;
import com.appscharles.libs.generator.generators.FileGenerator;
import com.appscharles.libs.generator.generators.IListFileGenerator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Tree files generator.
 */
public class TreeFilesGenerator implements IGenerator {

    private String rootPath;

    private IListFileGenerator dirGenerator;

    private IListFileGenerator fileGenerator;

    /**
     * Instantiates a new Tree files generator.
     *
     * @param rootPath the root path
     */
    public TreeFilesGenerator(String rootPath) {
        this(rootPath, 12, 12, 3, 3);
    }

    /**
     * Instantiates a new Tree files generator.
     *
     * @param rootPath        the root path
     * @param numberEmptyDirs the number empty dirs
     * @param numberFiles     the number files
     * @param maxDepthDirs    the max depth dirs
     * @param maxDepthFiles   the max depth files
     */
    public TreeFilesGenerator(String rootPath, Integer numberEmptyDirs, Integer numberFiles, Integer maxDepthDirs, Integer maxDepthFiles){
        this.rootPath = rootPath;
        this.dirGenerator = new DirGenerator(this.rootPath, numberEmptyDirs, maxDepthDirs);
        this.fileGenerator = new FileGenerator(this.rootPath, numberFiles, maxDepthFiles);
    }

    @Override
    public List<File> random() throws GeneratorException {
        List<File> files = new ArrayList<>();
        try {
            files.addAll(this.dirGenerator.random());
            files.addAll(this.fileGenerator.random());
        } catch (IOException e) {
            throw new GeneratorException(e);
        }
        return files;
    }
}
