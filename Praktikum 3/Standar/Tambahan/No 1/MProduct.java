/*
 * File           : MProcuct.java		
 * Nama           : Rosa Sinaga
 * NIM            : 240601222120009
 * Deskripsi      : Kelas yang berisi main product
 */

public class MProduct {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 4, 500);
    System.out.println("Product Name: " + product.getName());
    System.out.println("Product Stock: " + product.getStock());
    System.out.println("Product Price: " + product.getPrice());
    product.purchaseProduct(5);
    System.out.println("Product Stock: " + product.getStock());
    }
}
    