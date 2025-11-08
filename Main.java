import java.util.LinkedList;

public class Main {
    public static void main(String[] args)
    {
        Cache<Integer> cache = new Cache<>(3);
        cache.add(1);
        cache.add(2);
        cache.add(3);

        cache.printData();
        cache.add(4);
        cache.printData();
        
        cache.remove(3);
        cache.printData();

        System.out.println(cache.exists(4));
        System.out.println(cache.exists(6));
        System.out.println(cache.getFirst());
        System.out.println(cache.getLast());
        System.out.println(cache.getElementById(1));
    }
}