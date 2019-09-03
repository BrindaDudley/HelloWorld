package com.techtalent.leasing.domain;

public class Apartment {
	private int aptno;
	private float size;
	private int numbed;
	private boolean availability;
	private float baseRent;
	private Community comunity;
	
	public int getAptno() {
		return aptno;
	}

	public void setAptno(int aptno) {
		this.aptno = aptno;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public int getNumbed() {
		return numbed;
	}

	public void setNumbed(int numbed) {
		this.numbed = numbed;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public float getBaseRent() {
		return baseRent;
	}

	public void setBaseRent(float baseRent) {
		this.baseRent = baseRent;
	}



	public float calculateRent(Resident resident) {
		
		float petRent=resident.getNumpet()*comunity.getRentForAPet();
        float totalBaseRent=this.baseRent*this.size;
        return(petRent+totalBaseRent);
	}
}
