package com.dxc.Services;

import java.util.List;

import com.dxc.Pojos.Admin;
import com.dxc.Pojos.Bookings;
import com.dxc.Pojos.Hotels;

public interface IAdminService 
{
	
	public boolean addAdmin(Admin a);
	public int adminLogin(int id,String password);
	public boolean addHotel(Hotels hotel);
	public List<Hotels> seeHotels();
	public Hotels showHotel(Hotels h);
	public List<Bookings> allBookings();
	public boolean cancelBooking(int id);

}
