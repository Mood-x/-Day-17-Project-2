import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Route route = new Route("Jeddah", "Mekkah", 51.50);
        Route route2 = new Route("Ryadh", "Jeddah", 100);

        Car car1 = new Car("2327", route, 0);
        Car car2 = new Car("4070", route2, 2);

        Passenger passenger1 = new Subscribers_Passengers("Mood", "M0111");
        Passenger passenger2 = new Non_Subscribers_Passengers("Ahmed", "A0112", true);

        List <Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);

        List <Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);

        for(int i = 0; i < passengers.size(); i++){
            try{
                passengers.get(i).reservedCar(cars.get(i));
                System.out.println("----------------------");
            }catch(Exception e){
                System.out.println("----------------------");
                System.out.println("ERROR: " + e.getMessage());
            }
            passengers.get(i).info();
        }
    }
}