package com.dxc.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dxc.Pojos.Admin;

@Repository
public interface AdminRepo extends MongoRepository<Admin, Integer>
{

}
