package com.Project0.HotelManagementSystem;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.hotelmanagement.Model.Foodorder;
import com.hotelmanagement.Service.HMS_ServiceImpl;

public class ServiceImplTest {

	@Test
	public void testGetfoodmenu() 
	{
		List<Foodorder> list=new ArrayList<Foodorder>();
		HMS_ServiceImpl serviceimpl=new HMS_ServiceImpl();
		list=serviceimpl.getfoodmenu();
		assertNotNull(list);
	}

	@Test
	public void testOrderConfirmation() throws Exception 
	{
		ArrayList<String> itemlist=new ArrayList<String>();
		HMS_ServiceImpl serviceimpl=new HMS_ServiceImpl();
		assertNotNull(itemlist);
		
	}

}
