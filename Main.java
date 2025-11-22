import java.io.IOException;

public class Main {
    public static void main(String[] args) 
    {
        ClassicIOCacheWithLimit cache = new ClassicIOCacheWithLimit(10);
        String path = "/home/e1/Документы/SIBSUTIS_Learnjava/test.txt";
        String path2 = "/home/e1/Документы/SIBSUTIS_Learnjava/test2.txt";

        try
        {
            System.out.println(cache.readFile(path));
            System.out.println(cache.readFile(path2));
        }
        catch (IOException e)
        {
            System.out.println("aaa");
        }

        try
        {
            // Первое чтение - с диска
            String content1 = cache.readFile(path);
            System.out.println(content1);
            // Повторное чтение - из кэша (если файл не изменялся)
            String content2 = cache.readFile(path);
            System.out.println(content2);
        }
        catch (IOException e)
        {
            System.out.println("aaa");
        }
        
        // Проверка наличия в кэше
        if (cache.isCached(path))
        {
            System.out.println("Файл в кэше");
        }
        else
        {
            System.out.println("Файл не в кэше");
        }


        // Получение статистики
        cache.printCacheStats();

        // Очистка конкретного файла из кэша
        cache.invalidate(path);

        // Проверка наличия в кэше
        if (cache.isCached(path))
        {
            System.out.println("Файл в кэше");
        }
        else
        {
            System.out.println("Файл не в кэше");
        }
        // Полная очистка кэша
        cache.invalidateAll();
    }
}
