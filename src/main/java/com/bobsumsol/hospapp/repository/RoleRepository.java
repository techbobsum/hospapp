package com.bobsumsol.hospapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bobsumsol.hospapp.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
