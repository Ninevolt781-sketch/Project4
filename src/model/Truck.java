package model;

public class Truck extends Vehicle {
    public Truck(){
        super("Truck", 750);

    }

    @Override
    public double calculateRent(double days) {
        return (getrent_price() * days);
    }
    
    
}
