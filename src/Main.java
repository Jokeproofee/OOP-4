import driver.CategoryB;
import driver.CategoryC;
import driver.CategoryD;
import transport.Bus;
import transport.Car;
import transport.Trucks;

public class Main {

    public static void main(String[] args) {
        System.out.println("Легковые автомобили:");
        Car car = new Car("Audi","A8 50 L TDI quattro",3.0);
        Car car1 = new Car("BMW","Z8",3.0);
        Car car2 = new Car("Kia","Sportage 4",2.4);
        Car car3 = new Car("Hyundai","Avante",1.6);

        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car.pitStop();
        car.bestLapTime();
        car.maximumSpeed();

        System.out.println("###############################");
        System.out.println("Автобусы:");
        Bus bus = new Bus("Икарус","350",4.0);
        Bus bus1 = new Bus("Iveco","320",5.0);
        Bus bus2 = new Bus("Fiat","399",3.5);
        Bus bus3 = new Bus("Hyundai","Н350",4.8);

        System.out.println(bus);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

        System.out.println("###############################");
        System.out.println("Грузовые автомобили:");
        Trucks trucks = new Trucks ("Mercedes-Benz","B-901" , 6.6);
        Trucks trucks1 = new Trucks("Nissan", "399", 6.2);
        Trucks trucks2 = new Trucks("Chevrolet","M700", 7.5);
        Trucks trucks3 = new Trucks("Scania","T540", 8.7);

        System.out.println(trucks);
        System.out.println(trucks1);
        System.out.println(trucks2);
        System.out.println(trucks3);

        System.out.println("###############################");
        //Задание 2
        System.out.println("Водители:");
        CategoryB <Car> driverB = new CategoryB<>("Сергей", true, 2);
        CategoryC <Trucks> driverC = new CategoryC<>("Григорий", true, 4);
        CategoryD <Bus> driverD = new CategoryD<>("Станислав", true, 1);

        driverB.race(car2);
        driverC.race(trucks3);
        driverD.race(bus3);
    }
}