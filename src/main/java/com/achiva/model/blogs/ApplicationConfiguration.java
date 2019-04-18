package com.achiva.model.blogs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.achiva.model.blogs.repository")
public class ApplicationConfiguration {
	
}
