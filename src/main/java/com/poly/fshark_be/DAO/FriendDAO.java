package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Friends;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendDAO  extends JpaRepository<Friends, Integer> {
}
