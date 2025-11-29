package com.bookstore.analyzers.core;

import java.io.IOException;

public interface FileProcessor
{
    void readData(String fileName) throws IOException;
    void writeData(String fileName) throws IOException;
    String getProcessingStats();
    boolean validateFileFormat(String fileName);
}
