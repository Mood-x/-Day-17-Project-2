public class Car {
    private String code;
    private Route route;
    private int maximumCapacity;

    public Car(String code, Route route, int maximumCapacity) {
        this.code = code;
        this.route = route;
        this.maximumCapacity = maximumCapacity;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String getCode(){
        return code;
    }

    public int getMaximumCapacity(){
        return maximumCapacity;
    }

    public Route getRoute(){
        return route;
    }
}
