package vn.iostar.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import vn.iostar.Model.User;


public class DBConnection {

	private final String serverName = "FINNTRAN";
	private final String dbName = "KNCSDL";
	private final String portNumber = "1433";
	private final String instance = "";
	private final String userID = "sa";
	private final String password = "123456";

	public Connection getConnection() throws Exception {
		String url = "jdbc:sqlserver://" + serverName + "\\" + instance + ":" + portNumber + ";databaseName=" + dbName
				+ ";encrypt=true;trustServerCertificate=true";

		if (instance == null || instance.trim().isEmpty())
			url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName
					+ ";encrypt=true;trustServerCertificate=true";

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID, password);
	}

	public static void main(String[] args) {
	        try {
	            Connection conn = new DBConnection().getConnection();
	            if (conn != null) {
	                System.out.println("✅ Kết nối SQL Server thành công bằng SQL Authentication!");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
