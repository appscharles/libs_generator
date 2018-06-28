package com.appscharles.libs.generator.generators;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * The interface List file generator.
 */
public interface IListFileGenerator {

    /**
     * Random list.
     *
     * @return the list
     * @throws IOException the io exception
     */
    List<File> random() throws IOException;
}
