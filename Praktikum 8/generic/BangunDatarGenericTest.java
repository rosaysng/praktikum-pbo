
public class BangunDatarGenericTest {
    public static void main (String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric <Lingkaran> bdg =
            new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("Tipe generic :" + bdg.get().getClass().getName());
    
        Persegi p = new Persegi(5);
        BangunDatarGeneric<Persegi> bdg2 = new BangunDatarGeneric<>();
        bdg2.set(p);
        System.out.println("Tipe generic:" + bdg2.get().getClass().getName());
        }

}
