package com.jsf.controladores;

import javax.faces.bean.ManagedBean;

import com.jsf.entidades.Cliente;

@ManagedBean
public class ControladorCliente
{
	private Cliente cliente;

	public ControladorCliente()
	{
		cliente = new Cliente();
	}
	
	public void guardar()
	{
		System.out.println(cliente.toString());
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
	
}
