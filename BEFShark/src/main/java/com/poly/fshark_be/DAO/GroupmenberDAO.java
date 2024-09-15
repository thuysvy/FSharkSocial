package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Groupmembers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupmenberDAO  extends JpaRepository<Groupmembers, Integer> {
}
