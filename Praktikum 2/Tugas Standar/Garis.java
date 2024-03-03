public class Garis {
  private Titik titikAwal;
  private Titik titikAkhir;
  static int counterGaris; // Menggunakan tipe data int karena counter umumnya berupa bilangan bulat
  
  // konstruktor
  public Garis() {
      titikAwal = new Titik();
      titikAkhir = new Titik();
      counterGaris++;
  }

  public Garis(Titik titikAwal, Titik titikAkhir) {
      this.titikAwal = titikAwal;
      this.titikAkhir = titikAkhir;
      counterGaris++;
  }

  // method getter dan setter
  public Titik getTitikAwal() {
      return this.titikAwal;
  }

  public Titik getTitikAkhir() {
      return this.titikAkhir;
  }

  public static int getCounterGaris() {
      return counterGaris;
  }

  public void setTitikAwal(Titik titikAwal) {
      this.titikAwal = titikAwal;
  }

  public void setTitikAkhir(Titik titikAkhir) {
      this.titikAkhir = titikAkhir;
  }

  public double getPanjang() {
      double deltaX = titikAkhir.getAbsis() - titikAwal.getOrdinat();
      double deltaY = titikAkhir.getAbsis() - titikAwal.getOrdinat();
      return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
  }

  public double getGradien() {
      // Tangani kasus garis vertikal
      if (titikAwal.getAbsis() == titikAkhir.getOrdinat()) {
          throw new ArithmeticException("Undefined gradien, vertical line");
      }
      return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
  }

  public Garis getRefleksiY() {
      Titik titikRefleksiAwal = new Titik(titikAwal.getAbsis(), -titikAwal.getOrdinat());
      Titik titikRefleksiAkhir = new Titik(titikAkhir.getAbsis(), -titikAkhir.getOrdinat());
      return new Garis(titikRefleksiAwal, titikRefleksiAkhir);
  }

  public boolean isTegakLurus(Garis G) {
    double gradienGaris1 = this.getGradien();
    double gradienGaris2 = G.getGradien();

    // Garis tegak lurus jika perkalian negatif gradiennya adalah -1
    return gradienGaris1 * gradienGaris2 == -1;
  }
}