package com.dxc.Pojos;

public class BookReq 
{
	
	private int hotelid;
	private int userid;
	private int rooms;
	private String sdate;
	private String edate;
	
	public BookReq() 
	{
	}
	

	public BookReq(int hotelid, int userid, int rooms, String sdate, String edate) {
		super();
		this.hotelid = hotelid;
		this.userid = userid;
		this.rooms = rooms;
		this.sdate = sdate;
		this.edate = edate;
	}
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}


	public int getHotelid() {
		return hotelid;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	
	
	}
