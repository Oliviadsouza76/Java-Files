package com.connect.social.main.page.SocialConnect.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connect.social.main.page.SocialConnect.entity.PostEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, String>{

	Optional<List<PostEntity>> findByUserId(String id);
	Optional<List<PostEntity>> findByUserIdOrderByCreatedAtDesc(String id);
}
