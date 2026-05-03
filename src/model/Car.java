package model;

public class Car extends Vehicle {
    public Car(){
        super("Car", 500);
    }

    @Override
    public double calculateRent(double days) {
        return (getrent_price() * days);
    }
    
}
