package UTILS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connectionUTILS {
	static String hostName = "localhost";
	static String dbName = "LoginDB";
	static String Username = "root";
	static String Password = "";
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" +dbName;
		Connection conn = DriverManager.getConnection(connectionURL, Username, Password);
		return conn;
	}
}
