class Kupu{
    void gerak(){
    }    
}
class Ulat extends Kupu{
    void gerak(){
        System.out.println("Ulat merayap");
    }
}
class Kempompong extends Kupu{
    void gerak(){
        System.out.println("Kepompong diam");
    }
}
class KupuDewasa extends Kupu{
    public void gerak(){
        System.out.println("Kupu terbang");
    }
}
class Data <T>{
    T isi;

    T getIsi(){
        return this.isi;
    }
    public void setIsi(T x){
        this.isi = x;
    }
}
public class Main{
public static void main(String [] args){
    //Kamus
    Ulat K;
    Data<Kupu> anu;

    //Algoritma
    K = new Ulat();
    anu = new Data<>();
    anu.setIsi(K);
    anu.setIsi(K);
    anu.getIsi().gerak();
    anu.setIsi(new Kempompong()) ;
    anu.getIsi().gerak();
    anu.setIsi(new KupuDewasa());
    anu.getIsi().gerak();


}
}
