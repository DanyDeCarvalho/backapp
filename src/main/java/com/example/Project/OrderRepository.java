package com.example.Project;

import com.example.Project.Models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order, String> {
    List<Order> findTop5ByOrderByOrderDateDesc(String id);
    List<Order> findAllByOrderByOrderDateDesc(String id);

}
