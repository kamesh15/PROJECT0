package com.hotelmanagement.Service;
import java.util.ArrayList;
import java.util.List;
import com.hotelmanagement.Exception.FoodNotFoundException;
import com.hotelmanagement.Exception.RoomNotFoundException;
import com.hotelmanagement.Model.*;

public interface HMS_Service {

	// Abstract methods in HMS_Service Interface which will be implemented in HMS_ServiceImpl Class........ 
	
	public void addcustomerdetails(CustomerInfo info);
	
	public String OrderConfirmation(ArrayList<String> itemlist) throws FoodNotFoundException;
	
	public String BookingConfirmation(String roomType) throws RoomNotFoundException;
	
	public List<Foodorder> getfoodmenu();
	
	public double Roompayment(int noofdays,String roomType);
	
	public CustomerInfo overviewdetails(String name);
	
	public void addbookingdetails(RoomBooking book);
	
	public RoomBooking overviewbookdetails(Integer number);
	
	public void cancellationbooking(Integer num);
	
}
