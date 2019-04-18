package com.achiva.model.blogs.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.achiva.model.blogs.domain.BlogsTopic;

public interface BlogsTopicRepository extends CrudRepository<BlogsTopic, Integer> {

	@Query("select b from BlogsTopic b")
	List<BlogsTopic> findFirst10(Pageable pageable);
	
	
}