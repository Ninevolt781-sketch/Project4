package model;

public class InsuredCar extends Car implements Insurable {

    public InsuredCar(){
        super();
    }

    public double getInsurance_price(int days) {
        return (getrent_price() * days) * 0.25;
    }


    
    
}
