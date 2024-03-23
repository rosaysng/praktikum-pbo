package org.main;

import org.walimahasiswa.*;
import org.mahasiswa.*;

public class Main{
    public static void main(String[]args){
        System.out.println("Informasi WaliMahasiswa");
        WaliMahasiswa waliMhs = new WaliMahasiswa("Adhe", "12190933120009", "08214405065221", "Jl. Banjarsari");
        waliMhs.cetak();
        System.out.println("\nInformasi Mahasiswa");
        Mahasiswa mhs = new Mahasiswa("Rosa Sinaga", "1201120620040001", "2406012212009", "Informatika", waliMhs);
        mhs.cetak();
       
    }
}