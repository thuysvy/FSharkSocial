package com.poly.fshark_be.DAO;

import com.poly.fshark_be.model.Images;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDAO  extends JpaRepository<Images, Integer> {
}
