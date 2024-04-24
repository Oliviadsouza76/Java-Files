package com.connect.social.main.page.SocialConnect.entity;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;

    private String userId;

    private String originalUserId;

    private String content;

    private String image;

    private Instant createdAt;

    @ElementCollection
    List<String> love = new ArrayList<>();

    @ElementCollection
    List<String> share = new ArrayList<>();

    @ElementCollection
    List<CommentEntity> comment = new ArrayList<>();
}
