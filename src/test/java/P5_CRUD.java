import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P5_CRUD {
    // Cok miktarda kayit eklemek icin PreparedStatement metodu kullanilabilir.
    // PreparedStatement hem hizli hem de daha guvenli (SQL injection saldirilari icin) bir yontemdir.
    // ResultSet tum sonucları bellekte tutuyor..  ama guvenli degil..banka hesaplarını dusunun..siber saldırıya ugrasa..
    // bu yuzden database in guvrnligi acisindan PreparedStatement onemlidir..
    // Bunun icin;
    // 	1) Veri girisine uygun bir POJO(Plain Old Java Object) sinifi olusturulur.
    // 	2) POJO Class nesnelerini saklayacak bir collection olusturulur
    // 	3) bir dongu ile kayitlar eklenir.

    // PreparedStatement hizli ve guvenli yontem, bu yontemle cozecegiz
    // POJO class : plain old java object class, bu class calistirilmaz main i yok..
    // bu class private degisken + constructor() + getter() + setter() ve toString() ler iceren class


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/batch60_61?serverTimezone=UTC";
        Connection con = DriverManager.getConnection(url, "root", "elif.12345");  //database baglantisi icin

        Statement st = con.createStatement();  //query calistirmak icin

        // SORU: Dersler adında bir tablo olusturalım (id int, ders_isim varchar(15), egitim_suresi int)


    }

}
