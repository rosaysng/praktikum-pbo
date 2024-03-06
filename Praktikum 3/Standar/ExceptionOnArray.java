/*Nama : Rosa Yohana Sinaga
 * NIM : 24060122120009
 * File : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 */

public class ExceptionOnArray {
	public static void main(String[] args){
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
			System.out.println(arrayInteger[2]);
		} 
		catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("index error");
		} catch (Exception exception){
			System.out.println("error umum");
		} finally {
			System.out.println("clean up code...");
		}

		System.out.println("test");
	}
}