package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;

public class PutItemComplateDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();



	private String sql = "INSERT INTO item_info_transaction (item_name, item_price, item_stock) VALUES(?, ?, ?)";

	public void putItem(String putItemName, String putItemPrice, String putItemStock) throws SQLException {

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, putItemName);
			preparedStatement.setString(2, putItemPrice);
			preparedStatement.setString(3, putItemStock);

			preparedStatement.execute();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

}
