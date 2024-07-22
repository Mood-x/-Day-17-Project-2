public abstract class Passenger {
    private String name;
    private String ID;
    private Car reservedCar;
    private double tripCost;

    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public abstract void reservedCar(Car car) throws Exception;
    public abstract void calcTripCost(Car car);

    public void info(){
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger ID: " + ID);
        if(reservedCar != null){
            System.out.println("Car Code: " + reservedCar.getCode());
            System.out.println("Route Price: " + reservedCar.getRoute().getPrice());
            System.out.println("Trip Cost: " + tripCost);
        }
    }

    public void setReservedCar(Car reservedCar){
        this.reservedCar = reservedCar;
    }

    public void setTripCost(double tripCost){
        this.tripCost = tripCost;
    }
}
