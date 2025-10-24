public class Main
{
    public static void main(String[] args)
    {
        Car[] cars = new Car[3];
        cars[0] = new Car(0, "Toyota", "Fielder", 2021, "black", 2000000,
      "К001ЕК");
        cars[1] = new Car(1, "Toyota", "Crown", 2023, "white", 6000000,
      "Х452АХ");
        cars[2] = new Car(2, "Nissan", "Serena", 2016, "white", 3000000,
      "К439ОР");

        Car[] filtered_by_brand = get_car_by_brand(cars, "Toyota");
      
        if (filtered_by_brand.length != 0)
        {
            for (Car car : filtered_by_brand)
            {
                if (car == null) break;
                System.out.println(car.getId() + " " + car.get_brand());
            }
        }
    }

    static Car[] get_car_by_brand(Car[] cars, String brand)
    {
        Car[] result = new Car[3];
        int index = 0;

        for (Car car : cars)
        {
            if (car.get_brand() == brand) 
            {
                result[index] = car;
                index++;
            }
        }

        return result;
    }
}
