import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query06 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/batch59?serverTimezone=UTC", "root", "Buraya kendi sifrenizi yazacaksiniz.");

        Statement st = con.createStatement();

        // SORU1: Bölümler tablosunda yeni bir kayıt (80, 'ARGE', 'ISTANBUL')

        //int s1 = st.executeUpdate("insert into bolumler values (80, 'ARGE', 'ISTANBUL')");
        //System.out.println(s1+ " Satir eklendi");

        // executeUpdate etkilenen satir sayisisni döndürür.

        // SORU2; Bölümler tablosuna birden fazla kayıt ekleyelim.
        // 1. yol
        /*
        String [] veri1 = {"insert into bolumler values (95, 'YEMEKHANE', 'ISTANBUL')",
                "insert into bolumler values (85, 'OFIS1', 'ANKARA')",
                        "insert into bolumler values (75, 'OFIS2', 'TRABZON')"};
        int count=0;
        for(String each:veri1){
            count = count + st.executeUpdate(each);
        }
        System.out.println(count + " data eklendi");
        // 2. yol
        String [] veri2 = {"insert into bolumler values (81, 'YEMEKHANE', 'ISTANBUL')",
                "insert into bolumler values (82, 'OFIS1', 'ANKARA')",
                "insert into bolumler values (83, 'OFIS2', 'TRABZON')"};
        for(String each:veri2){
            st.addBatch(each);  // Yukaridaki verilerin tamamını bir araya topluyor
        }
        st.executeBatch();      // Biraya getirilel verileri tek seferde gönderiyor
        System.out.println("Veriler database eklendi");
*/
        // SORU3; Bölümler tablosuna birden fazla kayıt ekleyelim.
        String [] veri3 = {"insert into bolumler values (100, 'YEMEKHANE', 'ISTANBUL')",
                "insert into bolumler values (101, 'OFIS1', 'ANKARA')",
                "insert into bolumler values (102, 'OFIS2', 'TRABZON')",
                "insert into bolumler values (103, 'OFIS2', 'TRABZON')",
                "insert into bolumler values (104, 'OFIS2', 'TRABZON')"};

        for (String each:veri3){
            st.addBatch(each);
        }
        st.executeBatch();

        System.out.println("Veriler database eklendi");

    }
}
