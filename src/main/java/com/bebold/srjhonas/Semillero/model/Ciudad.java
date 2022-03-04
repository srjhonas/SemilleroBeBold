package com.bebold.srjhonas.Semillero.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "ciudades")
public class Ciudad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_ciudad;
	private String nombre_ciudad; 
	private String dpto_ciudad;
	
	
	public Ciudad() {
		super();
	}
	public Ciudad(Integer id_ciudad, String nombre_ciudad, String dpto_ciudad) {
		super();
		this.id_ciudad = id_ciudad;
		this.nombre_ciudad = nombre_ciudad;
		this.dpto_ciudad = dpto_ciudad;
	}
	public Integer getId_ciudad() {
		return id_ciudad;
	}
	public void setId_ciudad(Integer id_ciudad) {
		this.id_ciudad = id_ciudad;
	}
	public String getNombre_ciudad() {
		return nombre_ciudad;
	}
	public void setNombre_ciudad(String nombre_ciudad) {
		this.nombre_ciudad = nombre_ciudad;
	}
	public String getDpto_ciudad() {
		return dpto_ciudad;
	}
	public void setDpto_ciudad(String dpto_ciudad) {
		this.dpto_ciudad = dpto_ciudad;
	}
	
	

}
