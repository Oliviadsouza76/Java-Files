package com.connect.social.main.page.SocialConnect.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connect.social.main.page.SocialConnect.entity.PostEntity;
import com.connect.social.main.page.SocialConnect.repo.PostRepository;
@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepo;

	
	//Insert Comment ,
	public ResponseObjectService updatePostByComment(PostEntity postEntity) {
		ResponseObjectService responseObj = new ResponseObjectService();
		Optional<PostEntity> optPost = postRepo.findById(postEntity.getId());
		if(optPost.isEmpty()) {
			responseObj.setStatus("fail");
			responseObj.setMessage("Canot find Message:"+postEntity.getId());
			responseObj.setPayload(optPost);
			return responseObj;
		} else {
			postRepo.save(postEntity);
			responseObj.setStatus("Success");
			responseObj.setMessage("Post is updated Successfully");
			responseObj.setPayload(postEntity);
			return responseObj;
		}
		
	}
	
}
