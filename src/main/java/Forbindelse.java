import java.sql.*;

public class Forbindelse {

    private Connection connection;

    public Forbindelse() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();  //indlæser driver-klasse
            String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
            String userName = "root";
            String password = "1Djshaki";
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
    public void searchUser(){

    }
}
