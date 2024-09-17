package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Posts;
import com.poly.fshark_be.model.Userroles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserroleDAO extends JpaRepository<Userroles, Integer> {
}
