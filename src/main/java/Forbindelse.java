import java.sql.*;

public class Forbindelse {

    public static void main(String[] arg) throws Exception {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();  //indlæser driver-klasse
            String url = "jdbc:mysql://2001:878:200:4102:207:e9ff:fe62:eed:3306/?user=sika";
            String userName = "sika";
            String password = "itSMRC2019";
            Connection conn = DriverManager.getConnection(url, userName, password);
            //System.out.println("["+cpr+"]");
            if (conn != null) {
                System.out.println("forbindelse til databasen");
            }
        } catch (Exception e) {
            System.out.println("forbindelse undtagelse: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
