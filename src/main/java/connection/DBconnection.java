package connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static java.sql.Connection connection = null;
    public DBconnection () {}

    public static java.sql.Connection getConnection()  {
        if (connection==null){
            String url="jdbc:postgresql://localhost:5432/cw11";
            String username="postgres";
            String password="lplnvqh81";
            try {
                connection= DriverManager.getConnection(url,username,password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
