package com.jsf.controladores;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Calculadora
{
	private double numero1;
	private double numero2;
	private double resultado;
	
	public void sumar()
	{
		resultado = (numero1 + numero2);
	}
	
	public void restar()
	{
		resultado = (numero1 - numero2);
	}	
	
	public void multiplicar()
	{
		resultado = (numero1 * numero2);
	}		
	
	public void dividir()
	{
		resultado = (numero1 / numero2);
	}		

	public double getNumero1()
	{
		System.out.println("getNumero1: " + numero1);
		return numero1;
	}

	public void setNumero1(double numero1)
	{
		System.out.println("setNumero1: " + numero1);
		this.numero1 = numero1;
	}

	public double getNumero2()
	{
		System.out.println("getNumero2: " + numero2);
		return numero2;
	}

	public void setNumero2(double numero2)
	{
		System.out.println("setNumero2: " + numero2);
		this.numero2 = numero2;
	}	
	
	public double getResultado()
	{
		System.out.println("getResultado: " + resultado);
		return resultado;
	}	
	
}
