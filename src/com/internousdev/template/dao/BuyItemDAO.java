package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.util.DBConnector;

public class BuyItemDAO {


	/**
	 * 商品情報取得メソッド
	 *
	 * @return BuyItemDTO
	 */


	public List<BuyItemDTO> getBuyItemInfo() throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		List<BuyItemDTO> itemList = new ArrayList<BuyItemDTO>();


		String sql = "SELECT id, item_name, item_price FROM item_info_transaction";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);


			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				BuyItemDTO dto = new BuyItemDTO();

				dto.setId(resultSet.getInt("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_price"));

				itemList.add(dto);
			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return itemList;
	}
}