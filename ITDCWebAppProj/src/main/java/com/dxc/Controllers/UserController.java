package com.dxc.Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxc.Pojos.BookReq;
import com.dxc.Pojos.Bookings;
import com.dxc.Pojos.Hotels;
import com.dxc.Pojos.User;
import com.dxc.Services.UserServiceImpl;

@Controller
public class UserController 
{
	@Autowired
	UserServiceImpl userobj;
	
	@RequestMapping("/userlogin")
	public String userLogin(@RequestParam int id,@RequestParam String password,Model m,HttpSession session)
	{
		boolean stat = userobj.userLogin(id, password);
		if(stat)
		{
		session.setAttribute("userid", id);
		return "useroptions";
		}
		else
		{
		m.addAttribute("message", "Wrong Credentials");
		return "view";
		}
		
	}
	
	
	@RequestMapping("/adduser")
	public String addUser(@ModelAttribute User user,Model m)
	{
		int id =userobj.addUser(user);
		m.addAttribute("message", "Your id is: "+id);
		return "view";
	}
	
	@RequestMapping("/showall")
	public String showAll(Model m)
	{
		List<Hotels> list = userobj.seeHotels();
		m.addAttribute("list", list);
		return "userallhotel";
	}
	
	@RequestMapping("/usershowhotel")
	public String showHotel(@ModelAttribute Hotels hotel,Model m)
	{
		Hotels h = userobj.showHotel(hotel);
		m.addAttribute("hotel", h);
		return "userhotel";
	}
	
	@RequestMapping("/bookhotel")
	public String bookHotel(@RequestParam int id,@RequestParam int room,@RequestParam String sdate,@RequestParam String edate,Model m,HttpSession session)
	{
		int userid = (int) session.getAttribute("userid");
		BookReq req = new BookReq();
		req.setUserid(userid);
		req.setHotelid(id);
		req.setRooms(room);
		req.setSdate(sdate);
		req.setEdate(edate);
		//System.out.println(userid+"this is user id"+" "+id+" "+room+" "+sdate+" "+edate );
		
		boolean check =userobj.available(req);
		if(check)
		{	
		double bill = userobj.bookHotel(req);
		m.addAttribute("details", req);
		m.addAttribute("bill", bill);
		return "bill";
		}
		else
		{
		m.addAttribute("message", "Rooms not Available!!!");
		return "view";
		}
	}
	
	@RequestMapping("/history")
	public String history(HttpSession session, Model m)
	{
		int userid = (int) session.getAttribute("userid");
		List<Bookings> list = userobj.history(userid);
		m.addAttribute("history", list);
		
		return "history";
	}
	
	@RequestMapping("/cancel")
	public String cancelReq(@RequestParam int id, Model m)
	{
		userobj.cancelBooking(id);
		m.addAttribute("message", "Cancel Requested");
		return "view";
	}
	
	@RequestMapping("/delete")
	public String deleteReq(HttpSession session, Model m)
	{

		int userid = (int) session.getAttribute("userid");
		userobj.deleteAccount(userid);
		m.addAttribute("message", "Account Deleted");
		return "view";
	}
	
	
	
	@RequestMapping("/sortbystate")
	public String sortbystate(@RequestParam String[] options, Model m)
	{
		List<Hotels> list = userobj.seeHotels();
		List<Hotels> list2 = new ArrayList<>();
		String state = options[0];
		if(state.equalsIgnoreCase("showall"))
		{
			m.addAttribute("list", list);
			return "userallhotel";
		}
		for(Hotels h:list)
		{
			if(h.getState().equalsIgnoreCase(state))
			{
				list2.add(h);
			}
		}
		m.addAttribute("list", list2);
		return "userallhotel";
	}
	

}
