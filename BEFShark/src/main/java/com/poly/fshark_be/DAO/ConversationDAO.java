package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Conversations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationDAO  extends JpaRepository<Conversations, Integer> {
}
