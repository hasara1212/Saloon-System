package net.javaguides.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository registrationrepository;
	
	public User saveUser(User user)
	{
		return registrationrepository.save(user);
	}
	
	public User fetchUserByEmail(String email)
	{
		return registrationrepository.findByEmail(email); 
	}
	
	public User fetchUserByEmailAndPassword(String email, String password)
	{
		return registrationrepository.findByEmailAndPassword(email, password); 
	}
}
