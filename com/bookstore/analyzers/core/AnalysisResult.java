package com.bookstore.analyzers.core;

import java.io.IOException;

public class AnalysisResult
{
    String analyzisType;
    Object resultData;
    boolean success;
    String message;

    public AnalysisResult(String type, Object data, boolean success)
    {
        this.analyzisType = type;
        this.resultData = data;
        this.success = success;
    }

    boolean isSuccess()
    {
        return success;
    }

    String getFormattedResult()
    {
        return null;
    }

    void saveToFile(String filePath) throws IOException
    {

    }

    public String getAnalyzisType()
    {
        return analyzisType;
    }

    public Object getResultData()
    {
        return resultData;
    }

    public String getMessage()
    {
        return message;
    }
}
