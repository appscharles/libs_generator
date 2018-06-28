package com.appscharles.libs.generator.services;

import com.appscharles.libs.generator.exceptions.GeneratorException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

/**
 * The type Tree files generator test.
 */
public class TreeFilesGeneratorTest {

    /**
     * The Temp.
     */
    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    /**
     * Should generated dirs and files.
     *
     * @throws IOException          the io exception
     * @throws InterruptedException the interrupted exception
     */
    @Test
    public void shouldGeneratedDirsAndFiles() throws IOException, GeneratorException {
        File root = this.temp.newFolder();
        IGenerator generator = new TreeFilesGenerator(root.getPath());
        generator.random();
    }

}