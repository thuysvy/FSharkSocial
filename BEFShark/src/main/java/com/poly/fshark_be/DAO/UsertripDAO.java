package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Posts;
import com.poly.fshark_be.model.Usertrips;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsertripDAO extends JpaRepository<Usertrips, Integer> {
}
