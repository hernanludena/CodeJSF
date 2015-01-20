package com.jsf.navegacion.controladores;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import com.jsf.navegacion.entidades.Hobbie;
import com.jsf.navegacion.servicios.ServicioHobbie;

@SessionScoped
@ManagedBean
public class Con_Hobbie 
{
	private List<Hobbie> hobbies;
	private List<String> hobbieSeleccionado;	
	
	public Con_Hobbie()
	{
		
		hobbies=ServicioHobbie.recuperarTodos();
	}

	public List<Hobbie> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<Hobbie> hobbies) {
		this.hobbies = hobbies;
	}

	public List<String> getHobbieSeleccionado() {
		return hobbieSeleccionado;
	}

	public void setHobbieSeleccionado(List<String> hobbieSeleccionado) {
		this.hobbieSeleccionado = hobbieSeleccionado;
	}

		
}
