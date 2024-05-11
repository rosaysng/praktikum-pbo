public class Persegi extends BangunDatar {
    private int sisi;

    public Persegi(int sisi){
        this.sisi = sisi;
    }
    public double hitungKeliling(){
        return (double) 4*sisi;
    }
}

