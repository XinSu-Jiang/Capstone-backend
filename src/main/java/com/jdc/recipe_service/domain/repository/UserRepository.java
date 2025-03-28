package com.jdc.recipe_service.domain.repository;

import com.jdc.recipe_service.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
