package com.connect.social.main.page.SocialConnect.service;

import java.time.Instant;
import java.util.Optional;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connect.social.main.page.SocialConnect.entity.CommentEntity;
import com.connect.social.main.page.SocialConnect.entity.PostEntity;
import com.connect.social.main.page.SocialConnect.repo.CommentRepository;
import com.connect.social.main.page.SocialConnect.repo.PostRepository;


@Service
public class CommentService {

	@Autowired
	private CommentRepository commentRepo;
	
	@Autowired
	private PostRepository postRepo;
	
	@Autowired
	private PostService postService;
	
	//To Insert Comments
	public ResponseObjectService insertComment(CommentEntity commentEntity,String inputIdPost) {
		ResponseObjectService responseObj = new ResponseObjectService();
		Optional <PostEntity> optPost = postRepo.findById(inputIdPost);
		if(optPost.isEmpty()) {
			responseObj.setStatus("fail");
			responseObj.setMessage("Cannot find Target Post " +inputIdPost);
			responseObj.setPayload(null);
			return responseObj;
		} else {
			commentEntity.setCreatedAt(Instant.now());
			commentRepo.save(commentEntity);
			PostEntity targetPost = optPost.get();
			List<CommentEntity> commentList = targetPost.getComment();
			if(commentList==null) {
				commentList = new ArrayList<>();
			}
			commentList.add(commentEntity);
			targetPost.setComment(commentList);
			postService.updatePostByComment(targetPost);
			responseObj.setStatus("Success");
			responseObj.setMessage("success");
			responseObj.setPayload(commentEntity);
			return responseObj;
		}
		
	}
	
}
