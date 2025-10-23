public class Car
{
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private long price;
    private String identification_code;

    public Car(int id, String brand, String model, int year, String color,
               long price, String identification_code) 
    {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.identification_code = identification_code;
    }


    public int getId()
    {
        return this.id;
    }

    public void set_id(int id)
    {
        this.id = id;
    }


    public String get_brand()
    {
        return this.brand;
    }

    public void set_brand(String brand)
    {
        this.brand = brand;
    }


    public String get_model()
    {
        return this.model;
    }

    public void set_model(String model)
    {
        this.model = model;
    }

    
    public int get_year()
    {
        return this.year;
    }

    public void set_year(int year)
    {
        this.year = year;
    }


    public String get_color()
    {
        return this.color;
    }

    public void set_color(String color)
    {
        this.color = color;
    }


    public long get_price()
    {
        return this.price;
    }

    public void set_price(long price)
    {
        this.price = price;
    }


    public String get_identification_code()
    {
        return this.identification_code;
    }

    public void set_identification_code(String identification_code)
    {
        this.identification_code = identification_code;
    }
}