package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class dbConnection {

    private static final String USERNAME = "franztasha";
    private static final String PASSWORD = "Cobbers01";
    private static final String CONN = "jdbc:mysql://localhost/student?useSSL=false";

    public static Connection getConnection() throws SQLException {
        try{
            return DriverManager.getConnection(CONN,USERNAME,PASSWORD);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        return null;
    }
}

