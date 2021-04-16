package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Entitypoc;
import com.example.demo.entity.demoinfo;
import com.example.demo.entity.prod;
import com.example.demo.entity.purchase;
import com.example.demo.repository.demoprod;
import com.example.demo.repository.demopurc;
import com.example.demo.repository.demorepo;
import com.example.demo.repository.inforepo;

@Service
public class demoservice {

	@Autowired
	private demorepo repo;
    @Autowired
    private inforepo rep;
    @Autowired
    private demoprod rep1;
    @Autowired 
    private demopurc rep2;
	
	public List<Entitypoc> getValue()
	{
		List<Entitypoc> list=new ArrayList<>();
		for (Entitypoc items:repo.findAll())
		{
			list.add(items);
		}
		return list;

	}
	public List<demoinfo> getinfo()
	{
		List<demoinfo> list=new ArrayList<>();
		for (demoinfo items:rep.findAll())
		{
			list.add(items);
		}
		return list;

	}
	public List<prod> getprod()
	{
		List<prod> list=new ArrayList<>();
		for (prod items:rep1.findAll())
		{
			list.add(items);
		}
		return list;

	}
	public List<purchase> getpurc()
	{
		List<purchase> list=new ArrayList<>();
		for (purchase items:rep2.findAll())
		{
			list.add(items);
		}
		return list;

	}
	public void addentity(Entitypoc element) {
		
		repo.save(element);
	}
	
}
