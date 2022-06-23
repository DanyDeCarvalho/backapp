package com.example.Project;

import com.example.Project.Models.Order;
import com.example.Project.Models.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {
    Optional<User> findByEmail(String email);
    Optional<User> findById(ObjectId id);
    Optional<User> findByName(String name);
    Optional<User> findByUserName(String name);
    Boolean existsByName(String name);
    Boolean existsByEmail(String email);
}
