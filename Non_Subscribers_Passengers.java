public class Non_Subscribers_Passengers extends Passenger{

    private boolean discountCoupon;

    public Non_Subscribers_Passengers(String name, String ID, boolean discountCoupon){
        super(name, ID);
        this.discountCoupon = discountCoupon;
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
        if(discountCoupon){
            setTripCost(car.getRoute().getPrice() * 0.9);
        }else {
            setTripCost(car.getRoute().getPrice());
        }
    }
}
