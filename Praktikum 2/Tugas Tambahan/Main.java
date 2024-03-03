//Nama : Rosa Yohana Sinaga
//NIM  : 24060122120009
//Tanggal : 2 Maret 2024
//Deskripsi : Kelas yang berisi program class Main


public class Main{
    public static void main(String[]args){
        WaliMahasiswa waliwali = new WaliMahasiswa("Nina", "082150604538", "Pleburan");
        Mahasiswa Mhs = new Mahasiswa("Rosa", "240601212009", "IF Jaya", waliwali);
        Mhs.cetak();
    }

}