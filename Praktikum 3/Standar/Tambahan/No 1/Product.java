/*
 * File           : Product.java		
 * Nama           : Rosa Sinaga
 * NIM            : 240601222120009
 * Deskripsi      : Kelas yang berisi kelas Product
 */

public class Product {
    private String name;
    private int stock;
    private int price;
    public Product() {
    this.name = "";
    this.stock = 0;
    this.price = 0;
    }
    public Product(String name, int stock, int price) {
    this.name = name;
    this.stock = stock;
    this.price = price;
    }
    public String getName() {
    return name;
    }
    public int getStock() {
    return stock;
    }
    public int getPrice() {
    return price;
    }
    public void setName(String name) {
    // TODO : Tambahkan kode untuk set atribut name dan
    //berikan asersi jika name yang dimasukkan berupa string kosong
    this.name = name;
    assert !name.isEmpty():"Nama tidak boleh kosong";
    System.out.println("Product Name: " + getName());
    }

    public void setStock(int stock) {
    // TODO : Tambahkan kode untuk set atribut stock dan
    //berikan asersi bahwa jumlah stock yang dimasukkan harus
    //bilangan positif
    this.stock = stock;
    assert stock>0: "Jumlah stock yang dimasukkan harus bilangan psotif";
    System.out.println("Product Stock: " + getStock());
    }
    public void setPrice(int price) {
    // TODO : Tambahkan kode untuk set atribut price dan
    //berikan asersi bahwa jumlah stok yang dimasukkan harus
    //bilangan positif
    this.price = price;
    assert price > 0: "Harga yang dimasukkan harus bilangan positif";
    System.out.println("Product Price: " + getPrice());
    }
    public void purchaseProduct(int quantity) {
    // TODO : Tambahkan kode untuk mengurangi stok produk
    //jika dilakukan pembelian. Berikan asersi dimana quantity yang
    //dimasukkan harus bilangan positif dan berikan juga asersi
    //jika stok produk yang tersedia tidak mencukupi.
    stock -= quantity;
    assert quantity > 0: "Quantity pembelian yang dimasukkan harus bernilai positif";
    assert stock >= quantity : "Insufficient stock";

    }
    public void addStock(int quantity) {
    // TODO : Tambahkan kode untuk menambah stok produk.
    //Berikan asersi dimana quantity yang dimasukkan harus bilangan
    //positif
    stock += quantity;
    assert quantity > 0: "Quantity yang dimasukkan harus bilangan positif";
    System.out.println("Product Stock: " + getStock());
    }
    }