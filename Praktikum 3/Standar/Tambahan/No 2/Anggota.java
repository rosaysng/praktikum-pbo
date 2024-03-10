/*
 * File           : Anggota.java		
 * Nama           : Rosa Sinaga
 * NIM            : 240601222120009
 * Deskripsi      : Kelas yang berisi anggota
 */

public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }
    public String getNama() {
        return nama;
    }
    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }
    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }
    public void pinjamBuku(Buku buku) throws BukuTidakTersediaException, MaksimumBukuTerpinjamException {
    /*TODO 2: Buat kondisi untuk mencegah jumlah buku
      yang dipinjam melebihi 3 dengan throw keyword*/
        if (jumlahBukuPinjaman >= bukuPinjaman.length)
            throw new MaksimumBukuTerpinjamException("Anda sudah mencapai maksimum peminjaman buku");
      
    /*TODO 3: Buat kondisi untuk mencegah buku yang
    tidak tersedia dipinjam dengan throw keyword*/
        if (!buku.isTersedia())
            throw new BukuTidakTersediaException("Buku tidak tersedia");

        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
    }
}