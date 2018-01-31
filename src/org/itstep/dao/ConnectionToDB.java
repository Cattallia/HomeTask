package org.itstep.dao;

import java.sql.*;

public class ConnectionToDB {

	private static final String URL = "jdbc:postgresql://localhost:5433/amazon_bot";
	private static final String USER_NAME = "bot";
	private static final String USER_PASWORD = "8871588";

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USER_NAME, USER_PASWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;

	}

}
