package com.hotelmanagement.Model;

public class Foodorder {
	
	private Integer orderId;
	private String items;
	private Double price;
	private String quantity;
	private Integer total;
 
	public Integer getOrderId() {
		return orderId;
	}


	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}


	public String getItems() {
		return items;
	}


	public void setItems(String items) {
		this.items = items;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public Integer getTotal() {
		return total;
	}


	public void setTotal(Integer total) {
		this.total = total;
	}


	@Override
	public String toString() {
		return " items= " + items + ", price= " + price + " ";
	}

}
