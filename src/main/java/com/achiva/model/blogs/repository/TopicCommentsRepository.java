package com.achiva.model.blogs.repository;

import org.springframework.data.repository.CrudRepository;

import com.achiva.model.blogs.domain.TopicComments;

public interface TopicCommentsRepository extends CrudRepository<TopicComments, Integer> {

}
