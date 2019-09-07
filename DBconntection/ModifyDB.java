package DBconntection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ModifyDB {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       nothing();
    }
   /* joy();
       Maxdatafiles maxdatafiles = new Maxdatafiles();
       String mysona = maxdatafiles.ex("country");
        System.out.println(mysona);
        System.out.println("=============*****==========");


    }

    private static void joy() throws SQLException, ClassNotFoundException {
        Maxdatafiles maxdatafiles = new Maxdatafiles();
        String mymatha = maxdatafiles.ex("contactLastName");
        System.out.println(mymatha);
        System.out.println("-----------++++++++++----------");
    }

    */

        public static void nothing () throws SQLException, ClassNotFoundException {
            Maxdatafiles maxdatafiles = new Maxdatafiles();
            ResultSet resultSet = maxdatafiles.ex("customers");

            List<String>  record= maxdatafiles.midul(resultSet,"city","country","state");
            for(String str : record){
                System.out.println(str);
            }

        }
    }