package com.bobsumsol.hospapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bobsumsol.hospapp.models.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
