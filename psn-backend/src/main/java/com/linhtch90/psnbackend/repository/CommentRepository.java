package com.linhtch90.psnbackend.repository;

import com.linhtch90.psnbackend.entity.CommentEntity;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, String> {
    
}