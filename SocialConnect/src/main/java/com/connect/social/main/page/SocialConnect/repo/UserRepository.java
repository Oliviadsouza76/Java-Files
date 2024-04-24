package com.connect.social.main.page.SocialConnect.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connect.social.main.page.SocialConnect.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{

	Optional <UserEntity> findByEmail(String email);
}
