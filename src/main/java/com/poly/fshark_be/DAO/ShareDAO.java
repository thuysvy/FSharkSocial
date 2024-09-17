package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Posts;
import com.poly.fshark_be.model.Shares;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShareDAO extends JpaRepository<Shares, Integer> {
}
