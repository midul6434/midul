package DBconntection;

import java.sql.*;
import java.util.Properties;

public class Database {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectDB();
    }


    public static Connection  ConnectDB() throws ClassNotFoundException, SQLException {
        Properties properties = Readpropertiesfiles.readproperties();
       String  username =properties.getProperty("username");
      String   password = properties.getProperty("");
        String url=properties.getProperty("url");
     Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection;
    connection = DriverManager.getConnection(url, username, password);
    Statement statement = connection.createStatement();
   ResultSet resultSet = statement.executeQuery("select * from customers");
   resultSet.next();
   String name = resultSet.getString("country");
    System.out.println(name);
return connection;
}




}
