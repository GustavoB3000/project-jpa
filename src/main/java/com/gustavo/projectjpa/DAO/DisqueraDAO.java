/**
 * 
 */
package com.gustavo.projectjpa.DAO;

import java.util.List;

import com.gustavo.projectjpa.entity.Disquera;

/**
 * Interface que genera el DAO para las transacciones CRUD a la tabla de disquera.
 * @author Calistos
 *
 */
public interface DisqueraDAO {

	void guardar(Disquera disquera);
	
	void actualizar(Disquera disquera);
	
	void eliminar(Long id);
	
	List<Disquera> consultar();
	
	Disquera consultarById(Long id);
	
	/**
	 * Metodo que permite consultar con JPQL la disquera apartir de una descripcion.
	 * @param descripcion {@link String} descripcion de la disquera.
	 * @return {@link Disquera} la disquera consultada.
	 */
	Disquera consultarByDescripcionJPQL(String descripcion);
	
	/**
	 * Metodo que permite consultar con SQL Nativo la disquera apartir de una descripcion.
	 * @param descripcion {@link String} descripcion de la disquera.
	 * @return {@link Disquera} la disquera consultada.
	 */
	Disquera consultarByDescripcionNative(String descripcion);
	
}
