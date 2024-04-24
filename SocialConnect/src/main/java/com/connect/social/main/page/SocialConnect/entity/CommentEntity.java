package com.connect.social.main.page.SocialConnect.entity;

import java.time.Instant;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@jakarta.persistence.Entity(name="comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;

    private String userId;

    private String userFullname;

    private String content;

    private Instant createdAt;

}
