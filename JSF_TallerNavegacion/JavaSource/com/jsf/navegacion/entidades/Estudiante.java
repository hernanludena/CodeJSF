package com.jsf.navegacion.entidades;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.cursojsf.validadores.Cedula;

public class Estudiante {

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
	
	@NotNull (message="La email es un campo requerido")
	private String mail;
	
	@NotNull (message="La cédula es un campo requerido")
	private String direccion;
	
	private String ePrimaria;
	private String eSecundaria;
	private String universidad;
	
	@NotNull (message="El genero es un campo requerido")
	private Genero genero;

	public Estudiante() {
	genero=new Genero();
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getePrimaria() {
		return ePrimaria;
	}

	public void setePrimaria(String ePrimaria) {
		this.ePrimaria = ePrimaria;
	}

	public String geteSecundaria() {
		return eSecundaria;
	}

	public void seteSecundaria(String eSecundaria) {
		this.eSecundaria = eSecundaria;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

}
