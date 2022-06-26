import java.sql.*;

public class Query02 {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "kadirtepecik58.");



        Statement st = con.createStatement();


        // SORU01: ÖĞRENCİLER TABLOSUNDAKİ ERKEK ÖĞRENCİ BİLGİLERİ GETİRİN

        ResultSet veri=st.executeQuery("select * from ogrenciler where cinsiyet ='E'");

        while (veri.next()){
           /* System.out.println(veri.getInt(1) + veri.getString(2)
                    + veri.getString(3) + veri.getString(4));*/
            System.out.printf("%-6d %-15.15s %-8s %-8s\n", veri.getInt(1), veri.getString(2), veri.getString(3), veri.getString(4));
        }
        System.err.print("=======================================================================================================");

        //SORU02: ÖĞRENCİLER TABLOSUNDAKİ  9 SINIF KIZ ÖĞRENCİ BİLGİLERİ GETİRİN

        ResultSet veri1=st.executeQuery("select * from ogrenciler where sinif='9' and cinsiyet ='K'");
        while (veri1.next()){
           /* System.out.println(veri.getInt(1) + veri.getString(2)
                    + veri.getString(3) + veri.getString(4));*/
            System.out.printf("%-6d %-15.15s %-8s %-8s\n", veri1.getInt(1), veri1.getString(2), veri1.getString(3), veri1.getString(4));
        }
    }
}
