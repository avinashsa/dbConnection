package dbConnection;

import java.sql.*;

public class DBHandle {

	private Connection conn;

	public void connect( String ConnectionString, String username, String passwd ) {
		System.out.println("connecting");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException ex) {
			System.out.println("class not found dude");
		}
		
	
		String serverName = "avinash";
		String portNumber = "1521";
		String sid = "AVIDB";
		String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
		username = "hfs_preprod";
		String password = "hfs_preprod";

		try {
			conn = DriverManager.getConnection(url, username, password);
		}
		catch (SQLException ex ){
			System.out.println("SQL exception dude");
		}

	}

	public void disConnect() {
		System.out.println("disconnecting");
	}

	public void runSql( String sqlText ) {

		System.out.println("running sql : "+sqlText);

		Statement stmt ;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select account_name  from account_billing");
			while (rs.next()) {
				String x = rs.getString("account_name");
				System.out.println(x);
			}

		} 
		catch (SQLException ex ) {
			System.out.println("SQL exception connection dude");
		}


	}
}
