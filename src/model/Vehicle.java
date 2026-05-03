package model;
public abstract class Vehicle {
    private String name;
    private double rent_price;

    public Vehicle(String name, double rent_price){
        this.name = name;
        this.rent_price = rent_price;
    }

    public String getName(){
        return name;
    }

    public double getrent_price(){
        return rent_price;
    }

    public abstract double calculateRent(double days);


    @Override
    public String toString(){
        return name;
    }
    

    
}
