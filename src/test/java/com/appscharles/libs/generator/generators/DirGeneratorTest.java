package com.appscharles.libs.generator.generators;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * The type Dir generator test.
 */
public class DirGeneratorTest {

    /**
     * The Temp.
     */
    @Rule
    public TemporaryFolder temp = new TemporaryFolder();

    /**
     * Should generate dirs.
     *
     * @throws IOException the io exception
     */
    @Test
    public void shouldGenerateDirs() throws IOException {
        File root = this.temp.newFolder();
        IListFileGenerator dirGenerator = new DirGenerator(root.getPath(), 12, 3);
        dirGenerator.random();
    }

    /**
     * Should exist all generated dirs.
     *
     * @throws IOException the io exception
     */
    @Test
    public void shouldExistAllGeneratedDirs() throws IOException {
        File root = this.temp.newFolder();
        IListFileGenerator dirGenerator = new DirGenerator(root.getPath(), 12, 3);
        List<File> dirs =  dirGenerator.random();
        assertEquals(dirs.size(), 12);
        dirs.forEach((dir) ->{
            assertTrue(dir.exists());
        });
    }
}