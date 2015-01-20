package com.jsf.controladores;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.jsf.entidades.Hobbie;
import com.jsf.servicios.ServicioHobbie;


@ManagedBean
public class ControladorHobbie
{
	private List<Hobbie> hobbies; 
	
	private String idHobbieSeleccionados;

	public ControladorHobbie()
	{
		hobbies= ServicioHobbie.recuperarTodos();
	}
	
	public List<Hobbie> getHobbies()
	{
		return hobbies;
	}

	public void setHobbies(List<Hobbie> hobbies)
	{
		this.hobbies = hobbies;
	}

	public String getIdHobbieSeleccionados()
	{
		return idHobbieSeleccionados;
	}

	public void setIdHobbieSeleccionados(String idHobbieSeleccionados)
	{
		this.idHobbieSeleccionados = idHobbieSeleccionados;
	}	
	
	public void getValues()
	{
		
	}
	
}
