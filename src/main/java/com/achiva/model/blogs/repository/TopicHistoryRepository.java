package com.achiva.model.blogs.repository;

import org.springframework.data.repository.CrudRepository;

import com.achiva.model.blogs.domain.TopicHistory;

public interface TopicHistoryRepository extends CrudRepository<TopicHistory, Integer> {

}
