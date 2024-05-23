//Nama : Rosa Yohana Sinaga
//NIM  : 24060122120009
//Tanggal : 19 Mei 2024


import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson (Person person) throws Exception{
        String name = person.getName();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pbo", "root", "rosa");


    //query
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
    //tutup koneksi
        con.close();
    }
    
}
