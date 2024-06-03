//Nama : Rosa Yohana Sinaga
//NIM  : 24060122120009

public class Truck extends Vehicle {
    private double maxLoad;

    public Truck(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public double calcFuelEfficiency(){
        return maxLoad * 1.5;
    }
    public double calcTripDistance(){
        return 1500.00;
    }
}