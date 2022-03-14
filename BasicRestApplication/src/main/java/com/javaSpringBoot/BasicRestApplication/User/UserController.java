package com.javaSpringBoot.BasicRestApplication.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@ComponentScan("com.javaSpringBoot.BasicRestApplication.SpringBootStarter")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/users")
	public List<User> getAllUsers() {

		return userService.getAllUsers();	
	}
	
	@RequestMapping(value = "/users/{id}")
	public User getUser(@PathVariable String id) {
	    return userService.getUser(id);
	}
	
	@RequestMapping(value="/users", method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	 public void deleteUser(@PathVariable String id) {
	      userService.deleteUser(id);
	 }

}