/*Nama       : Rosa Sinaga
 * NIM       : 24060122120009
 * File      : MPoligon.java
 * Deskripsi : driver class untuk poligon perdegi panjang dan segitiga
 */


package org.main;

import org.bangunDatar.*;
public class MPoligon {
    public static void main(String[]args){
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: " + persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(5, 6, 4);
        segitiga.printInfo();
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());

    }
    
}
