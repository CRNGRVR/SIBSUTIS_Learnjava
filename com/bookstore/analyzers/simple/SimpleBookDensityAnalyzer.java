package com.bookstore.analyzers.simple;
import java.util.ArrayList;
import java.util.List;

import com.bookstore.models.Book;

public class SimpleBookDensityAnalyzer
{
    List<Book> list = new ArrayList<>();
    Book mostDenseBook;
    double maxDensity = 0;

    public void analyze(List<Book> list)
    {
        maxDensity = calculateDensity(list.getFirst());
        for (Book book : list)
        {
            double den = book.calculateDensity();
            if (maxDensity < den)
            {
                maxDensity = den;
                mostDenseBook = book;
            }
        }
    }

    public void printResult()
    {
        System.out.print("\n" + "Самая плотная книга: " +
                         mostDenseBook.toString() + ", плотность: " +
                         maxDensity + "гр/см^3\n");
    }

    //  Смысла нет
    //  Есть тз
    private double calculateDensity(Book book)
    {
        return book.calculateDensity();
    }
}
