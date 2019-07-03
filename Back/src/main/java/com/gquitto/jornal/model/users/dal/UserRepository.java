package com.gquitto.jornal.model.users.dal;

import com.gquitto.jornal.model.users.tables.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    Integer countAllByEmail(String email);

    User getUserByEmailAndPassword(String email, String password);
}
