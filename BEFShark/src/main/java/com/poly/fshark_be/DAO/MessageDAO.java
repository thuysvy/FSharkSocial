package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageDAO  extends JpaRepository<Messages, Integer> {
}
