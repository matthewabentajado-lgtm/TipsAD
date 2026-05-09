package com.trips.models;

public class Rol {
	
	private int id;
	private String nomRol;
	private String descripcion;
	private String estado;
	private String fechacreacion;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomRol() {
		return nomRol;
	}
	public static void setNomRol(String nomRol) {
		this.nomRol = nomRol;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public static void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public static void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFechacreacion() {
		return fechacreacion;
	}
	public static void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	
	
	

}
