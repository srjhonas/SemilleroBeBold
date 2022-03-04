package com.bebold.srjhonas.Semillero.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "servicios_x_hacedor")
public class ServicioXHacedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_servicioxhacedor;
	private Integer id_hacedor;
	private Integer id_tipo_servicio; 
	private Integer precio_esperado;
	
	
	
	public ServicioXHacedor() {
		super();
	}
	public ServicioXHacedor(Integer id_servicioxhacedor, Integer id_hacedor, Integer id_tipo_servicio,
			Integer precio_esperado) {
		super();
		this.id_servicioxhacedor = id_servicioxhacedor;
		this.id_hacedor = id_hacedor;
		this.id_tipo_servicio = id_tipo_servicio;
		this.precio_esperado = precio_esperado;
	}
	public Integer getId_servicioxhacedor() {
		return id_servicioxhacedor;
	}
	public void setId_servicioxhacedor(Integer id_servicioxhacedor) {
		this.id_servicioxhacedor = id_servicioxhacedor;
	}
	public Integer getId_hacedor() {
		return id_hacedor;
	}
	public void setId_hacedor(Integer id_hacedor) {
		this.id_hacedor = id_hacedor;
	}
	public Integer getId_tipo_servicio() {
		return id_tipo_servicio;
	}
	public void setId_tipo_servicio(Integer id_tipo_servicio) {
		this.id_tipo_servicio = id_tipo_servicio;
	}
	public Integer getPrecio_esperado() {
		return precio_esperado;
	}
	public void setPrecio_esperado(Integer precio_esperado) {
		this.precio_esperado = precio_esperado;
	} 
	
	
}
