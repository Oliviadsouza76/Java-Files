package com.linhtch90.psnbackend.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
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
