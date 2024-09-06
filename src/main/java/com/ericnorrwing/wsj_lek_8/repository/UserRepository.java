package com.ericnorrwing.wsj_lek_8.repository;

import com.ericnorrwing.wsj_lek_8.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
