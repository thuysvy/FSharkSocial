package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentDAO  extends JpaRepository<Comments, Integer> {
}
