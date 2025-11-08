import java.util.LinkedList;

public class Cache<T>
{
    public LinkedList<T> data;
    private int maxSize;

    public Cache(int maxSize)
    {
        this.maxSize = maxSize;
        data = new LinkedList<>();
    }

    public void add(T item)
    {
        if (data.size() < maxSize)
        {
            data.add(item);
        }
        else
        {
            data.remove(data.getFirst());
            data.add(item);
        }
    }

    public boolean remove(T item)
    {
        return data.remove(item);
    }

    public boolean exists(T item)
    {
        return data.contains(item);
    }

    public T getFirst()
    {
        return data.getFirst();
    }

    public T getLast()
    {
        return data.getLast();
    }

    public T getElementById(int index)
    {
        return data.get(index);
    }

    public void printData()
    {
        for (T iterable_element : data)
        {
            System.out.println(iterable_element);    
        }
        
        System.out.println(""); 
    }
}
