package com.atspring.clubdeportivo.atSpring.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.atspring.clubdeportivo.atSpring.dto.ResultDTO;
import com.atspring.clubdeportivo.atSpring.dto.ScoreDTO;
import com.atspring.clubdeportivo.atSpring.model.Result;

public interface ResultService {

	/**
	 * Da de alta un nuevo resultado, dado sus respectivos atributos.
	 * @param result el Resultado a guardar.
	 * @param idRunner el identificador del corredor con el que será relacionado.
	 * @param idCompetition el identificador de la competición a la que pertenece el resultado.
	 * @return
	 */
	Result create(Result result, Integer idRunner, Integer idCompetition);

	/**
	 * Dado un identificador proveniente de un resultado, obtiene el objeto Result al que corresponde.
	 * @param idResult identificador de resultado.
	 * @return el resultado encontrado, de tipo Optional<Result>
	 */
	Optional<Result> findById(Integer idResult);

	/**
	 * Obtiene todos los resultados disponibles.
	 * @return una lista de resultados de tipo Result.
	 */
	List<Result> findAll();
	
	/**
	 * Obtiene las puntuaciones que se establecen para la competición dada a partir de ScoreDAO.
	 * @param idCompetition identificador de la competición.
	 * @return una lista de puntuaciones de tipo ScoreDTO.
	 */
	List<ScoreDTO> getScores(Integer idCompetition);
	
	/**
	 * Obtiene los resultados de una competición a partir de ResultDAO.
	 * @param idCompetition identificador de la competición.
	 * @return una lista de resultados de tipo ResultDTO.
	 */
	List<ResultDTO> getResults(Integer idCompetition);
	
	/**
	 * Recupera las puntuaciones y los participantes de una prueba o competición y crea una clasficación
	 * en base a los puntos, posteriormente se almacenan en un fichero.	
	 * @param idCompetition identificador de la competición.
	 * @throws IOException
	 */
	void writeToFile(Integer idCompetition) throws IOException;
}
