package com.example.Project;

import com.example.Project.Models.Role;
import com.example.Project.Models.ERole;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
