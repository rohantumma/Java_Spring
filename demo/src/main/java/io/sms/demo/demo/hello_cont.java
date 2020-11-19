/**
 * 
 */
package io.sms.demo.demo;

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
	
	//hello-world-bean {variable access}
	@GetMapping(path="/bean/{name}")
	public hellobean hellobean(@PathVariable String name )
	{
		return new hellobean(String.format("%s pandas", name));
	}

}
