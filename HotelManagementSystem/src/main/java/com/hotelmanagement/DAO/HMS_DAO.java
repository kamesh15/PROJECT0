package com.hotelmanagement.DAO;

import java.util.List;

import com.hotelmanagement.Model.CustomerInfo;
import com.hotelmanagement.Model.Foodorder;
import com.hotelmanagement.Model.RoomBooking;

public interface HMS_DAO {
	
	// Abstract methods in HMS_DAO interface which will be defined in HMS_DAOimpl Class........
	
	public void addcustomerdetails(CustomerInfo info);
	
	public List<Foodorder> getfoodmenu();
	
	public CustomerInfo overviewdetails(String name);
	
	public void addbookingdetails(RoomBooking book);
	
	public RoomBooking overviewbookdetails(Integer number);
	
	public void cancellationbooking(Integer num);
} 
