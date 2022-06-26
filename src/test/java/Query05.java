import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query05 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "XXXXXXXXXXX");

        Statement st = con.createStatement();

        //SORU: İşçiler adında bir tablo oluşturunuz. id int, birim VARCHAR(10), maas int

        String sorgu = "create table isciler (id int, birim varchar(10), maas int)";

        //st.execute(sorgu);
        System.out.println("isciler tablosu olusturuldu");

        // SORU: İşciler tablosunu siliniz.
        st.execute("drop table isciler");
        System.out.println("isciler tablosu silindi");

        //SORU: isciler tablosuna isim varchar(20), sehir varchar(10) adında 2 tane sutun ekleyiniz.
        st.execute("alter table isciler add isim varchar(20)");
        st.execute("alter table isciler add sehir varchar(10)");
        System.out.println("2 sütun eklendi");

        // SORU: İŞCİLER tablosundaki sehir sütunun ismini ulke olarak değiştirin.
        st.execute("alter table isciler rename column sehir to ulke");
        System.out.println("Sütun ismi değiştirildi");

        //SORU: Tablonun ismini employee olarak değiştirin
        st.execute("alter table isciler rename to employee");
        System.out.println("Tablonun ismi değiştirildi");

        //SORU: ulke sütunun data türünü char(30) yapın
        st.execute("alter table employee modify ulke char(30)");
        System.out.println("Data türü değiştirildi");

    }




    }





