package com.test.recruitment.repository;


import com.test.recruitment.models.MUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MUserRepository extends JpaRepository<MUser,Long> {
    Optional<MUser> findByUsernameAndPassword(String userName, String password);
}
