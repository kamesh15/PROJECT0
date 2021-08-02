package com.hotelmanagement.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.hotelmanagement.Controller.HMS_Controller;
import com.hotelmanagement.Exception.InvaildChoiceException;
import com.hotelmanagement.Model.CustomerInfo;
import com.hotelmanagement.Model.Foodorder;
import com.hotelmanagement.Model.RoomBooking;
import com.hotelmanagement.Service.HMS_ServiceImpl;

public class Test_Client {
	
	static Logger logger=Logger.getLogger("Test_Client.class");

	public static void main(String[] args) throws Exception {

		System.out.println("EXPLORE THE WORLD .........wait for 5 seconds" );
		Thread.sleep(2000);
		System.out.println("______________Countdown Starts________________");
		Thread.sleep(1000);
		for(int i=5;i>0;i--)	
		{
			System.out.println("                    "+i);
	            Thread.sleep(1000);
	     }
		
		System.out.println("$$$$$-------- WELCOME TO HOTEL TAJ (MSDK)-------$$$$$$ \n");
		logger.info(" Entered in client Page.........\n");
		
	// Creating Objects for different Classes............
		Scanner sc=new Scanner(System.in);
		CustomerInfo info=new CustomerInfo();
		Foodorder forder=new Foodorder();
		RoomBooking roombook=new RoomBooking();
		
	//Creating Object for Controller Class................
		HMS_Controller acontroller= new HMS_Controller();
		
	// Getting Customer Details from Customer..........
		System.out.println("********* DEAR CUSTOMER ENTER YOUR DETAILS **********\n");
		
		System.out.println("  Enter Your Name: ");
		String name=sc.nextLine();
		
		System.out.println("  Enter Your ID Proof Number: ");
		String Idproof=sc.nextLine();
		
		System.out.println("  Enter Your Address : ");
		String address=sc.nextLine();
		
		System.out.println("  Enter Your Phone NUmber : ");
		String phoneno=sc.nextLine();
		
		info.setIdproof(Idproof);
		info.setName(name);
		info.setAddress(address);
		info.setPhoneno(phoneno);
		
	// Passing the customer details via controller 
		acontroller.addcustomerdetails(info);
		
	// Overview the Customer details which is taken from database........
		System.out.println("  Thanks for giving your details\n");
		System.out.println("  Kindly again enter your name to overview your details ");
		String name1=sc.nextLine();
		System.out.println("******************* OVERVIEW OF YOUR DETAILS *****************\n");
		System.out.println(acontroller.overviewdetails(name1));
		System.out.println("***************************************************************\n");
		
		char ch1;
		do {
		System.out.println("   Choose the service provided by us \n\n   1. Food Ordering \n   2. Room Booking \n   3. Cancel Room Booking ");
		System.out.println("   Enter Your Choice: ");
		int ch=sc.nextInt();sc.nextLine();
	
	// Switch case for different services................
		switch(ch)
		{
		case 1:
			  System.out.println("############ ORDER YOUR FOOD ############\n");
			  System.out.println("  LISTING OUR FOOD MENU \n");
			  
		  // Getting Food menu from the database................
			  List<Foodorder> foodlist=acontroller.getfoodmenu();
			  for(Foodorder x: foodlist)
				  System.out.println(x);
			
	      // Getting food items from the customer................
			  System.out.println("  \nEnter number of food items");
			  int nof=sc.nextInt();sc.nextLine();
			  String quantity;
			
			  ArrayList<String> itemlist= new ArrayList<String>();
			  for(int i=0;i<nof;i++)
			  {
				  System.out.println("  Name of the Item: ");
				  String items=sc.nextLine();
				  itemlist.add(items);
				  forder.setItems(items);
				  System.out.println(items);
				  
				  for(int j=0;j<1;j++) 
				  {
					  System.out.println("  Enter the Quantity: ");
					  quantity=sc.nextLine();
					  forder.setQuantity(quantity); 
				  } 
			  }
			  
			  System.out.println(itemlist);
		
			  acontroller.OrderConfirmation(itemlist);
			  System.out.println("YOUR STATUS: "+acontroller.OrderConfirmation(itemlist));
			  
			  
			break;
			  
		 case 2:
			   System.out.println("############### BOOK YOUR ROOMS ##############");
			   
		  // Get room booking details from customer........... 
			   System.out.println("  Enter the booking number");
			   int bookingid=sc.nextInt();sc.nextLine();
			   roombook.setBookingid(bookingid);
			   
			   System.out.println("  Enter the type of room");
			   String roomType=sc.nextLine();
			   roombook.setRoomType(roomType);
			   
			   System.out.println("  Enter the no of days");
			   int noofdays=sc.nextInt();sc.nextLine();
			   roombook.setNoofdays(noofdays);
			   acontroller.Roompayment(noofdays,roomType);
			  
			   System.out.println("  Enter check in date");
			   long checkIn=sc.nextLong();
			   roombook.setCheckIn(checkIn);
			   
			   System.out.println("  Enter chech out date");
			   long checkOut=sc.nextLong();
			   roombook.setCheckOut(checkOut);
			   
			   acontroller.BookingConfirmation(roomType);
			   System.out.println("\n  YOUR STATUS: "+acontroller.BookingConfirmation(roomType));
			   System.out.println("*******************************************************\n");  
			   acontroller.addbookingdetails(roombook);
			   System.out.println("  Kindly again enter your Booking Number to overview your booking details ");
			   int bookno=sc.nextInt();sc.nextLine();
			   System.out.println("******************* OVERVIEW OF YOUR BOOKING DETAILS *****************\n");
			   System.out.println(acontroller.overviewbookdetails(bookno));
			   System.out.println("**********************************************************************\n");
			   System.out.println("  ROOM TYPE: "+" "+roomType+"\n"+"  NO OF DAYS: "+" "+noofdays);
			   System.out.println("  (**** FOR AC Rs: 1200 & FOR NON-AC Rs: 800 ****)");
			   System.out.println("_______________________________________________________________________\n");
			   System.out.println("  TOTAL FARE: "+acontroller.Roompayment(noofdays, roomType));
			  
			   break;
			   
		 case 3:
			 
		  // Cancellation of booking deleting the row from database.......... 
			   System.out.println("  PLEASE ENTER YOUR BOOKING ID TO CONFIRM YOUR CANCELLATION FOR YOUR BOOKING \n");
			   int bookno1=sc.nextInt();sc.nextLine();
			   acontroller.cancellationbooking(bookno1);
			   
			   break;
		 
		 default:
			    throw new InvaildChoiceException("  You entered a Invalid Option");
		
		}
		System.out.println("\n  IF YOU WANT TO CONTINUE OUR SERVICE PLESE PRESS Y OR TO EXIT PRESS ANY KEY");
		 ch1=sc.next().charAt(0);
		}while(ch1=='y'|| ch1=='Y');
		
		System.out.println("************************THANK YOU FOR USING OUR SERVICES***************************");

	}

}
