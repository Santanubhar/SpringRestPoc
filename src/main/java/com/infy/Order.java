package com.infy;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Order")
public class Order {
	
	long order_id;
	String status;
	String date_placed;
	float price;
	
	/*public Order(long order_id,String status,String date_placed,float price)
	{
		this.order_id = order_id;
		this.status = status;
		this.date_placed = date_placed;
		this.price = price;
	}*/
	
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDate_placed() {
		return date_placed;
	}
	public void setDate_placed(String date_placed) {
		this.date_placed = date_placed;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
