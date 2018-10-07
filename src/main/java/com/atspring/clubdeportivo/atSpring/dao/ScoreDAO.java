package com.atspring.clubdeportivo.atSpring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.atspring.clubdeportivo.atSpring.dto.ScoreDTO;
import com.atspring.clubdeportivo.atSpring.model.Score;

@Repository
public interface ScoreDAO extends JpaRepository<Score, Integer>{

	@Query("SELECT new com.atspring.clubdeportivo.atSpring.dto.ScoreDTO(s.points, s.position) "
			+ "from Score s "
			+ "where s.competition.idCompetition = :idCompetition "
			+ "group by s.idScore "
			+ "order by s.position ASC")
	public List<ScoreDTO> findAllScores(Integer idCompetition);
}
