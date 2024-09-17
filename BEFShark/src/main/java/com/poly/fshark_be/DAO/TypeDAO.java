package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Posts;
import com.poly.fshark_be.model.Types;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeDAO extends JpaRepository<Types, Integer> {
}
