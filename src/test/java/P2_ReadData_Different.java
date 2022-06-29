import com.mysql.cj.x.protobuf.MysqlxExpr;

import java.sql.*;

public class P2_ReadData_Different {

        //MySql de day5 de..personel tablosu


        public static void main(String[] args) throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/batch59?serverTimezone=UTC", "root", "kadirtepecik58.");

            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            // ilk satirdaki ilk objeyi yazdiralim

            String query = "Select * from personel";
            ResultSet resultSet = st.executeQuery(query);
            System.out.println(resultSet.getRow()); //0
            resultSet.first(); //bizi ilk kayida goturur
            Object ilkSAtirdakiObje = resultSet.getObject(1);
            System.out.println(ilkSAtirdakiObje.toString()); //123456789

            // ikinci satirdaki ilk objeyi yazdiralim
            resultSet.next();
            Object ikinciSatirdakiObje = resultSet.getObject(1);
            System.out.println(ikinciSatirdakiObje.toString());


            // ilk sutundaki 5.degeri yazdiralim

            resultSet.absolute(5);
            Object besinciDeger = resultSet.getObject(1);
            System.out.println(besinciDeger.toString());

            // 0.satira gitmemizin sebebi while sorgusu icerisinde bulunan resultSet.next() in bizi
            // birinci kayda goturmesi icindir. Eger 1.satira gidecek olsak while icindeki kod yuzunden yazdirmaya
            // 2.satirdan baslar, tum listeyi alamayiz

            // Tum listeyi yazdirmak istersek;

            resultSet.absolute(0);
            while(resultSet.next()){
                Object idler =resultSet.getObject(1); //1. kolondaki butun objeleri getirir
                System.out.println(idler);
            }


            resultSet.absolute(0);
            while(resultSet.next()){
                Object isimler =resultSet.getObject("isim"); //2. kolondaki butun objeleri getirir
                System.out.println(isimler);
            }


            resultSet.absolute(0);
            while(resultSet.next()){
                Object sehirler =resultSet.getObject("sehir"); //3. kolondaki butun objeleri getirir
                System.out.println(sehirler);
            }








        }

}

