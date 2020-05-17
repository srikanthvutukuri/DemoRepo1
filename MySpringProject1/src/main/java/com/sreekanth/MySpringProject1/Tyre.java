package com.sreekanth.MySpringProject1;

import org.springframework.stereotype.Component;

@Component
public class Tyre 
{
	private String brand;

	
	
	public Tyre(String bname)
	{
		super();
		this.brand=bname;
		
		
	}
	/*
	 * public Tyre(String brand) { super(); this.brand = brand; }
	 */
	
	public String getBrand() {
		return brand;
	}

	/*
	 * public void setBrand(String brand) { this.brand = brand; }
	 */
	@Override
	public String toString() {
		return " tostring() of tyre is working";
	}
	
	
	
	

}
