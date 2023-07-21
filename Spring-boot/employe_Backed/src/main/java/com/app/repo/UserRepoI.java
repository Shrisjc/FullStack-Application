package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


import com.app.pojos.User;
@Repository
@EnableJpaRepositories
public interface UserRepoI extends JpaRepository<User, Integer> {

}
