/**
 * 
 */
package com.gustavo.projectjpa.DAO.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.gustavo.projectjpa.DAO.DisqueraDAO;
import com.gustavo.projectjpa.DAO.impl.DisqueraDAOImpl;
import com.gustavo.projectjpa.entity.Disquera;

/**
 * @author Calistos
 *
 */
class DisqueraDAOImplTest {
	
	private DisqueraDAO disqueraDAO = new DisqueraDAOImpl();

	/**
	 * Test method for {@link com.gustavo.projectjpa.DAO.impl.DisqueraDAOImpl#guardar(com.gustavo.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testGuardar() {
		//Crear el objeto a guardar:
		Disquera disquera = new Disquera();
		
		disquera.setDescripcion("Callistos");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setEstatus(true);
		
		this.disqueraDAO.guardar(disquera);
	}

	/**
	 * Test method for {@link com.gustavo.projectjpa.DAO.impl.DisqueraDAOImpl#actualizar(com.gustavo.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testActualizar() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarById(9l);
		
		disqueraConsultada.setDescripcion("Iron Maiden");
		
		this.disqueraDAO.actualizar(disqueraConsultada);
	}

	/**
	 * Test method for {@link com.gustavo.projectjpa.DAO.impl.DisqueraDAOImpl#eliminar(com.gustavo.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testEliminar() {
		this.disqueraDAO.eliminar(9L);
	}

	/**
	 * Test method for {@link com.gustavo.projectjpa.DAO.impl.DisqueraDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<Disquera> listaTemporalDisqueras =  this.disqueraDAO.consultar();
		
		assertTrue(listaTemporalDisqueras.size() > 0);
		
		listaTemporalDisqueras.forEach(disquera ->{
			System.out.println("Disquera: " + disquera.getDescripcion());
		});
	}

	/**
	 * Test method for {@link com.gustavo.projectjpa.DAO.impl.DisqueraDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		Disquera disquera = this.disqueraDAO.consultarById(155L);
		System.out.println("Disquera " + disquera.getDescripcion());
	}

}
