package com.connect.social.main.page.SocialConnect.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connect.social.main.page.SocialConnect.entity.CommentEntity;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, String>{

}
