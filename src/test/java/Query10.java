public class Query10 {
    public static void main(String[] args) {
        DatabaseUtilty.createConnection();
        String query = "select * from ogrenciler";
        System.out.println("Sutun isimleri: " + DatabaseUtilty.getColumnNames(query));

        System.out.println("Okul No " + DatabaseUtilty.getColumnData(query, "okul_no"));
        System.out.println("Ogrenci ismi " + DatabaseUtilty.getColumnData(query, "ogrenci_ismi"));
        System.out.println("sinif " + DatabaseUtilty.getColumnData(query, "sinif"));
        System.out.println("Cinsiyet " + DatabaseUtilty.getColumnData(query, "cinsiyet"));


    }


}
