package model;

public class InsuredCar extends Vehicle implements Insurable {
    

    public InsuredCar(){
        super("Insured Car", 500);
        
    }

    public double getInsurance_price(double days) {
        double insurance_price =  (getrent_price() * days) * 0.25;
        return insurance_price;
    }
    @Override
    public double calculateRent(double days){
        return (getrent_price()  * days) + getInsurance_price(days);

    }

     @Override
    public String toString(){
        return "Insured Car";
    }
    



    
    
}
