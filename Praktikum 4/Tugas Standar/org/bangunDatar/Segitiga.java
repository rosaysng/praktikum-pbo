/*Nama       : Rosa Sinaga
 * NIM       : 24060122120009
 * File      : Segitiga.java
 * Deskripsi : Representasi dari objek setiga, turunan kelas poligon
 */

package org.bangunDatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }
    public double hitungLuas(){
        return 0.5*alas*tinggi;
    }
    public void printInfo(){
        System.out.println("Bangun Segitiga Bersisi "+ this.getjumlahSisi());
    }
    
}
