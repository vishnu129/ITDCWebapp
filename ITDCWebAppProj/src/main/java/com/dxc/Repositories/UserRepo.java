package com.dxc.Repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dxc.Pojos.User;

@Repository
public interface UserRepo extends MongoRepository<User, Integer> 
{
     
}
