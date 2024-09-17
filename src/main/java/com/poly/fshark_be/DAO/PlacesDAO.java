package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Places;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacesDAO  extends JpaRepository<Places, Integer> {
}
