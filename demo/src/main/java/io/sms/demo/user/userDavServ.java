/**
 * 
 */
package io.sms.demo.user;

import java.util.*;

/**
 * @author rohan
 *
 */

import org.springframework.stereotype.Component;

@Component
public class userDavServ {
	
	private static List<User> users = new ArrayList<>();
	private static int usersCount= 3;
	static {
		users.add(new User (1,"Oden", new Date()));
		users.add(new User (2,"Loki", new Date()));
		users.add(new User (3,"Thor", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save( User user) {
		if(user.getId() == null)
		{
			user.setId(++usersCount);
		}
		users.add(user);
		return user;	
	}
	
	public User findOne(int id)
	{
		for (User user: users) {
			if(user.getId() == id)
			{
				return user;
			}
		} 
		return null;
	}

}
