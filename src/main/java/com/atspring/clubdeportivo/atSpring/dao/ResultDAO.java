package com.atspring.clubdeportivo.atSpring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.atspring.clubdeportivo.atSpring.dto.ResultDTO;
import com.atspring.clubdeportivo.atSpring.model.Result;

@Repository
public interface ResultDAO extends JpaRepository<Result, Integer>{
	
	@Query("SELECT new com.atspring.clubdeportivo.atSpring.dto.ResultDTO(r.idResult, r.seconds, r.runner.idRunner, c) "
			+ "from Result r "
			+ "INNER JOIN r.runner.club c "
			+ "where r.competition.idCompetition = :idCompetition "
			+ "group by r.idResult "
			+ "order by r.seconds ")
	public List<ResultDTO> getResults(Integer idCompetition);
	
	@Query("SELECT new com.atspring.clubdeportivo.atSpring.dto.ResultDTO(r.seconds, r.runner.name, e.birthYear) "
			+ "from Result r "
			+ "INNER JOIN r.runner e "
			+ "where r.competition.idCompetition = :idCompetition AND "
			+ " e.birthYear BETWEEN :yearStart AND :yearEnd "
			+ "group by r.idResult "
			+ "order by r.seconds ")
	public List<ResultDTO> getResultsByAge(Integer idCompetition, String yearStart, String yearEnd);
	
	@Query("SELECT new com.atspring.clubdeportivo.atSpring.dto.ResultDTO(r.seconds, r.runner.name, e.birthYear) "
			+ "from Result r "
			+ "INNER JOIN r.runner e "
			+ "where r.competition.idCompetition = :idCompetition AND e.birthYear < :year "
			+ "group by r.idResult "
			+ "order by r.seconds ")
	public List<ResultDTO> getResultsByAgeGreaterThan(Integer idCompetition, String year);
}
