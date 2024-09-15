package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Posts;
import com.poly.fshark_be.model.Triproles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TriproleDAO extends JpaRepository<Triproles, Integer> {
}
