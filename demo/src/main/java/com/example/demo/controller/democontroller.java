package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Entitypoc;
import com.example.demo.entity.demoinfo;
import com.example.demo.entity.prod;
import com.example.demo.entity.purchase;
import com.example.demo.service.demoservice;

@RestController
public class democontroller {

	@Autowired
	private demoservice service;
	@RequestMapping("/Entitypoc")
	public List<Entitypoc> getentity()
	{
		return service.getValue();
	}
	@RequestMapping("/demoinfo")
	public List<demoinfo> getinformation()
	{
		return service.getinfo();
	}
	@RequestMapping("/products")
	public List<prod> getproducts()
	{
		return service.getprod();
	}
	@RequestMapping("/purchase")
	public List<purchase> getpurchase()
	{
		return service.getpurc();
	}
	@RequestMapping(method=RequestMethod.POST,value="/Entitypoc")
	public void addentity(Entitypoc element)
	{
		service.addentity(element);
	}
}
