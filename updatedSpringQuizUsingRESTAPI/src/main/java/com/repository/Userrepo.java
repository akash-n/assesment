package com.repository;
import org.springframework.data.jpa.repository.JpaRepository; import org.springframework.stereotype.Repository;
import com.entity.User; @Repository
public interface Userrepo extends JpaRepository<User, Integer>{ 
	public User findByEmailid(String emailid);

public User getPassword(String password);

public User getEmailid(String emailid);
}
