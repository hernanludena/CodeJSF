package com.jsf.controladores;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.jsf.entidades.Revista;
import com.jsf.servicios.AdminRevistas;

@ManagedBean
public class RevistaControlador
{
	private List<Revista> revistas; 
	
	private Integer idRevistaSeleccionada;
	
	public RevistaControlador()
	{
		revistas = AdminRevistas.recuperarRevistas();
	}

	public List<Revista> getRevistas() {
		return revistas;
	}

	public void setRevistas(List<Revista> revistas) {
		this.revistas = revistas;
	}

	public Integer getIdRevistaSeleccionada() {
		return idRevistaSeleccionada;
	}

	public void setIdRevistaSeleccionada(Integer idRevistaSeleccionada) {
		this.idRevistaSeleccionada = idRevistaSeleccionada;
	}	
	
}
