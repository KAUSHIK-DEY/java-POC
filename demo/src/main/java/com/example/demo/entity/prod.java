package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class prod {
	@Id
	@Column(name="CATEGORY")
    String category;
	@Column(name="ITEMS")
    String items;
	@Column(name="AVAILABLE")
	String available;
	@Column(name="PRICE")
	String price;
	
	public prod()
	{
		
	}
	public prod(String category,String items,String available,String price)
	{
		this.category=category;
		this.items=items;
		this.available=available;
		this.price=price;
	}
	public String getcategory()
	{
		return category;
	}
	public String getitems()
	{
		return items;
	}
	public String getavailable()
	{
		return available;
	}
	public String getprice()
	{
		return price;
	}
	public void setcategory(String category)
	{
		this.category=category;
	}
	public void setaddress1(String items)
	{
		this.items=items;
	}
	public void setaddress2(String available)
	{
		this.available=available;
	}
	public void setcity(String price)
	{
		this.price=price;
	}
}
