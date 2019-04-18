package com.achiva.blogs;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.achiva.model.blogs.controller.BlogsController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogsApplicationTests {
	@Autowired
	private BlogsController controller;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testGetAllProduct(){
		System.out.println("getAllProduct  " + controller.getAllBlogs());
		System.out.println("getAllProduct  " + controller);
		
		 //Mockito.when(controller.getProductByName("SAHAJ E-VILLAGE LTD").getProductName()).thenReturn("Mock user name");
		 
		 String testName = controller.getProductByName("SAHAJ E-VILLAGE LTD").getProductName();
		 
		 Assert.assertEquals("SAHAJ E-VILLAGE LTD", testName);
	}
	
	
}
