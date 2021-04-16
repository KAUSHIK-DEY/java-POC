package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class purchase {
	@Id
	@Column(name="NAME")
    String name;
	@Column(name="PURCHASE")
    String purchase;
	@Column(name="DATEOFPURCHASE")
	String dop;

	public purchase()
	{
		
	}
	public purchase(String name,String purchase,String dop)
	{
		this.name=name;
		this.purchase=purchase;;
		this.dop=dop;
	}
	public String getname()
	{
		return name;
	}
	public String getpurchase()
	{
		return purchase;
	}
	public String getdop()
	{
		return dop;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setpurchase(String purchase)
	{
		this.purchase=purchase;
	}
	public void setdop(String dop)
	{
		this.dop=dop;
	}

}
