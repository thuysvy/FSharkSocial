package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeDAO  extends JpaRepository<Likes, Integer> {
}
