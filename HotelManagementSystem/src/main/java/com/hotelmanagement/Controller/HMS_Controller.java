package com.hotelmanagement.Controller;

import java.util.ArrayList;
import java.util.List;

import com.hotelmanagement.Exception.FoodNotFoundException;
import com.hotelmanagement.Exception.RoomNotFoundException;
import com.hotelmanagement.Model.CustomerInfo;
import com.hotelmanagement.Model.Foodorder;
import com.hotelmanagement.Model.RoomBooking;
import com.hotelmanagement.Service.HMS_Service;
import com.hotelmanagement.Service.HMS_ServiceImpl;

public class HMS_Controller {
	
	// Creating a reference variable for interface HMS_service and a object for implementation class..........
	// Dynamic Binding
	HMS_Service service=new HMS_ServiceImpl();
	
	// Method definition for abstract method in interface HMS_service................
	public void addcustomerdetails(CustomerInfo info)
	{
		service.addcustomerdetails(info);
	}
	
	
	public CustomerInfo overviewdetails(String name)
	{
		return service.overviewdetails(name);
	}
	
	
	public List<Foodorder> getfoodmenu()
	{
		return service.getfoodmenu();
	}
	

	public String OrderConfirmation(ArrayList<String> itemlist) throws FoodNotFoundException
	{
		return service.OrderConfirmation(itemlist);
	}
	
	
	public String BookingConfirmation(String roomType) throws RoomNotFoundException
	{ 
		return service.BookingConfirmation(roomType);
	}
	
	
	public RoomBooking overviewbookdetails(Integer number) 
	{
		return service.overviewbookdetails(number);
	}
	
	
	public void addbookingdetails(RoomBooking book) 
	{
		service.addbookingdetails(book);
	}
	
	
	public double Roompayment(int noofdays,String roomType)
	{
		return service.Roompayment(noofdays, roomType);
	}
	
	
	public void cancellationbooking(Integer num)
	{
		service.cancellationbooking(num);
	}
}
