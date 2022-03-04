package com.bebold.srjhonas.Semillero.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "tipos_servicios")
public class TipoServicio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_tipo_servicio;
	private String nombre_tipo_servicio;
	
	
	
	public TipoServicio() {
		super();
	}
	public TipoServicio(Integer id_tipo_servicio, String nombre_tipo_servicio) {
		super();
		this.id_tipo_servicio = id_tipo_servicio;
		this.nombre_tipo_servicio = nombre_tipo_servicio;
	}
	public Integer getId_tipo_servicio() {
		return id_tipo_servicio;
	}
	public void setId_tipo_servicio(Integer id_tipo_servicio) {
		this.id_tipo_servicio = id_tipo_servicio;
	}
	public String getNombre_tipo_servicio() {
		return nombre_tipo_servicio;
	}
	public void setNombre_tipo_servicio(String nombre_tipo_servicio) {
		this.nombre_tipo_servicio = nombre_tipo_servicio;
	}
	
	
}
