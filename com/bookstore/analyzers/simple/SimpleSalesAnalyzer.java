package com.bookstore.analyzers.simple;
import java.util.*;

public class SimpleSalesAnalyzer
{
    public int[] dailySailes;
    List<Integer> peakDays = new ArrayList<>();;
    int peakCount = 0;

    public void analyzeSalesPeaks(int[] sales)
    {
        for (int i = 0; i < sales.length - 1; i++)
        {
            if (isPeak(sales[i], sales[i + 1]))
            {
                peakDays.add(i);
                peakCount++;
            }
        }
    }

    public void displayAnalysis()
    {
        System.out.print("Дни с пиком: ");
        for (Integer i : peakDays) 
        {
            System.out.print(i + " ");
        }
        System.out.println("| Всего " + peakCount + " дней");
    }

    private boolean isPeak(int currentDay, int nextDay)
    {
        return currentDay > nextDay;
    }
}