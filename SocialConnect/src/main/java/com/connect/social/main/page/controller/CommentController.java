package com.connect.social.main.page.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.connect.social.main.page.SocialConnect.entity.CommentEntity;
import com.connect.social.main.page.SocialConnect.entity.CommentPostRequestEntity;
import com.connect.social.main.page.SocialConnect.entity.IdObjectEntity;
import com.connect.social.main.page.SocialConnect.service.CommentService;
import com.connect.social.main.page.SocialConnect.service.ResponseObjectService;
@RestController
@RequestMapping("SocialConnect/api/v1")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@PostMapping("/insertComment")
	public ResponseEntity<ResponseObjectService> insertComment(@RequestBody CommentPostRequestEntity commentPostRequestEntity){
		CommentEntity inputComment = commentPostRequestEntity.getCommentEntity();
		IdObjectEntity inputPostId = commentPostRequestEntity.getPostId();
		return new ResponseEntity<ResponseObjectService>(commentService.insertComment(inputComment, inputPostId.getId()),HttpStatus.OK);
	}
	
}
