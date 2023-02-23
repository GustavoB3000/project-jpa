/**
 * 
 */
package com.gustavo.projectjpa.DAO.impl;

import java.util.List;

import com.gustavo.projectjpa.DAO.SubGeneroDAO;
import com.gustavo.projectjpa.entity.SubGenero;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

/**
 * Clase que implementa el CRUD para las transacciones a la tabla de SubGenero.
 * 
 * @author Calistos
 *
 */
public class SubGeneroDAOImpl implements SubGeneroDAO {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("persistenceGustavo");

	@Override
	public void guardar(SubGenero subGenero) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			em.persist(subGenero);
			et.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(et != null) {
				et.rollback();
			}		
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	@Override
	public void actualizar(SubGenero subGenero) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			em.merge(subGenero);
			et.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(et != null) {
				et.rollback();
			}		
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	@Override
	public void eliminar(Long id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		SubGenero subGeneroConsultado = em.find(SubGenero.class, id);
		
		try {
			et.begin();
			em.remove(subGeneroConsultado);
			et.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(et != null) {
				et.rollback();
			}		
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

	@Override
	public List<SubGenero> consultar() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();	
		TypedQuery<SubGenero> qt = (TypedQuery<SubGenero>) em.createQuery("FROM SubGenero ORDER BY descripcion");
		return qt.getResultList();
	}

	@Override
	public SubGenero consultarById(Long id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();	
		
		return em.find(SubGenero.class, id);
	}

}
