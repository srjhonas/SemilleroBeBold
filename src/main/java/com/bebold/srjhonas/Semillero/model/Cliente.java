package com.bebold.srjhonas.Semillero.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "clientes")
public class Cliente{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cliente;
	private String nombre_cliente;
	@Column(name="email_cliente")
	private String emailCliente;
	private String telefono_cliente;
	private String password_cliente;
	private String tipo_usuario;
	
	
	
	public Cliente() {
		super();
	}
	public Cliente(Integer id_cliente, String nombre_cliente, String emailCliente, String telefono_cliente,
			String password_cliente, String tipo_usuario) {
		super();
		this.id_cliente = id_cliente;
		this.nombre_cliente = nombre_cliente;
		this.emailCliente = emailCliente;
		this.telefono_cliente = telefono_cliente;
		this.password_cliente = password_cliente;
		this.tipo_usuario = tipo_usuario;
	}
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getTelefono_cliente() {
		return telefono_cliente;
	}
	public void setTelefono_cliente(String telefono_cliente) {
		this.telefono_cliente = telefono_cliente;
	}
	public String getPassword_cliente() {
		return password_cliente;
	}
	public void setPassword_cliente(String password_cliente) {
		this.password_cliente = password_cliente;
	}
	public String getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	
		
}
