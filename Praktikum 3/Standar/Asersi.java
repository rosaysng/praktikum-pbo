/*Nama : Rosa Yohana Sinaga
 * NIM : 24060122120009
 * File : Asersi.java
 * Deskripsi : Program untuk menunjukkan asersi
 */

public class Asersi{
    public static void main(String[]args){
        int x = 10;
        if (x>0){
            System.out.println("Nilai x positif");       
        }else{
            assert(x>0):"ada kesalahan kode";
            System.out.println("nilai x negatif");
        }
    }
}