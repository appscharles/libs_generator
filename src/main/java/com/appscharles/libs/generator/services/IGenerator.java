package com.appscharles.libs.generator.services;

import com.appscharles.libs.generator.exceptions.GeneratorException;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * The interface Generator.
 */
public interface IGenerator {

    /**
     * Generate.
     *
     * @throws IOException the io exception
     */
    List<File> random() throws GeneratorException;
}
