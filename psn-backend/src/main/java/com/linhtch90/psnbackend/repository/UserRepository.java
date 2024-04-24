package com.linhtch90.psnbackend.repository;

import java.util.Optional;

import com.linhtch90.psnbackend.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    Optional<UserEntity> findByEmail(String email);
    
}
