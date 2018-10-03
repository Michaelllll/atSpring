package com.atspring.clubdeportivo.atSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atspring.clubdeportivo.atSpring.model.Club;

@Repository
public interface ClubDAO extends JpaRepository<Club, Integer> {

}
