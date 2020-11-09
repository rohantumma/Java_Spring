/**
 * 
 */
package io.sms.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rohan
 *
 */

//controller
@RestController
public class hello_cont {
	
	
//	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	@GetMapping(path="/")
	public String hellocont()
	{
		return "Hey pandas";
	}
	
	//hello-world-bean
	@GetMapping(path="/bean")
	public hellobean hellobean()
	{
		return new hellobean("pandas");
	}

}
