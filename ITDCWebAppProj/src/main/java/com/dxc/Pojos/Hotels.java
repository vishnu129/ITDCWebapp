package com.dxc.Pojos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Hotels 
{

	@Id
	private int id;
	private String name;
	private String state;
	private String district;
	private long zip;
	private int room;
	private double cost;
	private int rating;
	private String image;
	private String map;
	
	public Hotels() {
	}

	

	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getMap() {
		return map;
	}



	public void setMap(String map) {
		this.map = map;
	}



	public Hotels(int id, String name, String state, String district, long zip, int room, double cost, int rating,
			String image, String map) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.district = district;
		this.zip = zip;
		this.room = room;
		this.cost = cost;
		this.rating = rating;
		this.image = image;
		this.map = map;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
