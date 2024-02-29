public class MGaris {
    public static void main(String[] args) {
        // Membuat objek garis dengan konstruktor default
        Garis garis1 = new Garis();
        System.out.println("Panjang Garis 1: " + garis1.getPanjang());

        // Membuat objek titik untuk garis2
        Titik titikAwal = new Titik(1, 2);
        Titik titikAkhir = new Titik(4, 6);
        Garis garis2 = new Garis(titikAwal, titikAkhir);

        // Menghitung dan mencetak panjang garis 2
        System.out.println("Panjang Garis 2: " + garis2.getPanjang());

        // Menghitung dan mencetak gradien garis 2
        System.out.println("Gradien Garis 2: " + garis2.getGradien());

        // Mencetak titik awal dan titik akhir garis 2
        System.out.println("Titik Awal Garis 2: (" + garis2.getTitikAwal().getAbsis() + ", " + garis2.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir Garis 2: (" + garis2.getTitikAkhir().getAbsis() + ", " + garis2.getTitikAkhir().getOrdinat() + ")");

        // Membuat garis baru hasil pencerminan garis 2 terhadap sumbu Y
        Garis garisRefleksiY = garis2.getRefleksiY();
        System.out.println("Titik Awal Garis Refleksi Y: (" + garisRefleksiY.getTitikAwal().getAbsis() + ", " + garisRefleksiY.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik Akhir Garis Refleksi Y: (" + garisRefleksiY.getTitikAkhir().getAbsis() + ", " + garisRefleksiY.getTitikAkhir().getOrdinat() + ")");

        // Menguji apakah garis 1 tegak lurus dengan garis 2
        if (garis1.isTegakLurus(garis2)) {
            System.out.println("Garis 1 tegak lurus dengan Garis 2.");
        } else {
            System.out.println("Garis 1 tidak tegak lurus dengan Garis 2.");
        }
    }
}
