package DBconntection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Maxdatafiles {

/*
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Myname();
        ex();
    }

 */

    public static Connection Myname() throws ClassNotFoundException, SQLException {

        String url = Readpropertiesfiles.readproperties().getProperty("url");
        String username = Readpropertiesfiles.readproperties().getProperty("username");
        String password = Readpropertiesfiles.readproperties().getProperty("password");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public ResultSet ex(String table) throws SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        String value = null;

        Statement statement = Myname().createStatement();
        ResultSet resultSet = statement.executeQuery("select * from  " + table);
//
//       while (resultSet.next()) {
//
//            value = resultSet.getString(name);
//            list.add(value);
//
//            for (int i = 0; i < value.length(); i++) {
//                System.out.println(value + i);
//
//
//
//            }
//
//
//
//        }

        return resultSet;

    }



    public List<String> midul(ResultSet resultSet , String field1, String field2, String field3) throws SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();

        while (resultSet.next()) {
            String city1 = resultSet.getString(field1);
            String city2 = resultSet.getString(field2);
            String city3 = resultSet.getString(field3);
            list.add(city1);
            list.add(city2);
            list.add(city3);

        }
        return list;
    }



}
