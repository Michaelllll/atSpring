package com.atspring.clubdeportivo.atSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;

import com.atspring.clubdeportivo.atSpring.model.Runner;

public interface RunnerService {
	
	/**
	 * Da de alta un nuevo corredor.
	 * @param runner el corredor nuevo.
	 * @return el corredor creado.
	 */
	Runner create (Runner runner);
	
	/**
	 * Actualiza un objeto corredor dado.
	 * @param runner el corredor a actualizar.
	 */
	void update (Runner runner);
	
	/**
	 * Elimina, si existe, al corredor seleccionado mediante su identificador.
	 * @param idRunner identificador del corredor.
	 */
	void delete (Integer idRunner);
	
	/**
	 * Busca un corredor por su idenfiticador
	 * @param idRunner identificador del corredor.
	 * @return corredor o si no existe devuelve un optional vacio
	 */
	Optional<Runner> findById (Integer idRunner);
	
	/**
	 * Mediante paginación se pueden buscar por nombre los diferentes corredores.
	 * @param pagination paginador
	 * @param name nombre por el que buscar
	 * @return lista de corredores encontrados
	 */
	List<Runner> findAll(Pageable pagination, String name);
	
	/**
	 * Asocia un club al corredor dado.
	 * @param idRunner identificador del corredor
	 * @param idClub identificador del club
	 */
	void addClub(Integer idRunner, Integer idClub);

}
