package com.hotelmanagement.Model;

public class CustomerInfo {
	  private String Idproof;
      private String name;
      private String address;
      private String phoneno;
     
	public String getIdproof() {
		return Idproof;
	}
	public void setIdproof(String idproof) {
		Idproof = idproof;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "CustomerInfo : \n Idproof= " + Idproof + "\n name= " + name + "\n address= " + address + "\n phoneno= " + phoneno
				+ " ";
	}
	
     
}
