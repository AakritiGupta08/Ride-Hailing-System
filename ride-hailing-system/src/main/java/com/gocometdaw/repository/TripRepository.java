package com.gocometdaw.repository;

import com.gocometdaw.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Long> {}