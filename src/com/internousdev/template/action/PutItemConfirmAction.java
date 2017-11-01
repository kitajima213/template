package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class PutItemConfirmAction extends ActionSupport implements SessionAware{

	public String putItemName;
	public String putItemPrice;
	public String putItemStock;

	public Map<String,Object> session;
	public String result;
	public String errorMassage;

	public String execute(){
		result = SUCCESS;

		if(!(putItemName.equals("")) && !(putItemPrice.equals("")) && !(putItemStock.equals(""))){
			session.put("putItemName", putItemName);
			session.put("putItemPrice", putItemPrice);
			session.put("putItemStock", putItemStock);
		}else{
			errorMassage = "未入力の項目があります。";
			result = ERROR;
		}
		return result;

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
