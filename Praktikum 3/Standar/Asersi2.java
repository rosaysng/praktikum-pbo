/*Nama : Rosa Yohana Sinaga
 * NIM : 24060122120009
 * File : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran (double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungkeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;

    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungkeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/*Secara konsep, ada yang kurang tepat pada program ini. 
 *Jari-jari tidak boleh bernilai negatif dan minimal 1. 
 *Jadi, seharusnya program tersebut diubah menjadi 
"*Jari lingkaran harus lebih dari nol."  */