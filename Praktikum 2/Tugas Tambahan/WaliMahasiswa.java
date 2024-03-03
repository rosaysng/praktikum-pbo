//Nama : Rosa Yohana Sinaga
//NIM  : 24060122120009
//Tanggal : 2 Maret 2024
//Deskripsi : Kelas yang berisi program class WaliMahasiswa


class WaliMahasiswa{
    private String nama;
    private String nomorHP;
    private String alamat;


    public WaliMahasiswa(String nama, String nomorHP, String alamat){
        this.nama = nama;
        this.nomorHP = nomorHP;
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public String getNomorHP(){
        return nomorHP;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNomorHP(String nomorHP){
        this.nomorHP = nomorHP;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

   
    public void cetak(){
        System.out.println("Nama      :" +nama);
   
        System.out.println("nomorHP   :" + nomorHP);
        System.out.println("Alamat    :" + alamat);
    }
}
