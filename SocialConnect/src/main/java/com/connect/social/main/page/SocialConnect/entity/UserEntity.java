package com.connect.social.main.page.SocialConnect.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "UserBackend")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String role;

    @ElementCollection
    List<String> following = new ArrayList<>();

    @ElementCollection
    List<String> follower = new ArrayList<>();
}
