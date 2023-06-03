package com.project1;

public class panCard {
	
	private int Id;
	private String Name;
	private String Address;
	private long Phno;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhno() {
		return Phno;
	}
	public void setPhno(long phno) {
		Phno = phno;
	}
	@Override
	public String toString() {
		return "panCard [Id=" + Id + ", Name=" + Name + ", Address=" + Address + ", Phno=" + Phno + "]";
	}
	
}


