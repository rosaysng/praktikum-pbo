//Nama : Rosa Yohana Sinaga
//NIM  : 24060122120009
//Tanggal : 19 Mei 2024


import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args){
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("Person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("Serialized person name = " +person.getName());
        }
        catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
    
}
