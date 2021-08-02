package com.hotelmanagement.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hotelmanagement.Model.CustomerInfo;
import com.hotelmanagement.Model.Foodorder;
import com.hotelmanagement.Model.RoomBooking;
import com.hotelmanagement.Util.DBUtil;

public class HMS_DAOimpl implements HMS_DAO {
	
	
	//Adding Customer Details to the Database..........
	
	public void addcustomerdetails(CustomerInfo info) 
	  {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DBUtil.getConnection();

			PreparedStatement pst=con.prepareStatement("insert into CustomerDetails values(?,?,?,?)");
			pst.setString(1, info.getName());
			pst.setString(2, info.getIdproof());
			pst.setString(3, info.getAddress());
			pst.setString(4, info.getPhoneno());
			
			pst.execute();
			System.out.println("  Details are connected to Database\n");
			
		    }   catch (Exception e) {
			
			e.printStackTrace();
			}
	   }
//________________________________________________________________________________________________________________
	
	
	// Getting the Food Menu from the Database........
	
	public List<Foodorder> getfoodmenu()
	   {
		List<Foodorder> listinfo=new ArrayList<Foodorder>();
		
		try {
			    Class.forName("com.mysql.jdbc.Driver");
				Connection con=DBUtil.getConnection();
				
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from Foodmenu");
				while(rs.next())
				{
					Foodorder f1=new Foodorder();
					f1.setItems(rs.getString(1));
					f1.setPrice(rs.getDouble(2));
					
					listinfo.add(f1);
				 }
		
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		 return listinfo;
	
	   }
//_____________________________________________________________________________________________________________
	
	
	// Reviewing the Details for the current Customer...............
	
	public CustomerInfo overviewdetails(String name) 
		{
			CustomerInfo c=new CustomerInfo();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DBUtil.getConnection();

				PreparedStatement pst=con.prepareStatement("select * from CustomerDetails where name=?");
				pst.setString(1, name);
				ResultSet rs=pst.executeQuery();
				while(rs.next()) {
					c.setName(rs.getString(1));
					c.setIdproof(rs.getString(2));
					c.setAddress(rs.getString(3));
					c.setPhoneno(rs.getString(4));
				}
			
			}   catch (Exception e) {
				
				e.printStackTrace();
				}
			return c;
		}
//_______________________________________________________________________________________________________________
	
	
	// Adding Booking Details to Database..................
	
	public void addbookingdetails(RoomBooking book) 
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DBUtil.getConnection();

				PreparedStatement pst=con.prepareStatement("insert into BookingDetails values(?,?,?,?,?)");
				pst.setInt(1, book.getBookingid());
				pst.setString(2, book.getRoomType());
				pst.setInt(3, book.getNoofdays());
				pst.setLong(4, book.getCheckIn());
				pst.setLong(5, book.getCheckOut());
				
				pst.execute();
				System.out.println("  Booking Details are connected to Database\n");
				
		
			}   catch (Exception e) {
				
				e.printStackTrace();
				}
		}
//________________________________________________________________________________________________________________

	
	// Reviewing the Details for the booking detail...............
	
		public RoomBooking overviewbookdetails(Integer number) 
			{
			   RoomBooking r=new RoomBooking();
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DBUtil.getConnection();

					PreparedStatement pst=con.prepareStatement("select * from BookingDetails where Booking_No=?");
					pst.setInt(1, number);
					ResultSet rs=pst.executeQuery();
					while(rs.next()) {
						r.setBookingid(rs.getInt(1));
						r.setRoomType(rs.getString(2));
						r.setNoofdays(rs.getInt(3));
						r.setCheckIn(rs.getLong(4));
						r.setCheckOut(rs.getLong(4));
					}
				
				}   catch (Exception e) {
					
					e.printStackTrace();
					}
				return r;
			}
//________________________________________________________________________________________________________________

		
		// Cancellation process, deleting the given row from the table...............
		
		public void cancellationbooking(Integer num) 
			{
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DBUtil.getConnection();

						PreparedStatement pst=con.prepareStatement("delete from BookingDetails where Booking_No=?");
						pst.setInt(1, num);
						pst.execute();
						
						System.out.println("  Cancellation Done Successfully");
					    }
						   catch (Exception e) {
						
						e.printStackTrace();
						}
					
				}		
}
