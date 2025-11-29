package com.bookstore.analyzers.simple;

public class SimpleRevenueAnalyzer
{
    double[][] revenueData;
    double[] departmentTotals;
    String[] departmentNames;

    void calculateDepartmentRevenue(double[][] data, String[] names)
    {
        for (int i = 0; i < revenueData.length; i++)
        {
            double summ = 0;
            for (int j = 0; j < revenueData[i].length; j++)
            {
                summ += revenueData[i][j];
            }

            departmentTotals[i] = summ;
        }
    }

    void printRevenueReport()
    {
        for (int i = 0; i < departmentNames.length; i++)
        {
            System.out.println(departmentNames[i] + ": " +
                               departmentTotals[i] + "руб.");    
        }
    }

    double getTotalRevenue()
    {
        return 0;
    }
}
