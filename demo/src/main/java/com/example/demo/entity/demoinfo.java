package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="INFO")
public class demoinfo {
	@Id
	@Column(name="NAME")
    String name;
	@Column(name="ADDRESS1")
    String address1;
	@Column(name="ADDRESS2")
	String address2;
	@Column(name="CITY")
	String city;
	
	public demoinfo()
	{
		
	}
	public demoinfo(String name,String address1,String address2,String city)
	{
		this.name=name;
		this.address1=address1;
		this.address2=address2;
		this.city=city;
	}
	public String getname()
	{
		return name;
	}
	public String getaddress1()
	{
		return address1;
	}
	public String getaddress2()
	{
		return address2;
	}
	public String getcity()
	{
		return city;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setaddress1(String address1)
	{
		this.address1=address1;
	}
	public void setaddress2(String address2)
	{
		this.address2=address2;
	}
	public void setcity(String city)
	{
		this.city=city;
	}
}
