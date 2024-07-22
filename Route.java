public class Route {
    private String startPickupAddr;
    private String destinationAddr;
    private double price;

    public Route(String startPickupAddr, String destinationAddr, double price){
        this.startPickupAddr = startPickupAddr;
        this.destinationAddr = destinationAddr;
        this.price = price;
    }

    public void setStartPickupAddr(String startPickupAddr){
        this.startPickupAddr = startPickupAddr;
    }

    public void setDestinationAddr(String destinationAddr){
        this.destinationAddr = destinationAddr;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getStartPickupAddr(){
        return startPickupAddr;
    }

    public String getDestinationAddr(){
        return destinationAddr;
    }

    public double getPrice(){
        return price;
    }
}
