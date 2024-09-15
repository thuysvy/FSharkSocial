package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Posts;
import com.poly.fshark_be.model.Trips;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripDAO extends JpaRepository<Trips, Integer> {
}
