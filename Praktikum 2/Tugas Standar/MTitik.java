//Nama : Rosa Yohana Sinaga
//NIM  : 24060122120009
//Tanggal : 28 Februari 2024
//Deskripsi : Kelas yang berisi program class titik

public class MTitik {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
		Titik t3;

		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik(5, 6);


		t1.setAbsis(5);
		t1.setOrdinat(7);
		t2.setAbsis(5);
		t2.setOrdinat(7);
		
		int counterTitik;
		float absis;
		float ordinat;

		counterTitik = Titik.getCounterTitik();
		System.out.println("Jumlah objek titik: " + counterTitik);

		absis = t1.getAbsis();
		ordinat = t1.getOrdinat();
		System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);
		System.out.println("t1("+absis + ", " + ordinat + ")");
		
		absis = t2.getAbsis();
		ordinat = t2.getOrdinat();
		System.out.printf("t2(%.1f, %.1f)\n", absis, ordinat);
		System.out.println("t2("+absis + ", " + ordinat + ")");

		absis = t3.getAbsis();
		ordinat = t3.getOrdinat();
		System.out.printf("t3(%.1f, %.1f)\n", absis, ordinat);
		System.out.println("t3("+absis + ", " + ordinat + ")");

		System.out.println("Jarak titik t1 terhadap titik pusat: " +t1.getJarakPusat());

		t3.refleksiX();
		t3.refleksiY();
		System.out.println("Titik sekarang: (" +t3.getAbsis() + "," + t3.getOrdinat()+ ")");

		Titik t4 = t2.getRefleksiX();
		System.out.println("Refleksi x : (" + t4.getAbsis() + "," + t4.getOrdinat()+ ")");
		Titik t5 = t1.getRefleksiY();
		System.out.println("Refleksi y:(" + t5.getAbsis() + "," + t5.getOrdinat() + ")");

		
		Garis garis2 = new Garis(new Titik(1,2), new Titik(3,5)); 
        System.out.println("Titik Awal Garis2 : ("+ garis2.getTitikAwal().getAbsis()+", "+garis2.getTitikAwal().getOrdinat()+")"); 
        System.out.println("Titik Awal Garis2 : ("+ garis2.getTitikAkhir().getAbsis()+", "+garis2.getTitikAkhir().getOrdinat()+")");
		System.out.println("Tiitk awal garis2: ("+garis2.getTitikAwal().getAbsis()+","+garis2.getTitikAwal().getOrdinat());
		System.out.println("Titik akhir garis2: ("+ garis2.getTitikAkhir().getAbsis() +","+garis2.getTitikAkhir().getOrdinat());
	}

}
//Kesimpulan:
//