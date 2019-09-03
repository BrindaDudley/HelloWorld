package com.techtalent.leasing;

import java.nio.ReadOnlyBufferException;
import java.util.Scanner;

import com.techtalent.leasing.domain.Apartment;
import com.techtalent.leasing.domain.Community;
import com.techtalent.leasing.domain.Resident;

public class LeasingMainApplication {

	public static void main(String[] args) {
		Community comunity1=new Community("Case",50,"5th street",322);
		comunity1.arePetsAllowed(true);
		comunity1.havePalyGround(false);
		Community comunity2=new Community("aloew",50,"9th plaus",876);
		comunity2.arePetsAllowed(false);
		comunity2.havePalyGround(true);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Is there avilablity? true/false");
		comunity1.checkCommunityAvilablity();
		boolean avilablity=scanner.nextBoolean();
		if(avilablity) {
		System.out.println("Are pet alowed?");
		boolean petAllowed=comunity1.arePetsAllowed();
		if(petAllowed) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		comunity2.checkCommunityAvilablity();
		boolean avilablity2=scanner.nextBoolean();
		if(avilablity2) {
		System.out.println("Are pet alowed?");
		boolean petAllowed2=comunity1.arePetsAllowed();
		if(petAllowed2) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		System.out.println("is there a play ground");
		boolean playGround=comunity1.havePalyGround();
		if(playGround) {
			System.out.println("yes there is play ground");
		}
		else {
			System.out.println("No we dont have play gorund");
		}
		System.out.println("what are the apartment aminities");
		comunity1.listAmmenities();
		System.out.println("Give me the list of apartment avilable with rent");
		List<Apartment>avilableApartment=comunity1.showAvilableApartment();
		for(Apartment apartment:avilableApartment)
		{
			System.out.println("Are  you interseted?y/n");
			String intrestStatus=scanner.nextLine();
			if(intrestStatus.equals("y"))
			{
				//brake the for loop and display the apartment number of selected apartment.
			}
			else {
				//Move to next one;
			}
		}
		
		}
		else {
			System.out.println("Sorry!! we dont have any avilablity.");
		}
		
				scanner.close();
	 Resident resident1=new Resident();
     Apartment apt1=new Apartment();
	
	}

}
