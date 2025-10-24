import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Car[] cars = new Car[3];
        cars[0] = new Car(0, "Toyota", "Fielder", 2016, "black", 2000000,
      "К001ЕК");
        cars[1] = new Car(1, "Toyota", "Crown", 2024, "white", 6000000,
      "Х452АХ");
        cars[2] = new Car(2, "Nissan", "Serena", 2018, "white", 3000000,
      "К439ОР");

        Car[] filtered_by_brand = get_car_by_brand(cars, "Toyota");
      
        System.out.println("Выборка по марке:");
        if (filtered_by_brand.length != 0)
        {
            for (Car car : filtered_by_brand)
            {
                if (car == null) break;
                System.out.println(car.getId() + " " + car.get_brand() + " " +
                    car.get_model() + " " + car.get_year());
            }
        }

        int expluatation = 2;
        Car[] filtered_by_brand_and_yearsOfUsing =
            get_car_by_brand_and_year(cars, "Toyota", expluatation);
      
        System.out.println("\nВыборка по марке и сроку эксплуатации не более чем "
            + expluatation + " лет:");
        if (filtered_by_brand_and_yearsOfUsing.length != 0)
        {
            for (Car car : filtered_by_brand_and_yearsOfUsing)
            {
                if (car == null) break;
                System.out.println(car.getId() + " " + car.get_brand() + " " +
                    car.get_model() + " " + car.get_year());
            }
        }
    }

    //  Выборка машин по марке
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

    //  Вывод списка машин, фильтрованых по марке и пределу эксплуатации
    static Car[] get_car_by_brand_and_year(Car[] cars, String brand, int years)
    {
        //  Выясняем какой сейчас год для вычисления срока службы
        //  Метод Deprecated, но работает
        Date now = new Date();
        int current_year = now.getYear() + 1900;
        System.out.println("Сейчас " + current_year + " год");

        Car[] result = new Car[3];
        int index = 0;

        for (Car car : cars)
        {
            if (car.get_brand() == brand && 
                (current_year - car.get_year()) > years)
            {
                result[index] = car;
                index++;
            }
        }

        return result;
    }
}
