package com.clearminds.introduccion;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UsuarioControlador
{
	private String nombre;

	public UsuarioControlador()
	{
		System.out.println("Ingreso al constructor UsuarioControlador");
	}
	
	public String getNombre()
	{
		System.out.println("getNombre()");
		return nombre;
	}

	public void setNombre(String nombre)
	{
		System.out.println("setNombre()");
		this.nombre = nombre;
	}
	
	public void ejecutar()
	{
		System.out.println("Ejecutando el método");
	}
	
}
