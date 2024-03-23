import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    private double jarijari;

    public Lingkaran(double r){
        jarijari = r;
    }

    public double hitungLuas(){
        return PI*jarijari*jarijari;
    }
    
}
