package com.dxc.Pojos;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bookings 
{
	@Id
	private int id;
	private int hotelid;
	private int userid;
	private int rooms;
	private String startdate;
	private String enddate;
	private int status;
	
	public Bookings() {
	}

	


	public Bookings(int id, int hotelid, int userid, int rooms, String startdate, String enddate, int status) {
		super();
		this.id = id;
		this.hotelid = hotelid;
		this.userid = userid;
		this.rooms = rooms;
		this.startdate = startdate;
		this.enddate = enddate;
		this.status = status;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getHotelid() {
		return hotelid;
	}

	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

		
}
