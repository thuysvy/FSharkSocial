package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Postimages;
import com.poly.fshark_be.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDAO extends JpaRepository<Posts, Integer> {
}
