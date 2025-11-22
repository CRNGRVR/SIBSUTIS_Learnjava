import com.bookstore.models.Book;

public class Main {
    public static void main(String[] args)
    {
        Book b1 = new Book("Преступление и наказание", "то то то", 200000, 1, -200, 0);
        Book b2 = new Book("Нормальное преступление и наказание", "Достоевский", 1, 10, 400, 1);
        Book b3 = new Book("1с", "Радченко", 20, 40, 0, 2);
        Book b4 = new Book("Уголовный кодекс РФ", "молодец", 10, 2, 10000, 3);
        Book b5 = new Book("Библия C#", "Всесишарп Индусов", 1, 100, 90, 4);

        System.out.println(b1.toString());
        
        System.out.println(b2.toString());
        System.out.print("Плотность Достоевского: ");
        System.out.println(b2.calculateDensity());

        System.out.println(b3.toString());
        System.out.println(b4.toString());
        System.out.println(b5.toString());


    }
}