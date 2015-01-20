package com.jsf.navegacion.controladores;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.jsf.navegacion.entidades.Estudiante;

@SessionScoped
@ManagedBean
public class DatosPersonales
{
	private Estudiante estudiante;
	
	public DatosPersonales()
	{
		estudiante=new Estudiante();
	}

	public Estudiante getEstudiante()
	{
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante)
	{
		this.estudiante = estudiante;
	}
	
	public void irDatosPersonales() throws IOException
	{
		FacesContext.getCurrentInstance().getExternalContext().redirect("datos_personales.jsf");
	}
	public void irDatosAcademicos() throws IOException
	{
		FacesContext.getCurrentInstance().getExternalContext().redirect("datos_academicos.jsf");
	}	
	public void irHobbies() throws IOException
	{	
		FacesContext.getCurrentInstance().getExternalContext().redirect("hobbies_estudiante.jsf");
	}
	public void irInformativo() throws IOException
	{
		FacesContext.getCurrentInstance().getExternalContext().redirect("informativo.jsf");
	}	
	
}
