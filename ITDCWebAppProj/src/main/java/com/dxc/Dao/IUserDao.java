package com.dxc.Dao;

import java.util.List;

import com.dxc.Pojos.BookReq;
import com.dxc.Pojos.Bookings;
import com.dxc.Pojos.Hotels;
import com.dxc.Pojos.User;

public interface IUserDao 
{
	public boolean userLogin(int id,String password);
	public int addUser(User user);
	public List<Hotels> seeHotels();
	public Hotels showHotel(Hotels h);
	public boolean available(BookReq req);
	public double bookHotel(BookReq req);
	public boolean cancelBooking(int id);
	public List<Bookings> history(int id);
	public boolean deleteAccount(int id);
	


}
