package com.example.Project;

import com.example.Project.Models.DeliveryAddress;
import com.example.Project.Models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryAddressRepository extends MongoRepository <DeliveryAddress, String> {
    List<DeliveryAddress> findAllByUserId(String userId);

}