package io.smsapi.spring_demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo_controller {
	
	@GetMapping("/")
	public List <demo> getAllDemo()
	{
		return Arrays.asList(
				new demo(123l,"pandas"),
				new demo(321l,"loki"),
				new demo(321l,"lo")
				);	  
	}
} 
