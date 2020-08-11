package com.dxc.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.Pojos.Hotels;
import com.dxc.Repositories.HotelRepo;

@Service
public class CommonDaos 
{
	@Autowired
	HotelRepo htrepo;
	
	
	public List<Hotels> seeHotels()
	{
		List<Hotels> list= new ArrayList<>();
		list=htrepo.findAll();
		return list;
	}
	
	public Hotels showHotel(int id)
	{
		Optional<Hotels> h= htrepo.findById(id);
		Hotels hotel =h.get();
		//System.out.println(hotel.getName()+" this is name");
		return hotel;
	}

}
