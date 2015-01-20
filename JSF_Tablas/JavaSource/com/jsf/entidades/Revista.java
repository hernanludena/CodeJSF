package com.jsf.entidades;

public class Revista {
	private int id;
	private String titulo;
	private String mes;

	public Revista(int id, String titulo, String mes){
		this.id=id;
		this.titulo=titulo;
		this.mes=mes;
	}
	
	
	public String getMes() {
		return mes;
	}


	public void setMes(String mes) {
		this.mes = mes;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Revista(){
		
	}
}
