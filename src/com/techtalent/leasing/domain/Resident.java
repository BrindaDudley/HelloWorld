package com.techtalent.leasing.domain;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Resident {
	private String name;
	private int age;
	private int numpet;
	private int numMember;
	private String contactNumber;
	private String email;
	private String ssn;
	

	public Resident() {
		System.out.println("the constroctor for new resident");
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		
		this.name=name;
	}	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumpet() {
		return numpet;
	}

	public void setNumpet(int numpet) {
		this.numpet = numpet;
	}

	public int getNumMember() {
		return numMember;
	}

	public void setNumMember(int numMember) {
		this.numMember = numMember;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resident other = (Resident) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
