/**
 * 
 */
package com.gustavo.projectjpa.DAO;

import java.util.List;

import com.gustavo.projectjpa.entity.SubGenero;

/**
 * Interface DAO que realiza el CRUD con JPA para la tabla de SubGenero.
 * @author Calistos
 *
 */
public interface SubGeneroDAO {

	/**
	 * Metodo que permite guardar un subgenero.
	 * @param subGenero {@link SubGenero} objeto a guardar.
	 */
	void guardar(SubGenero subGenero);
	/**
	 * Metodo que permite actualizar un subgenero.
	 * @param subGenero {@link SubGenero} objeto a actualizar.
	 */
	void actualizar(SubGenero subGenero);
	/**
	 * Metodo que permite eliminar un subgenero por su identificador.
	 * @param id {@link Long} identificador del subgenero a eliminar.
	 */
	void eliminar(Long id);
	/**
	 * Metodo que permite consultar la lista de subgeneros.
	 * @return {@link List} lista de subgeneros consultados.
	 */
	List<SubGenero> consultar();
	/**
	 * Metodo que permite consultar un subgenero por su identificador.
	 * @param id {@link Long} identificador del subgenero a consultar.
	 * @return {@link SubGenero} objeto subgenero consultado.
	 */
	SubGenero consultarById(Long id);
}
