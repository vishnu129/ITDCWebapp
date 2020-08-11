package com.dxc.Repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dxc.Pojos.Bookings;

@Repository
public interface BookingsRepo extends MongoRepository<Bookings, Integer> 
{

	List<Bookings> findByhotelid(int hotelId);
	List<Bookings> findByuserid(int userId);
}
