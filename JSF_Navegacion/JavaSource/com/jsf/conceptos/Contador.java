package com.jsf.conceptos;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;

//@RequestScoped
//@ViewScoped
@SessionScoped
@ManagedBean
public class Contador
{
	private int valor;

	public Contador()
	{
		System.out.println("Ingreso a class Contador");
	}
	
	public void incrementar()
	{
		System.out.println("Ingreso a incrementar()");
		valor++;
		System.out.println("Valor = " + valor);
	}
	
	public String Anterior()
	{
		return "pagina_request";
	}
	
	public void navegar() throws IOException
	{
		FacesContext.getCurrentInstance().getExternalContext().redirect("pagina_request.jsf");
	}
	
	public void navegar1() throws IOException
	{
		FacesContext.getCurrentInstance().getExternalContext().redirect("pagina_view.jsf");
	}

	public int getValor()
	{
		System.out.println("getValor() " + valor);
		return valor;
	}

	public void setValor(int valor)
	{
		System.out.println("setValor() " + valor);
		this.valor = valor;
	}	
	
}
