package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Friendrequests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendrequestDAO  extends JpaRepository<Friendrequests, Integer> {
}
