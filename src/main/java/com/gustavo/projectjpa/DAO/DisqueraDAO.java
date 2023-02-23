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
	
}
