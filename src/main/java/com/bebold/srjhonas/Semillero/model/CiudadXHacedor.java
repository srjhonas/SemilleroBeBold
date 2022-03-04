package com.bebold.srjhonas.Semillero.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ciudades_x_hacedor")

public class CiudadXHacedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_ciudadxhacedor;
	private Integer id_ciudad; 
	private Integer id_hacedor;
	
	
	
	public CiudadXHacedor() {
		super();
	}
	public CiudadXHacedor(Integer id_ciudadxhacedor, Integer id_ciudad, Integer id_hacedor) {
		super();
		this.id_ciudadxhacedor = id_ciudadxhacedor;
		this.id_ciudad = id_ciudad;
		this.id_hacedor = id_hacedor;
	}
	public Integer getId_ciudadxhacedor() {
		return id_ciudadxhacedor;
	}
	public void setId_ciudadxhacedor(Integer id_ciudadxhacedor) {
		this.id_ciudadxhacedor = id_ciudadxhacedor;
	}
	public Integer getId_ciudad() {
		return id_ciudad;
	}
	public void setId_ciudad(Integer id_ciudad) {
		this.id_ciudad = id_ciudad;
	}
	public Integer getId_hacedor() {
		return id_hacedor;
	}
	public void setId_hacedor(Integer id_hacedor) {
		this.id_hacedor = id_hacedor;
	} 
	
	

}
