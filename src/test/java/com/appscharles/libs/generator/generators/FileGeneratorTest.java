package com.appscharles.libs.generator.generators;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * The type File generator test.
 */
public class FileGeneratorTest {

    /**
     * The Temp.
     */
    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    /**
     * Should generate files.
     *
     * @throws IOException the io exception
     */
    @Test
    public void shouldGenerateFiles() throws IOException {
        File root = this.temp.newFolder();
        IListFileGenerator fileGenerator = new FileGenerator(root.getPath(), 12, 3);
        fileGenerator.random();
    }

    /**
     * Should exist all generated files.
     *
     * @throws IOException the io exception
     */
    @Test
    public void shouldExistAllGeneratedFiles() throws IOException {
        File root = this.temp.newFolder();
        IListFileGenerator fileGenerator = new FileGenerator(root.getPath(), 12, 3);
        List<File> files =  fileGenerator.random();
        assertEquals(files.size(), 12);
        files.forEach((file) ->{
            assertTrue(file.exists());
        });
    }
}