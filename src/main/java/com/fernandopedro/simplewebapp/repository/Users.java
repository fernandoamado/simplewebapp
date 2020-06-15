package com.fernandopedro.simplewebapp.repository;

import com.fernandopedro.simplewebapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Users extends JpaRepository<User, Long> {

}
