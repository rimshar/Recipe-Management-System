package com.recipes.RecipeManagementBackend.repository;
import com.recipes.RecipeManagementBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.net.UnknownServiceException;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findById(Long id);

}
