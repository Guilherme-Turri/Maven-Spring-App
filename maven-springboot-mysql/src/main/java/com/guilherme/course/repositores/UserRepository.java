package com.guilherme.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
