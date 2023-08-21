package com.kosign.school_management.repository.user;

import com.kosign.school_management.domain.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserJpaRepo extends JpaRepository<User, Long> {

}



