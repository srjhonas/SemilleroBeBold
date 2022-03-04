package com.bebold.srjhonas.Semillero.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "admins")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_admin;
	private String nombre_admin;
	private String email_admin;
	private String telefono_admin;
	private String password_admin;
	private String tipo_usuario;
	
	
	public Admin() {
		super();
	}
	public Admin(Integer id_admin, String nombre_admin, String email_admin, String telefono_admin,
			String password_admin, String tipo_usuario) {
		super();
		this.id_admin = id_admin;
		this.nombre_admin = nombre_admin;
		this.email_admin = email_admin;
		this.telefono_admin = telefono_admin;
		this.password_admin = password_admin;
		this.tipo_usuario = tipo_usuario;
	}
	public Integer getId_admin() {
		return id_admin;
	}
	public void setId_admin(Integer id_admin) {
		this.id_admin = id_admin;
	}
	public String getNombre_admin() {
		return nombre_admin;
	}
	public void setNombre_admin(String nombre_admin) {
		this.nombre_admin = nombre_admin;
	}
	public String getEmail_admin() {
		return email_admin;
	}
	public void setEmail_admin(String email_admin) {
		this.email_admin = email_admin;
	}
	public String getTelefono_admin() {
		return telefono_admin;
	}
	public void setTelefono_admin(String telefono_admin) {
		this.telefono_admin = telefono_admin;
	}
	public String getPassword_admin() {
		return password_admin;
	}
	public void setPassword_admin(String password_admin) {
		this.password_admin = password_admin;
	}
	public String getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	
	
}
