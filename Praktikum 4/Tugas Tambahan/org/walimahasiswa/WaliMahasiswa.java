package org.walimahasiswa;

import org.orang.Orang;

public class WaliMahasiswa extends Orang{
    protected String noHp, alamat;

    public WaliMahasiswa(String nama, String nik, String noHp, String alamat){
        super(nama,nik);
        this.noHp = noHp;
        this.alamat = alamat;
    }
    public String getNoHP(){
        return this.noHp;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public void setNoHP(String noHp){
        this.noHp = noHp;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void cetak(){
        super.cetak();
        System.out.println("Nomor HP  :" +getNoHP());
        System.out.println("Alamat    :" +getAlamat());
        
    }

    public String toString() {
        return "WaliMahasiswa{" +
                "nama='" + nama + '\'' +
                ", noHp='" + noHp + '\'' +
                ", nik='" + nik + '\'' +
                ", alamat='" + alamat + '\'' +
                '}';
    }
} 