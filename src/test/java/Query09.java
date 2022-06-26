import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Query09 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/batch59?serverTimezone=UTC", "root", "Buraya kendi sifrenizi yazacaksiniz.");

        PreparedStatement tablo = con.prepareStatement("insert into urunler values(?, ?, ?)");

        // SORU: urunler tablosuna aşağıdaki verileri toplu bir şekilde etkileyin

        List<Urun> kayitlar = new ArrayList<>();
        kayitlar.add(new Urun(200, "Asus", 7500));
        kayitlar.add(new Urun(201, "HP", 8500));
        kayitlar.add(new Urun(202, "Acer", 9500));
        kayitlar.add(new Urun(203, "Monster", 11500));
        kayitlar.add(new Urun(204, "Klavye", 1200));
        kayitlar.add(new Urun(205, "Fare", 1000));

        PreparedStatement tablo1 = con.prepareStatement("insert into urunler values(?, ?, ?)");
        for(Urun each:kayitlar){
            tablo1.setInt(1, each.getId());
            tablo1.setString(2, each.getIsim());
            tablo1.setDouble(3, each.getFiyat());
            tablo1.addBatch();
        }
        tablo1.executeBatch();
        System.out.println("Veriler Database'e eklendi");


    }
}
