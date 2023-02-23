/**
 * 
 */
package com.gustavo.projectjpa.DAO.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.gustavo.projectjpa.DAO.SubGeneroDAO;
import com.gustavo.projectjpa.DAO.impl.SubGeneroDAOImpl;
import com.gustavo.projectjpa.entity.Genero;
import com.gustavo.projectjpa.entity.SubGenero;

/**
 * Clse test para comprobar el funcionamiento de los metodos CRUD de subgenero.
 * 
 * @author Calistos
 *
 */
class SubGeneroDAOImplTest {

	private SubGeneroDAO subGeneroDAO = new SubGeneroDAOImpl();

	/**
	 * Test method for
	 * {@link com.gustavo.projectjpa.DAO.impl.SubGeneroDAOImpl#guardar(com.gustavo.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		SubGenero subGenero = new SubGenero();

		subGenero.setDescripcion("Atmospheric Phonk");
		subGenero.setFechaCreacion(LocalDateTime.now());
		subGenero.setEstatus(true);

		Genero genero = new Genero();

		genero.setDescripcion("Phonk");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setEstatus(true);
		subGenero.setGenero(genero);

		this.subGeneroDAO.guardar(subGenero);
	}

	/**
	 * Test method for
	 * {@link com.gustavo.projectjpa.DAO.impl.SubGeneroDAOImpl#actualizar(com.gustavo.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testActualizar() {
		SubGenero subGeneroConsultado = subGeneroDAO.consultarById(6L);

		subGeneroConsultado.setDescripcion("Chill Trap");
		subGeneroConsultado.getGenero().setDescripcion("House");

		this.subGeneroDAO.actualizar(subGeneroConsultado);
	}

	/**
	 * Test method for
	 * {@link com.gustavo.projectjpa.DAO.impl.SubGeneroDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	void testEliminar() {
		this.subGeneroDAO.eliminar(6L);
	}

	/**
	 * Test method for
	 * {@link com.gustavo.projectjpa.DAO.impl.SubGeneroDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<SubGenero> subGeneroConsultados = this.subGeneroDAO.consultar();

		assertTrue(subGeneroConsultados.size() > 0);
		subGeneroConsultados.forEach(subGenero -> {
			System.out.println("Subgenero: " + subGenero.getDescripcion());
			System.out.println("Genero: " + subGenero.getGenero().getDescripcion());
		});
	}

	/**
	 * Test method for
	 * {@link com.gustavo.projectjpa.DAO.impl.SubGeneroDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}

}
