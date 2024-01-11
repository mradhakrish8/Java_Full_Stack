package com.practise.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/jdbcData", "root", "root");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM account");) {
			//giving in side TRY block will automatically close the connection
			System.out.println(conn);

			/* Create Record in a Table --- START */
			// int result = stmt.executeUpdate("INSERT INTO account
			// VALUES(1,'Jerry','Tom',1000)");
			// System.out.println(result+ " Rows Inserted");
			/* Create Record in a Table --- END */

			/* Update Record in a Table --- START */
			// int result = stmt.executeUpdate("UPDATE account SET bal=3000 WHERE accno=1");
			// System.out.println(result+ " Row Updated");
			/* Update Record in a Table --- END */

			/* Delete Record in a Table --- START */
			// int result = stmt.executeUpdate("DELETE FROM account WHERE accno=1");
			// System.out.println(result+ " Row Deleted");
			/* Delete Record in a Table --- END */

			/* Delete Record in a Table --- START */

			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
			}
			/* Delete Record in a Table --- END */

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
