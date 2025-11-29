package com.bookstore.analyzers.simple;
import java.util.*;

public class SimpleTitleAnalyzer
{
    String[] bookTitles;
    int[] wordCounts;
    Map<String, Integer> titleStats = new HashMap<>();

    void analyzeBookTitles(String[] titles)
    {
        for (int i = 0; i < titles.length; i++)
        {
            titleStats.put(titles[i], titles[i].length());
            wordCounts[i] = titles[i].length();
        }
    }

    void displayTitleAnalysis()
    {
        for (String string : titleStats.keySet())
        {
            System.out.println("Название: " + string + " - "
                               + titleStats.get(string) + " слов");    
        }
    }

    int countWords(String title)
    {
        int count = 0;
        for (int i = 0; i < title.length(); i++)
        {
            if (title.charAt(i) == ' ')
            {
                count++;
            }
        }

        return count;
    }

    String findLongestTitle()
    {
        int max = 0;
        String longest = null;

        for (String keyString : titleStats.keySet())
        {
            if (titleStats.get(keyString) > max)
            {
                max = titleStats.get(keyString);
                longest = keyString;
            }
        }
        
        return longest;
    }
}
