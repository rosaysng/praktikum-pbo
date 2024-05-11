import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<>();

        //tambahkan elemen coba
        strings.add("Praktikum");
        strings.add("Collection");
        strings.add("dan generic");

        for(String s:strings){
            System.out.print(s + " ");
        }
    }
}