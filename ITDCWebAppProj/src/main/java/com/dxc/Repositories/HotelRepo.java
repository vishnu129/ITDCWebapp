package com.dxc.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dxc.Pojos.Hotels;

@Repository
public interface HotelRepo extends MongoRepository<Hotels, Integer> {

}
