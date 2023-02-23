/**
 * 
 */
package com.gustavo.projectjpa.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Clase que representa una entidad de la tabla genero.
 * @author Calistos
 *
 */
@Entity
@Table(name="genero")
public class Genero {
	/**
	 * Id del Genero.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idGenero")
	private Long idGenero;
	/**
	 * Descripcion del Genero.
	 */
	@Column(name = "descripcion")
	private String descripcion;
	/**
	 * Fecha de creacion del Genero.
	 */
	@Column(name="fechaCreacion")
	private LocalDateTime fechaCreacion;
	/**
	 * Fecha de modificacion del Genero.
	 */
	@Column(name="fechaModificacion")
	private LocalDateTime fechaModificacion;
	/**
	 * Estado del Genero.
	 */
	@Column(name="estatus")
	private boolean estatus;
	/**
	 * @return the idGenero
	 */
	public Long getIdGenero() {
		return idGenero;
	}
	/**
	 * @param idGenero the idGenero to set
	 */
	public void setIdGenero(Long idGenero) {
		this.idGenero = idGenero;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * @return the fechaModificacion
	 */
	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}
	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}
	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

}
