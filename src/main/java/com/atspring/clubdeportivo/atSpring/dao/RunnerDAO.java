package com.atspring.clubdeportivo.atSpring.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atspring.clubdeportivo.atSpring.model.Runner;

@Repository
public interface RunnerDAO extends JpaRepository<Runner, Integer>{

	public Page<Runner> findByNameContaining(Pageable pageable, String name);
}
