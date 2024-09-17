package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Posts;
import com.poly.fshark_be.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<Users, Integer> {
}
