/*Nama : Rosa Yohana Sinaga
 * NIM  : 24060122120009
 *File : AngkaSial.java
 *Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka +"bukan angka sial");
    }

    public static void main (String[] args){
        AngkaSial as =  new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch (AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("HAti hati memasukkan angka");
        }
    }
}
/*Baris 6 tidak akan dieksekusi karena jika dimasukkan 13, 
 *maka akan terjadi exception  
 *Baris 15 akan dieksekusi jika terjadi exception, 
 *yaitu jika angka diberi nilai 13. Setelah dieksekusi, 
 *maka akan mengeluarkan "hati-hati memasukkan angka!!!"
 */