package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import net.javaguides.springboot.model.User;

@Repository
public interface RegistrationRepository extends JpaRepository<User,Long>{

	public User findByEmail(String email);
	public User findByEmailAndPassword(String email, String password);
}