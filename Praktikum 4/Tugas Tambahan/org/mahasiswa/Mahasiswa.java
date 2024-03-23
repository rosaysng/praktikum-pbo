package org.mahasiswa;

import org.orang.Orang;
import org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa extends Orang{
    private String nim, jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali){
        super(nama,nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }
    public String getNIM(){
        return this.nim;
    }
    public String getJurusan(){
        return this.jurusan;
    }
    public WaliMahasiswa getWali(){
        return this.wali;
    }
    public void setNIM(String nim){
        this.nim = nim;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }
    public void cetak(){
        super.cetak();
        System.out.println("NIM       :" +nim);
        System.out.println("Jurusan   :" +jurusan);
        System.out.println("Wali      :" + wali);
    }

    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                ", wali=" + wali +
                '}';
    }
}