package com.devcambodia.Personal_Financial_MGT.repository;

import com.devcambodia.Personal_Financial_MGT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByUsername(String username);
}
