package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.Service.RegistrationService;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.RegistrationRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/")
public class RegistrationController {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Autowired
	private RegistrationService registrationservice;
	

	// get all employees
		@GetMapping("/userlist")
		public List<User> getAllUser(){
			return registrationRepository.findAll();
		}
		
		@PostMapping("/register")
		@CrossOrigin(origins = "http://localhost:4200")
		public User registerUser(@RequestBody User user) throws Exception
		{
			String tempemail = user.getEmail();
			if(tempemail != null && !"".equals(tempemail))
			{
				User userobj = registrationservice.fetchUserByEmail(tempemail);
				if(userobj != null)
				{
					throw new Exception("User with "+ tempemail +" is already exist...");
				}
			}
			User userobj = null;
			userobj = registrationservice.saveUser(user);
			return userobj;
		}
		
		@PostMapping("/login")
		@CrossOrigin(origins = "http://localhost:4200")
		public User loginUser(@RequestBody User user) throws Exception
		{
			String tempemail = user.getEmail();
			String temppassword = user.getPassword();
			User userobj = null;
			if(tempemail != null && temppassword != null)
			{
				userobj = registrationservice.fetchUserByEmailAndPassword(tempemail, temppassword);
			}
			
			if(userobj == null)
			{
				throw new Exception("Bad Credential...");
			}
			return userobj;
		}
}
