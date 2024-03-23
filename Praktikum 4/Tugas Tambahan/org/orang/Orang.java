package org.orang;

public class Orang{
    protected String nama;
    protected String nik;

    public Orang(String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama(){
        return this.nama;
    }
    public String getNIK(){
        return this.nik;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNIK(String nik){
        this.nik = nik;
    }
    public void cetak(){
        System.out.println("Nama      :" +getNama());
        System.out.println("NIK       :" +getNIK());

    }
}