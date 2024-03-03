//Nama : Rosa Yohana Sinaga
//NIM  : 24060122120009
//Tanggal : 2 Maret 2024
//Deskripsi : Kelas yang berisi program class Mahasiswa

class Mahasiswa{
    private String nama;
    private String NIM;
    private String jurusan;
    private WaliMahasiswa wali;
    private String Wali;

    public Mahasiswa(String nama, String NIM, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String  getNama(){
        return nama;
    }

    public String getNIM(){
        return NIM;
    }

    public String getJurusan(){
        return jurusan;
    }

    public String getWali(){
        return Wali;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNIM(String NIM){
        this.NIM= NIM;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }

    public void cetak(){
        System.out.println("Nama      :" +nama);
        System.out.println("NIM       :" + NIM);
        System.out.println("Jurusan   :" + jurusan);
        System.out.println("Wali      :" + wali);

        wali.cetak();
    }  

}
