package com;

import com.achiva.model.blogs.domain.BlogsTopic;
import com.google.gson.Gson;

public class Util {

	public static void main(String[] args) {
		BlogsTopic topic = new BlogsTopic();
		topic.setActive("A");
		topic.setBlogsContains("Save through REST");
		topic.setUrl("save_through_rest");

		Gson g =new Gson();
		System.out.println(g.toJson(topic));
		
	}

}
