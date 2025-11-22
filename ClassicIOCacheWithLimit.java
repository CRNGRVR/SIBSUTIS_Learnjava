import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class ClassicIOCacheWithLimit
{
    int maxSize;
    Map<String, FileCacheEntry> cache = new HashMap<>();

    public ClassicIOCacheWithLimit(int maxSize)
    {
        this.maxSize = maxSize;
    }

    public ClassicIOCacheWithLimit()
    {
        this(100);
    }

    String readFile(String filePath) throws IOException
    {
        System.out.println("Попытка чтения файла " + filePath);
        File file = new File(filePath);

        //  Проверка наличия файла
        if (!file.exists())
        {
            throw new FileNotFoundException("File not exist.");
        }

        String fs_absolutePath = file.getAbsolutePath();
        long fs_lastModifiedTime = file.lastModified();

        if (isCached(filePath))
        {
            System.out.println("Файл находится в кэше");
            if (isCacheValid(cache.get(filePath), fs_lastModifiedTime) )
            {
                System.out.println("Файл в кэше актуален");
                //  Обновление времени чтения
                FileCacheEntry c = cache.get(filePath);
                c.lastReadTime = Instant.now().getEpochSecond();
                cache.put(filePath, c);

                return cache.get(filePath).content;
            }
        }

        /// TASK:  Удалить самый давний
        if (cache.size() == maxSize)
        {
            //  Поиск самого раннего доступа
            long min = cache.get(cache.keySet().iterator().next()).lastReadTime;
            for (String keyString : cache.keySet())
            {
                if (cache.get(keyString).lastReadTime < min)
                {
                    min = cache.get(keyString).lastReadTime;
                }
            }

            //  Уничтожение
            for (String keyString : cache.keySet())
            {
                if (cache.get(keyString).lastReadTime == min)
                {
                    invalidate(keyString);
                    break;
                }
            }
        }
        
        return updateCache(file, fs_absolutePath, fs_lastModifiedTime);
    }

    private boolean isCacheValid(FileCacheEntry cachedEntry, long
                                 currentModifiedTime)
    {
        return (cachedEntry.lastModifiedTimeAtRead == currentModifiedTime);
    }

    private String updateCache(File file, String absolutePath,
                               long currentModifiedTime) throws IOException
    {
        String newContent = readFileContent(file);
        cache.put(absolutePath, new FileCacheEntry(newContent, Instant.now().getEpochSecond(),
                                                 currentModifiedTime));
        return cache.get(absolutePath).content;
    }

    private String readFileContent(File file)
    {
        String buff = new String();
        FileReader fileReader = null;
        BufferedReader buffReader = null;

        try
        {
            fileReader = new FileReader(file);
            buffReader = new BufferedReader(fileReader, 8192);

            while (buffReader.ready())
            {
                buff = buff.concat(buffReader.readLine());
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                buffReader.close();
                fileReader.close();
            }
            catch (IOException ee)
            {
                System.out.println(ee.getMessage());
            }
        }
        
        return buff;
    }

    void invalidate(String filePath)
    {
        if (isCached(filePath))
        {
            cache.remove(filePath);
        }
    }

    void invalidateAll()
    {
        cache.clear();
    }

    boolean isCached(String filePath)
    {
        if (cache.size() > 0)
        {
            return cache.containsKey(filePath);
        }
        else return false;
    }

    int getCachedFilesCount()
    {
        return cache.size();
    }

    //  Размер кэша без учёта метаданных
    long getCacheSizeInMemory()
    {
        long size = 0;
        for (String key : cache.keySet())
        {
            size += (cache.get(key).content.length() * 2);    
        }

        return size;
    }

    void printCacheStats()
    {
        System.out.println("\n\nСтатистика: ");
        System.out.println("Кол-во файлов: " + getCachedFilesCount());
        System.out.println("Размер файлов в памяти: " + getCacheSizeInMemory());
        System.out.println("");
        System.out.println("Список файлов: ");
        for (String iterable_element : cache.keySet())
        {
            System.out.print(iterable_element + " ");
            System.out.print("Последнее время прочтения: ");
            System.out.print(cache.get(iterable_element).lastReadTime);
            System.out.print(" размер файла: ");
            System.out.print(cache.get(iterable_element).content.length() * 2);
            System.out.println("");
        }
    }
}