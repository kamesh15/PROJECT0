package com.hotelmanagement.Model;

public class RoomBooking {
	private Integer bookingid;
	private Integer noofdays;
	private Long checkIn;
	private Long checkOut;
	private String roomType;
    
    public Integer getBookingid() {
		return bookingid;
	}
	public void setBookingid(Integer bookingid) {
		this.bookingid = bookingid;
	}
	public Integer getNoofdays() {
		return noofdays;
	}
	public void setNoofdays(Integer noofdays) {
		this.noofdays = noofdays;
	}
	public Long getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Long checkIn) {
		this.checkIn = checkIn;
	}
	public Long getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Long checkOut) {
		this.checkOut = checkOut;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	@Override
	public String toString() {
		return "RoomBooking:  \n bookingid= " + bookingid + "\n noofdays= " + noofdays + "\n checkIn=" + checkIn + "\n checkOut= "
				+ checkOut + "\n roomType= " + roomType + " ";
	}
	
    
	
	
    
    
	
}
