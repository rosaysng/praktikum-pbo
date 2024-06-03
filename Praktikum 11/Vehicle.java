//Nama : Rosa Yohana Sinaga
//NIM  : 24060122120009

public abstract class Vehicle {
    public abstract  double calcFuelEfficiency();
    public abstract double calcTripDistance();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}