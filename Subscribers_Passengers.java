public class Subscribers_Passengers extends Passenger{

    public Subscribers_Passengers(String name, String ID){
        super(name, ID);
    }


    @Override
    public void reservedCar(Car car) throws Exception{
        if(car.getMaximumCapacity() <= 0){
            throw new Exception("Car capacity is equal or less than zero");
        }
        setReservedCar(car);
        calcTripCost(car);
    }

    @Override
    public void calcTripCost(Car car) {
        setTripCost(car.getRoute().getPrice() * 0.5);
    }

}
