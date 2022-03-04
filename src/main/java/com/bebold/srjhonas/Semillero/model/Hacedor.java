package com.bebold.srjhonas.Semillero.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "hacedores")
public class Hacedor{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_hacedor;
	private String nombre_hacedor;
	private String email_hacedor;
	private String telefono_hacedor;
	private String password_hacedor;
	private String tipo_usuario;
		
	public Hacedor() {
		super();
	}
	public Hacedor(Integer id_hacedor, String nombre_hacedor, String email_hacedor, String telefono_hacedor,
			String password_hacedor, String tipo_usuario) {
		super();
		this.id_hacedor = id_hacedor;
		this.nombre_hacedor = nombre_hacedor;
		this.email_hacedor = email_hacedor;
		this.telefono_hacedor = telefono_hacedor;
		this.password_hacedor = password_hacedor;
		this.tipo_usuario = tipo_usuario;
	}
	public Integer getId_hacedor() {
		return id_hacedor;
	}
	public void setId_hacedor(Integer id_hacedor) {
		this.id_hacedor = id_hacedor;
	}
	public String getNombre_hacedor() {
		return nombre_hacedor;
	}
	public void setNombre_hacedor(String nombre_hacedor) {
		this.nombre_hacedor = nombre_hacedor;
	}
	public String getEmail_hacedor() {
		return email_hacedor;
	}
	public void setEmail_hacedor(String email_hacedor) {
		this.email_hacedor = email_hacedor;
	}
	public String getTelefono_hacedor() {
		return telefono_hacedor;
	}
	public void setTelefono_hacedor(String telefono_hacedor) {
		this.telefono_hacedor = telefono_hacedor;
	}
	public String getPassword_hacedor() {
		return password_hacedor;
	}
	public void setPassword_hacedor(String password_hacedor) {
		this.password_hacedor = password_hacedor;
	}
	public String getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	
	
}
