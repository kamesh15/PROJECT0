package com.Project0.HotelManagementSystem;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.hotelmanagement.DAO.HMS_DAOimpl;
import com.hotelmanagement.Model.Foodorder;
import com.hotelmanagement.Util.DBUtil;

public class HotelProjectTest {

	@Test
	public void testAddcustomerdetails() {
		  boolean flag=false;
		  try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DBUtil.getConnection();
				Statement pst=con.createStatement();
				ResultSet rs=pst.executeQuery("select * from CustomerDetails");
				
				if(rs.next())
					flag=true;
		
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			assertTrue(flag);
		}

	

	@Test
	public void testGetfoodmenu() {
		List<Foodorder> listinfo=new ArrayList<Foodorder>();
		HMS_DAOimpl DAOtest=new HMS_DAOimpl();
		listinfo=DAOtest.getfoodmenu();
		assertNotNull(listinfo);
	}
	
	

	/*@Test
	public void testAddbookingdetails() {
		
			  boolean flag=false;
			  try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DBUtil.getConnection();
					Statement pst=con.createStatement();
					ResultSet rs=pst.executeQuery("select * from BookingDetials");
					
					if(rs.next())
						flag=true;
			
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				assertTrue(flag);
		
			}*/
	

	
}
