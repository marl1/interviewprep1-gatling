package com.marl1.gatling4interview.user.repository;

import com.marl1.gatling4interview.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
