package com.jsf.entidades;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.cursojsf.validadores.Cedula;

public class Cliente
{
	@Size (min=5, max=15, message="El campo requiere entre 5 a 15 caracteres")
	@NotNull (message="El nombre es un campo requerido")
	private String nombre;
	
	@NotNull (message="El apellido es un campo requerido")
	private String apellido;
	
	@Cedula (message="La cédula es incorrecta")
	@NotNull (message="La cédula es un campo requerido")
	private String cedula;
	
	@Max (value=100, message="Edad máxima es de 100")
	private int edad;
	
	
	
	public Cliente()
	{
		System.out.println("Ingreso al contructor de cliente");
		System.out.println("NOMBRE  : " + nombre);
		System.out.println("APELLIDO: " + apellido);
		System.out.println("CEDULA  : " + cedula);
	}
	
	public String getNombre()
	{
		System.out.println("getNombre: " + nombre);
		return nombre;
	}
	public void setNombre(String nombre)
	{
		System.out.println("setNombre: " + nombre);
		this.nombre = nombre;
	}
	public String getApellido()
	{
		System.out.println("getApellido: " + apellido);
		return apellido;
	}
	public void setApellido(String apellido)
	{
		System.out.println("setApellido: " + apellido);
		this.apellido = apellido;
	}
	public String getCedula()
	{
		System.out.println("getCedula: " + cedula);
		return cedula;
	}
	public void setCedula(String cedula)
	{
		System.out.println("setCedula: " + cedula);
		this.cedula = cedula;
	}		
	
	public int getEdad()
	{
		System.out.println("getEdad: " + edad);
		return edad;
	}

	public void setEdad(int edad)
	{
		System.out.println("setEdad: " + edad);
		this.edad = edad;
	}

	@Override
	public String toString()
	{
		if ((nombre != null) && (nombre != ""))
		{		
		return "NOMBRES: " + nombre + " APELLIDOS: " + apellido + " CÉDULA: " + cedula;
		}
		else
		{
			return "";
		}
	}
	
}
