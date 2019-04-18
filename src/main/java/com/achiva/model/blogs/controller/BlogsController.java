package com.achiva.model.blogs.controller;


import static com.achiva.model.blogs.utility.Constants.SUCCESS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.achiva.model.blogs.domain.BlogsTopic;
import com.achiva.model.blogs.domain.TopicComments;
import com.achiva.model.blogs.dto.BlogsTopicDTO;
import com.achiva.model.blogs.dto.ServiceResponse;
import com.achiva.model.blogs.dto.TopicCommentsDTO;
import com.achiva.model.blogs.repository.BlogsTopicRepository;
import com.achiva.model.blogs.repository.CommentsGalleryRepository;
import com.achiva.model.blogs.repository.TopicCommentsRepository;
import com.achiva.model.blogs.repository.TopicGalleryRepository;
import com.achiva.model.blogs.repository.TopicHistoryRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/blogs")
public class BlogsController {
	
	@Autowired 
	private BlogsTopicRepository blogsTopsRepository;
	
	@Autowired
	private TopicCommentsRepository topicComments;
	
	@Autowired
	private TopicHistoryRepository topicHistory;
	
	@Autowired
	private TopicGalleryRepository topicGallery;
	
	@Autowired
	private CommentsGalleryRepository commentsGallery;
	
	
	@GetMapping(path="/all")
	public @ResponseBody ServiceResponse getAllBlogs() {
		
		ServiceResponse response  = new ServiceResponse();
		List<BlogsTopic> list = blogsTopsRepository.findFirst10(new PageRequest(0, 4, Direction.ASC, "displayRanking"));
		response.setResult(SUCCESS);
		response.setResponseObject(list);
		return response;
	}
	
	@GetMapping(path="/getBlog")
	public @ResponseBody ServiceResponse getBlog(@RequestParam("id") int id ) {
		
		ServiceResponse response  = new ServiceResponse();
		BlogsTopic blog = blogsTopsRepository.findOne(id);
		response.setResult(SUCCESS);
		response.setResponseObject(blog);
		return response;
		
	}
	
	@PostMapping(path="/saveTopic")
	public @ResponseBody ServiceResponse saveTopic(@RequestBody BlogsTopicDTO topicDto ) {
		
		ServiceResponse response  = new ServiceResponse();
		
		BlogsTopic topic = new BlogsTopic();
		topic.setActive(topicDto.getActive());
		topic.setBlogsContains(topicDto.getBlogsContains());
		topic.setUrl(topicDto.getUrl());
		BlogsTopic blog = blogsTopsRepository.save(topic);
		response.setResult(SUCCESS);
		response.setResponseObject(blog);

		return response;
		 
	}
	
	@PostMapping(path="/saveComments")
	public @ResponseBody ServiceResponse saveComments(@RequestBody TopicCommentsDTO commentsDto ) {
		
		ServiceResponse response  = new ServiceResponse();
		
		TopicComments comments = new TopicComments();
		comments.setActive(commentsDto.getActive());
		comments.setCommentsByEmailId(commentsDto.getCommentsByEmailId());
		comments.setCommentsBy(commentsDto.getCommentsBy());
		comments.setCommentsByFbid(commentsDto.getCommentsByFbid());
		comments.setCommentsByGoogleId(commentsDto.getCommentsByGoogleId());
		comments.setCommentsByMoblieNo(commentsDto.getCommentsByMoblieNo());
		comments.setCommentsContains(commentsDto.getCommentsContains());
		comments.setCommentsSub(commentsDto.getCommentsSub());
		comments.setCommentsOn(commentsDto.getCommentsOn());
		comments.setTopicId(commentsDto.getTopicId());
		
		TopicComments commentsSaved = topicComments.save(comments);
		response.setResult(SUCCESS);
		response.setResponseObject(commentsSaved);

		return response;
		 
	}
}
