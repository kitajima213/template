package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.PutItemComplateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class PutItemComplateAction extends ActionSupport implements SessionAware{


	public String putItemName;
	public String putItemPrice;
	public String putItemStock;


	public Map<String,Object> session;
	public String result;
	public PutItemComplateDAO putItemComplateDAO = new PutItemComplateDAO();

	public String execute() throws SQLException {

		putItemComplateDAO.putItem(session.get("putItemName").toString(),
				session.get("putItemPrice").toString(),
				session.get("putItemStock").toString());
		result = SUCCESS;

		return result ;
	}

	/**
	 * @return putItemName
	 */
	public String getPutItemName() {
		return putItemName;
	}

	/**
	 * @param putItemName セットする putItemName
	 */
	public void setPutItemName(String putItemName) {
		this.putItemName = putItemName;
	}

	/**
	 * @return putItemPrice
	 */
	public String getPutItemPrice() {
		return putItemPrice;
	}

	/**
	 * @param putItemPrice セットする putItemPrice
	 */
	public void setPutItemPrice(String putItemPrice) {
		this.putItemPrice = putItemPrice;
	}

	/**
	 * @return putItemStock
	 */
	public String getPutItemStock() {
		return putItemStock;
	}

	/**
	 * @param putItemStock セットする putItemStock
	 */
	public void setPutItemStock(String putItemStock) {
		this.putItemStock = putItemStock;
	}

	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
