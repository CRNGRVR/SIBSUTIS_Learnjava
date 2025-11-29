package com.bookstore.analyzers.advanced;

import java.util.List;

import com.bookstore.analyzers.core.DataAnalyzer;
import com.bookstore.analyzers.core.FileProcessor;
import com.bookstore.analyzers.core.ReportGenerator;

public class FileBookCodeProcessor extends DataAnalyzer
                                   implements FileProcessor, ReportGenerator
{
    public FileBookCodeProcessor(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    List<Integer> allCodes;
    List<Integer> evenCodes;
    List<Integer> oddCodes;

    String currentFilename;

    public void performAnalysis()
    {
        
    }

    public void readData(String filename)
    {

    }

    public void writeData(String filename)
    {

    }

    public String getProcessingStats()
    {
        return null;
    }

    public boolean validateFileFormat(String filename)
    {
        return false;
    }

    public void generateReport()
    {

    }

    void exportResults(String filename)
    {

    }

    public String getReportSummary()
    {
        return null;
    }

    void separateEvenOddCodes()
    {

    }

    void calculateStatistics()
    {

    }

    void validateCode(int code)
    {

    }

    @Override
    public void exportResults() {
        throw new UnsupportedOperationException("Unimplemented method 'exportResults'");
    }
}
