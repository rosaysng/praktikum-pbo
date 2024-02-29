//Nama : Rosa Yohana Sinaga
//NIM  : 24060122120009
//Tanggal : 28 Februari 2024
//Deskripsi : Kelas yang berisi program class titik

public class Titik {
	private float absis;
	private float ordinat;
	private static int counterTitik;

	public Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	public void setAbsis(float a){
		absis = a;
	}
	
	public void setOrdinat(float o){
		ordinat = o;
	}

	public float getAbsis(){
		return absis;
	}

	public float getOrdinat(){
		return ordinat;
	}

	public static int getCounterTitik(){
		return counterTitik;
	}

	public float getJarakPusat(){
		return (float) Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
	}

	public void refleksiX(){
		this.ordinat = -(this.ordinat);
	}

	public void refleksiY(){
		this.absis = this.absis*(-1);
	}

	public Titik getRefleksiX(){
		Titik t = new Titik(this.absis, -(this.ordinat));
		return t;
	}
	public Titik getRefleksiY(){
		Titik t = new Titik (-(this.absis), this.ordinat);
		return t;
	}
	public Titik(float newAbsis, float newOrdinat){
		absis = newAbsis;
		ordinat = newOrdinat;
		counterTitik++;		
	}
	
	
}