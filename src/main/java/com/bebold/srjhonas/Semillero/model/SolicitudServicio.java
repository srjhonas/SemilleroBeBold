package com.bebold.srjhonas.Semillero.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "solicitudes_servicio")
public class SolicitudServicio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_sol_serv;
	private Integer estado_sol_serv; 
	private String direccion_sol_serv; 
	private Integer tipo_servicio; 
	private Integer cliente;
	private Integer hacedor ; 
	private Integer ciudad_servicio ;
	private Integer valor_ofrecido ; 
	private String observaciones ;
	
	
	
	public SolicitudServicio() {
		super();
	}
	public SolicitudServicio(Integer id_sol_serv, Integer estado_sol_serv, String direccion_sol_serv,
			Integer tipo_servicio, Integer cliente, Integer hacedor, Integer ciudad_servicio, Integer valor_ofrecido,
			String observaciones) {
		super();
		this.id_sol_serv = id_sol_serv;
		this.estado_sol_serv = estado_sol_serv;
		this.direccion_sol_serv = direccion_sol_serv;
		this.tipo_servicio = tipo_servicio;
		this.cliente = cliente;
		this.hacedor = hacedor;
		this.ciudad_servicio = ciudad_servicio;
		this.valor_ofrecido = valor_ofrecido;
		this.observaciones = observaciones;
	}
	public Integer getId_sol_serv() {
		return id_sol_serv;
	}
	public void setId_sol_serv(Integer id_sol_serv) {
		this.id_sol_serv = id_sol_serv;
	}
	public Integer getEstado_sol_serv() {
		return estado_sol_serv;
	}
	public void setEstado_sol_serv(Integer estado_sol_serv) {
		this.estado_sol_serv = estado_sol_serv;
	}
	public String getDireccion_sol_serv() {
		return direccion_sol_serv;
	}
	public void setDireccion_sol_serv(String direccion_sol_serv) {
		this.direccion_sol_serv = direccion_sol_serv;
	}
	public Integer getTipo_servicio() {
		return tipo_servicio;
	}
	public void setTipo_servicio(Integer tipo_servicio) {
		this.tipo_servicio = tipo_servicio;
	}
	public Integer getCliente() {
		return cliente;
	}
	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}
	public Integer getHacedor() {
		return hacedor;
	}
	public void setHacedor(Integer hacedor) {
		this.hacedor = hacedor;
	}
	public Integer getCiudad_servicio() {
		return ciudad_servicio;
	}
	public void setCiudad_servicio(Integer ciudad_servicio) {
		this.ciudad_servicio = ciudad_servicio;
	}
	public Integer getValor_ofrecido() {
		return valor_ofrecido;
	}
	public void setValor_ofrecido(Integer valor_ofrecido) {
		this.valor_ofrecido = valor_ofrecido;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
}
