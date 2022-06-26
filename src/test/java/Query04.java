import java.sql.*;

public class Query04 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "kadirtepecik58.");
        //Statement st = con.createStatement();


        PreparedStatement ps=con.prepareStatement("select * from ogrenciler");

        ResultSet rs=ps.executeQuery();

        ResultSetMetaData rsmd=rs.getMetaData();
       // getColumnName o sütünün ismni getirir
        System.out.println("1.sutunu ismi :"+rsmd.getColumnName(1));
        System.out.println("2.sutunu ismi :"+rsmd.getColumnName(2));
        System.out.println("3.sutunu ismi :"+rsmd.getColumnName(3));
        System.out.println("3.sutunu ismi :"+rsmd.getColumnName(4));

        System.out.println("====================================================================");
       // sutun saysıını getirrir
        System.out.println("Toplam sutun sayisi :"+rsmd.getColumnCount());
        System.out.println("====================================================================");
      // sütunların data tipini döndürrür
        System.out.println("1.sutun data tipi :"+rsmd.getColumnTypeName(1));
        System.out.println("2.sutun data tipi :"+rsmd.getColumnTypeName(2));
        System.out.println("3.sutun data tipi :"+rsmd.getColumnTypeName(3));
        System.out.println("4.sutun data tipi :"+rsmd.getColumnTypeName(4));
        System.out.println("====================================================================");


        //tablonun ismi
        System.out.println("Tablonun ismi ogrenciler :"+rsmd.getTableName(1));
        System.out.println("tablonun satır sayısı :"+rsmd.getCatalogName(1));
      int countRow=0;
     while (rs.next()){

         System.out.printf("%-6d %-15.15s %-8s %-8s\n", rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4));
      countRow++;
     }

        System.out.println(countRow);

        con.close();
       ps.close();
        rs.close();
    }
}
