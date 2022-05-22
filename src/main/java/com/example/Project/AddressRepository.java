package com.example.Project;

import com.example.Project.Models.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository <Address, String> {
}
