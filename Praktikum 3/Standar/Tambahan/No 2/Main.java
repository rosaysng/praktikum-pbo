/*
 * File           : Anggota.java		
 * Nama           : Rosa Sinaga
 * NIM            : 240601222120009
 * Deskripsi      : Kelas yang berisi main
 */

public class Main {
    public static void main(String[] args) {
        Anggota anggota = new Anggota("Rosa");
        Buku buku1 = new Buku("Pemrograman Berbasis Objek");
        Buku buku2 = new Buku("Pemrograman Berbasis Objek2");
        Buku buku3 = new Buku("Pemrograman Berbasis Objek3");
        Buku buku4 = new Buku("Pemrograman Berbasis Objek4");

        try {
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4);  
            System.out.println("Jumlah buku pinjaman:" + anggota.getJumlahBukuPinjaman());

            for (Buku buku : anggota.getBukuPinjaman())
                System.out.println("judul buku yg di pinjam: " + buku.getJudul());
        }catch (BukuTidakTersediaException e) {
            System.out.println(e.getMessage());
        }catch (MaksimumBukuTerpinjamException e){
            System.out.println(e.getMessage());
        }
    
    }
}