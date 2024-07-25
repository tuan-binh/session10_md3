package com.ra.md3_session10_jstl.entity;

import java.util.Date;

public class Customer
{
	private Long id;
	private String name;
	private Date dob;
	private String address;
	private String image;
	
	public Customer()
	{
	}
	
	public Customer(Long id, String name, Date dob, String address, String image)
	{
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.image = image;
	}
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Date getDob()
	{
		return dob;
	}
	
	public void setDob(Date dob)
	{
		this.dob = dob;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getImage()
	{
		return image;
	}
	
	public void setImage(String image)
	{
		this.image = image;
	}
}
