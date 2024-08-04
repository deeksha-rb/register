package com.postgresql.registeringUser.repository;

import com.postgresql.registeringUser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
