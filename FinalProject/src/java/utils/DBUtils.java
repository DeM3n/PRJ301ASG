/*
    
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author no-solace
 */
public class DBUtils {

    private static final String DB_Name = "sisyphus";
    private static final String DB_Username = "sa";
    private static final String DB_Password = "12345";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection con = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=" + DB_Name;
        con = DriverManager.getConnection(url, DB_Username, DB_Password);
        return con;
    }
}
