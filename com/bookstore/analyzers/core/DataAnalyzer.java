package com.bookstore.analyzers.core;

public abstract class DataAnalyzer
{
    String analyzerName;
    AnalysisResult result;
    boolean analysisComplete;

    public DataAnalyzer(String name) {}
    public abstract void performAnalysis();
    AnalysisResult getResult() { return result; }

    void displayBasicInfo()
    {
        System.out.println(analyzerName);
    }

    protected void setResult(Object data, String type) {}    
}
