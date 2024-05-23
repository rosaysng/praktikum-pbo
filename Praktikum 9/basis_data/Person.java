//Nama : Rosa Yohana Sinaga
//NIM  : 24060122120009
//Tanggal : 19 Mei 2024

public class Person{
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }
    public Person(int i, String n){
        id = i;
        name = n;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}