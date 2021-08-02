package com.hotelmanagement.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.hotelmanagement.DAO.HMS_DAO;
import com.hotelmanagement.DAO.HMS_DAOimpl;
import com.hotelmanagement.Exception.FoodNotFoundException;
import com.hotelmanagement.Exception.RoomNotFoundException;
import com.hotelmanagement.Model.CustomerInfo;
import com.hotelmanagement.Model.Foodorder;
import com.hotelmanagement.Model.RoomBooking;

public class HMS_ServiceImpl implements HMS_Service{
	
	static Logger logger=Logger.getLogger("HMS_ServiceImpl.class");
	
	HMS_DAO hmsdao=new HMS_DAOimpl();
	
	public void addcustomerdetails(CustomerInfo info)
	{
		logger.info("Adding customer details........\n");
		hmsdao.addcustomerdetails(info);
	}
	
	public List<Foodorder> getfoodmenu()
	{
		logger.info("Got Food Menu from Database........\n");
		return hmsdao.getfoodmenu();
	}
	
	public CustomerInfo overviewdetails(String name) 
	{
		logger.info("overviewing customer details........\n");
		return hmsdao.overviewdetails(name);
	}
	
	public void addbookingdetails(RoomBooking book) 
	{
		logger.info("Adding customer booking details........\n");
		hmsdao.addbookingdetails(book);
	}
	
	public RoomBooking overviewbookdetails(Integer number) 
	{
		logger.info("overviewing booking details........\n");
		return hmsdao.overviewbookdetails(number);
	}
	
	public void cancellationbooking(Integer num)
	{
		logger.info(" Booking Cancellation ........\n");
		hmsdao.cancellationbooking(num);
	}
//_______________________________________________________________________________________________________

	
	// Order confirmation logic.............
	
	public String OrderConfirmation(ArrayList<String> itemlist) throws FoodNotFoundException
	{
	
		String ms;
		if(itemlist.isEmpty())
			throw new FoodNotFoundException(" NO ORDER IS PLACED"); 
			
		else
			ms="ORDER IS CONFIRMED";
		return ms;
	}
	
//________________________________________________________________________________________________________	
	
	
	// Booking Confirmation Logic............
	
	public String BookingConfirmation(String roomType) throws RoomNotFoundException
	{
		String ms1;
		if(roomType.isEmpty())
			throw new RoomNotFoundException("NO BOOKING IS DONE");
		else
			ms1="BOOKING IS CONFIRMED";
		return ms1;
	}
	
//__________________________________________________________________________________________________________
	
	
	// Room Payment Calculation Logic.........
	
	public double Roompayment(int noofdays,String roomType)
	{
		double total=0;
		
		if(roomType.equals("AC"))
			total=noofdays*1200;
		else
			total=noofdays*800;
		return total;
	
	}
}
