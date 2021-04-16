package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Entitypoc {
	@Id
	@Column(name="NAME")
  String name;
	@Column(name="PASSWORD")
  String password;
	
	public Entitypoc()
	{
		
	}
	public Entitypoc(String name,String password)
	{
		this.name=name;
		this.password=password;
	}
	public String getname()
	{
		return name;
	}
	public String getpassword()
	{
		return password;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
  
}
