package com.eventfull.fullstackbackend.repository;

import com.eventfull.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
