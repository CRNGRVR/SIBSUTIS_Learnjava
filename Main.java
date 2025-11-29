import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.bookstore.models.Book;
import com.bookstore.analyzers.simple.SimpleBookDensityAnalyzer;
import com.bookstore.analyzers.simple.SimpleSalesAnalyzer;

public class Main {
    public static void main(String[] args)
    {
        // test1();
        // test2();
        // test3();
    }

    // static void test1()
    // {
    //     Book b1 = new Book("Преступление и наказание", "то то то", 200000, 1, -200, 0);
    //     Book b2 = new Book("Нормальное преступление и наказание", "Достоевский", 1, 10, 400, 1);
    //     Book b3 = new Book("1с", "Радченко", 20, 40, 0, 2);
    //     Book b4 = new Book("Уголовный кодекс РФ", "молодец", 10, 2, 10000, 3);
    //     Book b5 = new Book("Библия C#", "Всесишарп Индусов", 1, 100, 90, 4);

    //     System.out.println(b1.toString());

    //     System.out.println(b2.toString());
    //     System.out.print("Плотность Достоевского: ");
    //     System.out.println(b2.calculateDensity());

    //     System.out.println(b3.toString());
    //     System.out.println(b4.toString());
    //     System.out.println(b5.toString());
    // }

    // static void test2()
    // {
    //     List<Book> booksList = new ArrayList<>();
    //     booksList.add(new Book("Преступление и наказание", "то то то", 200000, 1, -200, 0));
    //     booksList.add(new Book("Нормальное преступление и наказание", "Достоевский", 1, 10, 400, 1));
    //     booksList.add(new Book("1с", "Радченко", 20, 40, 0, 2));
    //     booksList.add(new Book("Уголовный кодекс РФ", "молодец", 10, 2, 10000, 3));
    //     booksList.add(new Book("Библия C#", "Всесишарп Индусов", 1, 100, 90, 4));

    //     SimpleBookDensityAnalyzer sAnalyzer = new SimpleBookDensityAnalyzer();
    //     sAnalyzer.analyze(booksList);
    //     sAnalyzer.printResult();
    // }

    static void test3()
    {
        //  Заполнение случайными числами
        int[] testValues = new int[30];
        SimpleSalesAnalyzer a = new SimpleSalesAnalyzer();

        for (int i = 0; i < testValues.length; i++)
        {
            testValues[i] = (int)(Math.random() * (500 - 100) + 100);
        }
        
        a.analyzeSalesPeaks(testValues);
        a.displayAnalysis();
    }
}