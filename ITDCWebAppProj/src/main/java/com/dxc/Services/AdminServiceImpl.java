package com.dxc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.Dao.AdminDao;
import com.dxc.Pojos.Admin;
import com.dxc.Pojos.Bookings;
import com.dxc.Pojos.Hotels;

@Service
public class AdminServiceImpl implements IAdminService 
{
	@Autowired
	AdminDao admin;

	@Override
	public boolean addAdmin(Admin a)
	{
		return admin.addAdmin(a);
	}

	@Override
	public int adminLogin(int id, String password)
	{
		
		return admin.adminLogin(id, password);
	}

	@Override
	public boolean addHotel(Hotels hotel) 
	{
		return admin.addHotel(hotel);
	}

	@Override
	public List<Hotels> seeHotels()
	{
		return admin.seeHotels();
	}
	
	@Override
	public Hotels showHotel(Hotels h) 
	{
		return admin.showHotel(h);
	}

	@Override
	public List<Bookings> allBookings() 
	{
		return admin.allBookings();
	}

	

	@Override
	public boolean cancelBooking(int id)
	{
		return admin.cancelBooking(id);
	}

}
