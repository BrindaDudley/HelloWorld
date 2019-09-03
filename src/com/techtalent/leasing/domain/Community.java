package com.techtalent.leasing.domain;

import java.util.List;
import java.util.ArrayList;

public class Community {
    private String comunity;
	private float rentForAPet;
	private String address;
	private boolean petsAllowed;
	private boolean playGround;
	private List<Apartment>apart;
	
	public Community(String name,float rentForAPet,String address,int numofApt)
	{
		this.comunity=name;
		this.rentForAPet=rentForAPet;
		this.address=address;
		apart=new ArrayList<>();
		for(int i=0;i<numofApt;i++)
		{
			Apartment apartment=new Apartment();
			apart.add(apartment);
			apartment.setAptno(i+1);
			apartment.setAvailability(true);
			apartment.setBaseRent(10);
			apartment.setNumbed(2);
			apartment.setSize(1000);
			
		}
	}
	
	
	public String getName() {
		return comunity;
	}
	public void setName(String name) {
		this.comunity = name;
	}
	public float getRentForAPet() {
		return rentForAPet;
	}
	public void setRentForAPet(float rentForAPet) {
		this.rentForAPet = rentForAPet;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	public boolean isPetsAllowed() {
		return petsAllowed;
	}


	public void setPetsAllowed(boolean petsAllowed) {
		this.petsAllowed = petsAllowed;
	}


	public boolean checkCommunityAvilablity() {
		// TODO Auto-generated method stub
	/*	for(int i=0;i<apart.size();i++)
		{
			if(apart.get(i).isAvailability()){
				return true;
			}
		}*/
		for (Apartment aprt : apart) {
			if(aprt.isAvailability())
			{
				return true;
			}
		}
		return false;
	}


	public boolean arePetsAllowed() {
		// TODO Auto-generated method stub
		return petsAllowed;
	}


	public boolean havePalyGround() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
