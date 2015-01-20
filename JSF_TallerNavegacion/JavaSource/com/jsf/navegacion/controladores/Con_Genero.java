package com.jsf.navegacion.controladores;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jsf.navegacion.entidades.Genero;
import com.jsf.navegacion.servicios.ServicioGenero;

@SessionScoped
@ManagedBean
public class Con_Genero 
{
	private List<Genero> generos;
	private int generoSeleccionado;

	
	public Con_Genero()
	{
		generos=ServicioGenero.recuperarTodos();
	}


	public List<Genero> getGeneros() {
		return generos;
	}


	public void setGeneros(List<Genero> generos) {
		this.generos = generos;
	}


	public int getGeneroSeleccionado() {
		return generoSeleccionado;
	}


	public void setGeneroSeleccionado(int generoSeleccionado) {
		this.generoSeleccionado = generoSeleccionado;
	}

	
}
