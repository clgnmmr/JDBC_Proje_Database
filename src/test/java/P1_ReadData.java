import java.sql.*;

public class P1_ReadData {

      //MySql de day3 de..

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/batch59?serverTimezone=UTC", "root", "kadirtepecik58.");

        Statement st = con.createStatement();

        // SORU1: Talebeler tablosundan tum kayitları listeleyiniz.
    /* ResultSet kayitlar=st.executeQuery("select * from talebeler");
       while (kayitlar.next()){

          System.out.printf("%-6d %-15.15s  %-8s\n",kayitlar.getInt(1),kayitlar.getString(2),
                  kayitlar.getString(3),kayitlar.getInt(4));
       }*/

        // SORU2: Talebeler tablosunda notları 90 uzeri olan kayitları listeleyiniz.


       /* ResultSet kayitlarBuyuk90= st.executeQuery("select * from talebeler where yazili_notu>90");
        while (kayitlarBuyuk90.next()){

            System.out.printf("\"%-6d %-15.15s  %-8s\n",kayitlarBuyuk90.getInt(1),kayitlarBuyuk90.getString(2)
            ,kayitlarBuyuk90.getInt(4));
        }*/



        // SORU3: Talebeler tablosunda id'si 124 olan öğrencilerin tüm bilgilerini listeleyiniz.
    /*       ResultSet kayitID124= st.executeQuery("select * from talebeler where id=124");
        while (kayitID124.next()){

            System.out.printf("\"%-6d %-15.15s  %-8s\n",kayitID124.getInt(1),kayitID124.getString(2)
                    ,kayitID124.getInt(4));
        }

*/


        // SORU4: Talebeler tablosunda notu 70 ile 90 arasindaki kisilerin isimlerini listeleyiniz.
      /*  ResultSet kayit7090= st.executeQuery("select * from talebeler where yazili_notu between 70 and 90");
        while (kayit7090.next()){

            System.out.printf("%-6d %-15.15s  %-8s  %6d\n",kayit7090.getInt(1),kayit7090.getString(2),
                    kayit7090.getString(3),kayit7090.getInt(4));
        }
*/

        // SORU5: Talebeler tablosunda isminin 2. harfi e olan kisilerin veli_isimleri ile birlikte listeleyiniz.
        ResultSet kayitHarfE= st.executeQuery("select * from talebeler where isim like '_E%'");
        while (kayitHarfE.next()){

            System.out.printf("%-15.15s  %-8s\n",kayitHarfE.getString(2),
                    kayitHarfE.getString(3));
        }

    }

    }


