package com.ra.md3_session10_jstl.service;

import com.ra.md3_session10_jstl.entity.Customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerService
{
	
	List<Customer> list = new ArrayList<>();
	
	public CustomerService()
	{
		list.add(new Customer(1L, "Đức trần", new Date(), "Hà nội", "https://i.pinimg.com/474x/bc/cd/2e/bccd2e3ad2bbd881f7a9318e073190fa.jpg"));
		list.add(new Customer(2L, "Hải Nguyễn", new Date(), "Hà nội", "https://i.pinimg.com/474x/c1/6e/ef/c16eefcb6bbba42fe4b470fac7db74d0.jpg"));
		list.add(new Customer(3L, "Anh Tôn", new Date(), "Hà nội", "https://i.pinimg.com/474x/17/97/f7/1797f743dc660f53495dcca21774007d.jpg"));
		list.add(new Customer(4L, "Tịp trần", new Date(), "Hà nội", "https://i.pinimg.com/474x/c7/e2/58/c7e2588f9aecbec621d820693e22c7c1.jpg"));
	}
	
	public List<Customer> findAll()
	{
		return list;
	}
	
}
