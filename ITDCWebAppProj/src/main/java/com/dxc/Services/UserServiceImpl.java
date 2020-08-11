package com.dxc.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.Dao.UserDao;
import com.dxc.Pojos.BookReq;
import com.dxc.Pojos.Bookings;
import com.dxc.Pojos.Hotels;
import com.dxc.Pojos.User;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserDao userdao;
	
	@Override
	public boolean userLogin(int id, String password)
	{
		return userdao.userLogin(id, password);
	}

	@Override
	public int addUser(User user) 
	{
		return userdao.addUser(user) ;
	}

	@Override
	public List<Hotels> seeHotels() 
	{
		return userdao.seeHotels();
	}

	@Override
	public Hotels showHotel(Hotels h)
	{
		return userdao.showHotel(h);
	}

	@Override
	public boolean available(BookReq req) 
	{
		return userdao.available(req);
	}

	@Override
	public double bookHotel(BookReq req)
	{
		return userdao.bookHotel(req);
	}

	@Override
	public boolean cancelBooking(int id)
	{
		return userdao.cancelBooking(id);
	}

	@Override
	public List<Bookings> history(int id) 
	{
		return userdao.history(id);
	}

	@Override
	public boolean deleteAccount(int id) 
	{
		return userdao.deleteAccount(id);
	}

}
