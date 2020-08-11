package com.dxc.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxc.Pojos.Admin;
import com.dxc.Pojos.Bookings;
import com.dxc.Pojos.Hotels;
import com.dxc.Services.AdminServiceImpl;

@Controller
public class AdminController 
{
	@Autowired
	AdminServiceImpl admin;
	
	
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/admin")
	public String admin()
	{
		return "adminlogin";
	}
	
	@RequestMapping("/adminlogin")
	public String addAdmin(@RequestParam int id,@RequestParam String password,Model m)
	{
		int stat = admin.adminLogin(id, password);
		if(stat==2)
		{
			return "adminoptions";	
		}
		else if(stat==1)
		{
			m.addAttribute("message", "New Admin Created with Id=1, Name=Admin1, Password=pass");
			return "view";
		}
		else 
		{
			m.addAttribute("message", "Wrong Credentials");
			return "view";
			
		}
		
	}

	@RequestMapping("/addadmin")
	public String addAdmin(@ModelAttribute Admin a,Model m)
	{
		admin.addAdmin(a);
		m.addAttribute("message", "Admin added");
		return "view";
	}

	@RequestMapping("/addhotel")
	public String addHotel(@ModelAttribute Hotels h,Model m)
	{
		boolean stat = admin.addHotel(h);
		if(stat)
		{
		m.addAttribute("message", "hotel added");
		return "view";
		}
		else
		{
			m.addAttribute("message", "hotel adding failed!! Check Id");
			return "view";
		}
	}
	
	@RequestMapping("/showallhotels")
	public String showHotels(Model m)
	{
		List<Hotels> hotels = admin.seeHotels();
		m.addAttribute("list", hotels);
		return "showhotels";
	}
	
	@RequestMapping("/showhotel")
	public String showHotel(@ModelAttribute Hotels h,Model m)
	{
		Hotels hotel = admin.showHotel(h);
		m.addAttribute("hotel", hotel);
		return "showhotel";
	}
	
	@RequestMapping("/showallbooking")
	public String showBooking(Model m)
	{
		List<Bookings> booking = admin.allBookings();
		m.addAttribute("bookings", booking);
		return "allbookings";
	}
	
	@RequestMapping("/cancelbooking")
	public String cancelbooking(@RequestParam int id,Model m)
	{
		admin.cancelBooking(id);
		m.addAttribute("message", "Cancelled");
		return "view";
	}
}
