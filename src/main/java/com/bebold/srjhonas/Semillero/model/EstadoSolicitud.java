package com.bebold.srjhonas.Semillero.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "estados_solicitud")

public class EstadoSolicitud {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_estado;
	private String nombre_estado;
	
	
	
	public EstadoSolicitud() {
		super();
	}
	public EstadoSolicitud(Integer id_estado, String nombre_estado) {
		super();
		this.id_estado = id_estado;
		this.nombre_estado = nombre_estado;
	}
	public Integer getId_estado() {
		return id_estado;
	}
	public void setId_estado(Integer id_estado) {
		this.id_estado = id_estado;
	}
	public String getNombre_estado() {
		return nombre_estado;
	}
	public void setNombre_estado(String nombre_estado) {
		this.nombre_estado = nombre_estado;
	}
	
	

}
