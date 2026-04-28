package model;

public class Truck extends Vehicle {
    public Truck(){
        super("Truck", 750);

    }

    @Override
    public double calculateRent(int days) {
        return (getrent_price() * days);
    }
    
}
