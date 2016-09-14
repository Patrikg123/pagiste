import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Elev1 on 8/15/2016.
 */

public class ConnectionManager {

    private Connection connection;

    public ConnectionManager(String dbURL, String user, String pwd)
            throws ClassNotFoundException, SQLException {
                this.connection = DriverManager.getConnection(dbURL, user, pwd);
            }

    public Connection getConnection() {
        return this.connection;
    }
}