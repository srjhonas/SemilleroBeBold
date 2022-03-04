package com.bebold.srjhonas.Semillero.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "rechazos")
public class Rechazo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_rechazo;
	private String motivo; 
	private Integer id_hacedor; 
	private Integer id_solserv;
	
	
	
	public Rechazo() {
		super();
	}
	public Rechazo(Integer id_rechazo, String motivo, Integer id_hacedor, Integer id_solserv) {
		super();
		this.id_rechazo = id_rechazo;
		this.motivo = motivo;
		this.id_hacedor = id_hacedor;
		this.id_solserv = id_solserv;
	}
	public Integer getId_rechazo() {
		return id_rechazo;
	}
	public void setId_rechazo(Integer id_rechazo) {
		this.id_rechazo = id_rechazo;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public Integer getId_hacedor() {
		return id_hacedor;
	}
	public void setId_hacedor(Integer id_hacedor) {
		this.id_hacedor = id_hacedor;
	}
	public Integer getId_solserv() {
		return id_solserv;
	}
	public void setId_solserv(Integer id_solserv) {
		this.id_solserv = id_solserv;
	} 
	
	
	
}
