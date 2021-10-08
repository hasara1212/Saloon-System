package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.User_Profile;

@Repository
public interface UserProfileRepository extends JpaRepository<User_Profile, Long>{

}
