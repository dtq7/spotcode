package com.nomso.spotcode.repositories;

import com.nomso.spotcode.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ajao temitayo
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

