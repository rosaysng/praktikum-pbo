/*
 * File           : BukuTidakTersediaException.java		
 * Nama           : Rosa Sinaga
 * NIM            : 240601222120009
 * Deskripsi      : Kelas yang berisi eksepsi buku tidak tersedia
 */

public class BukuTidakTersediaException extends MaksimumBukuTerpinjamException{
    public BukuTidakTersediaException(String message) {
        super(message);
    }
}