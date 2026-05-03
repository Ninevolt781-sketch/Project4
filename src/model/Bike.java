package model;

public class Bike extends Vehicle {
    public Bike(){
        super("Bike", 99);
    }
    
    @Override
    public double calculateRent(double days) {
        return (getrent_price() * days);
    }
    
}
