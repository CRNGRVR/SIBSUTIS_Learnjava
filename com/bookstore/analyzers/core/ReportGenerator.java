package com.bookstore.analyzers.core;

public interface ReportGenerator
{
    void generateReport();
    void exportResults();
    String getReportSummary();
}
