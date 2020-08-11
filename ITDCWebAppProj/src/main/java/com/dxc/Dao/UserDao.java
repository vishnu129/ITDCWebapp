package com.dxc.Dao;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.Pojos.BookReq;
import com.dxc.Pojos.Bookings;
import com.dxc.Pojos.Hotels;
import com.dxc.Pojos.User;
import com.dxc.Repositories.BookingsRepo;
import com.dxc.Repositories.HotelRepo;
import com.dxc.Repositories.UserRepo;

@Service
public class UserDao implements IUserDao
{
	@Autowired
	UserRepo userdb;
	@Autowired
	BookingsRepo bookingdb;
	@Autowired
	HotelRepo hotelrep;
	@Autowired
	CommonDaos common;

	@Override
	public boolean userLogin(int id, String password) 
	{
		List<User> userlist= new ArrayList<>();
		userlist=userdb.findAll();
		for(User u:userlist)
		{
			if(u.getId()==id && u.getPassword().equals(password))
			{
				return true;
			}
		}
		
		return false;
	}

	@Override
	public int addUser(User user)
	{
		
		List<User> userlist= new ArrayList<>();
		userlist = userdb.findAll();
		int size = userlist.size();
		if(size==0)
		{
			user.setId(100);
			userdb.save(user);
			return 100;	
		}
		else
		{
		int index=userlist.size()-1;
		User us1 =userlist.get(index);
		int id=us1.getId()+1;
		user.setId(id);
		userdb.save(user);
		return id;
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
		int id =h.getId();
		return common.showHotel(id);
	}

	
	@Override
	public boolean available(BookReq req) 
	{
		
		int id =req.getHotelid();
		
		int count=0;
		int flag =0;
		LocalDate frmdate=LocalDate.parse(req.getSdate());
		LocalDate todate =LocalDate.parse(req.getEdate());
		Period d=frmdate.until(todate);
		int days = d.getDays();
		
		List<Bookings> blist= bookingdb.findByhotelid(id);
		
		List<LocalDate> datelist1 = new ArrayList<>();
		Optional<Hotels> h = hotelrep.findById(id);
		Hotels hotel= h.get();
		//System.out.println(blist.size());
		if(blist.size()==0 && req.getRooms()>hotel.getRoom())
		{
			return true;
		}
		else
		{
			
			if(todate.compareTo(frmdate)<0 || req.getRooms()>hotel.getRoom())
			{
				System.out.println("loc 120");
				return false;
			}
	    else
	    {
	    
		    LocalDate temp=frmdate;
		    for(int i=0;i<=days;i++)
		    {
		    	datelist1.add(temp);
		    	temp=temp.plusDays(1);
		    }
		    System.out.println(datelist1);
		    
			for(Bookings b:blist)
			{
				if(b.getStatus()==1)
				{	
				
					LocalDate sdate = LocalDate.parse(b.getStartdate());
					LocalDate edate = LocalDate.parse(b.getEnddate());
					List<LocalDate> datelist2 = new ArrayList<>();
					Period d2 = sdate.until(edate);
					int days2 =d2.getDays();
					
					LocalDate temp2=sdate;
				    for(int i=0;i<=days2;i++)
				    {
				    	datelist2.add(temp2);
				    	temp2=temp2.plusDays(1);
				    }
				    
						System.out.println("from booking"+datelist2);
				//	System.out.println("loc 171");
						for(int i=0;i<=days;i++)
							{
								for(int j=0 ; j<days2 ;j++)
								{
									if(datelist1.get(i).compareTo(datelist2.get(j))==0)
									{
										flag++;
									}
								}
							}
					//System.out.println("is flag"+flag);
						if(flag!=0)
						{
							count+=b.getRooms();
							flag=0;
						}
				  }
				
				
		    	}
			//System.out.println(count+"is count");
			if(count>=hotel.getRoom())
			{
				System.out.println("loc 193");
				return false;
			}
			else
			{
				int room =hotel.getRoom()-count;
				if(room>=req.getRooms())
				{
				return true;
				}
				else
				{
					return false;
				}
			}
				
		
		}
		
		

	}
	}
	@Override
	public double bookHotel(BookReq req) 
	{
		
		Bookings book= new Bookings();
	
		List<Bookings> b =bookingdb.findAll();
		int size = b.size();
		if(size==0)
		{
			book.setId(1);
		}
		else
		{
		int index=b.size()-1;
		Bookings book1 =b.get(index);
		int id=book1.getId()+1;
		book.setId(id);
		}
		book.setHotelid(req.getHotelid());
		book.setUserid(req.getUserid());
		book.setRooms(req.getRooms());
		book.setStartdate(req.getSdate());
		book.setEnddate(req.getEdate());
		book.setStatus(1);
		bookingdb.insert(book);
		
		LocalDate frmdate=LocalDate.parse(req.getSdate());
		LocalDate todate =LocalDate.parse(req.getEdate());
		Period d=frmdate.until(todate);
		int days = d.getDays();
		Optional<Hotels> h = hotelrep.findById(book.getHotelid());
		Hotels hotel = h.get();
		double bill = hotel.getCost() * book.getRooms();
		return bill*days;
	}

	@Override
	public boolean cancelBooking(int id)
	{
		Optional<Bookings> b = bookingdb.findById(id);
		Bookings booking = b.get();
		booking.setStatus(2);
		bookingdb.save(booking);
		return true;
	}

	@Override
	public List<Bookings> history(int id)
	{
		List<Bookings> bookings= bookingdb.findByuserid(id);
		return bookings;
	}

	@Override
	public boolean deleteAccount(int id)
	{
		userdb.deleteById(id);
		return true;
	}

}
