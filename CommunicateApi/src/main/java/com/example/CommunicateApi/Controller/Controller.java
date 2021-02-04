package com.example.CommunicateApi.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	@Autowired
	private RestTemplate restTemplate;
	
	private static String url ="http://localhost:9000/employees/";
	
	@GetMapping("/employees")
	public List<Object> getEmployees(){
		Object[] employee = restTemplate.getForObject(url, Object[].class);
		System.out.println("hello");
		return Arrays.asList(employee);
		
	}
}
