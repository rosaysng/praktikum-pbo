/* Nama      : Rosa Yohana Sinaga
 * NIM       : 24060122120009
 * File      : Mahasiswa.java
 * Deskripsi : kelas implementasi IArea berupa
 *             cara menghitung luas lingkaran
 */

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
