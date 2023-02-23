/**
 * 
 */
package com.gustavo.projectjpa.DAO.impl;

import java.util.List;

import com.gustavo.projectjpa.DAO.DisqueraDAO;
import com.gustavo.projectjpa.entity.Disquera;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

/**
 * @author Calistos
 *
 */
public class DisqueraDAOImpl implements DisqueraDAO {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("persistenceGustavo");

	@Override
	public void guardar(Disquera disquera) {
		// TODO Auto-generated method stub
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.persist(disquera);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	@Override
	public void actualizar(Disquera disquera) {
		// TODO Auto-generated method stub
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.merge(disquera);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		Disquera disqueraConsultada = em.find(Disquera.class, id);
		
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.remove(disqueraConsultada);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

	@Override
	public List<Disquera> consultar() {
		// TODO Auto-generated method stub
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		TypedQuery<Disquera> tq =  (TypedQuery<Disquera>) em.createQuery("FROM Disquera ORDER BY descripcion");
		
		return tq.getResultList();
	}

	@Override
	public Disquera consultarById(Long id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		Disquera objetoABuscar = em.find(Disquera.class, id);

		if (objetoABuscar == null) {
			throw new EntityNotFoundException("La disquera con el id " + id + ", no fue encontrada.");
		}

		return objetoABuscar;
	}

}
