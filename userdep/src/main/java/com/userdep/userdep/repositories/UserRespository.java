package com.userdep.userdep.repositories;

import com.userdep.userdep.entiites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User,Long> {

}
