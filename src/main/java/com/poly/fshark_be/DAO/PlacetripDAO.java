package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Placetrips;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacetripDAO  extends JpaRepository<Placetrips, Integer> {
}
