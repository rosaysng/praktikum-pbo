//Nama : Rosa Yohana Sinaga
//NIM  : 24060122120009

public class Helicopter extends Airplane {
    private double maxLoad;
    
    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    } 
    public double calcFuelEfficiency(){
        return maxLoad * 2;
    }
    public double calcTripDistance(){
        return 500.0;
    }
    public void takeOff(){
        System.out.println("Helikopter sedang landas");
    }
    public void land(){
        System.out.println("Helikopter sedang mendarat");
    }
    public void fly(){
        System.out.println("Helikopter sedang terbang");
    }
}
