package com.locations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locations.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    
}

