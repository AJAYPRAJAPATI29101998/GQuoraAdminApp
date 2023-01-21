package com.userdetails.repository;

import com.userdetails.model.Geo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeoRepo extends JpaRepository<Geo,String> {
}
