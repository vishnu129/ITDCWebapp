package com.dxc.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.Pojos.Admin;
import com.dxc.Pojos.Bookings;
import com.dxc.Pojos.Hotels;
import com.dxc.Repositories.AdminRepo;
import com.dxc.Repositories.BookingsRepo;
import com.dxc.Repositories.HotelRepo;

@Service
public class AdminDao implements IAdminDao
{

	@Autowired
	AdminRepo adrepo;
	@Autowired
	HotelRepo htrepo;
	@Autowired
	BookingsRepo bkrepo;
	@Autowired
	CommonDaos common;

	@Override
	public boolean addAdmin(Admin a) 
	{
		
		try
		{
		adrepo.insert(a);
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
		
	}

	@Override
	public int adminLogin(int id, String password)
	{
		List<Admin> admins = new ArrayList<>();
		admins=adrepo.findAll();
		int size=admins.size();
		if(size==0)
		{
			Admin a=new Admin(1,"admin1","pass");
			adrepo.save(a);
			return 1;
		}
		
		for(Admin a: admins)
		{
			if(a.getId()==id && a.getPassword().equals(password))
			{
				return 2;
			}
		}
		
		return 3;
		
	}

	@Override
	public boolean addHotel(Hotels hotel)
	{
		try
		{
		htrepo.save(hotel);
		return true;
		}
		catch (Exception e)
		{
			return false;
		}
		
	}

	@Override
	public List<Hotels> seeHotels()
	{
		return common.seeHotels();
	}
	
	@Override
	public Hotels showHotel(Hotels h) 
	{
		int id=h.getId();
		return common.showHotel(id);
	}

	@Override
	public List<Bookings> allBookings()
	{
		List<Bookings> list = bkrepo.findAll();
		return list;
	}

	@Override
	public boolean cancelBooking(int id) 
	{
		Optional<Bookings> a = bkrepo.findById(id);
		Bookings booking = a.get();
		booking.setStatus(3);
		bkrepo.save(booking);
		return true;
		
	}

}
