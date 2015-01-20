package com.jsf.navegacion.servicios;

import java.util.ArrayList;
import java.util.List;

import com.jsf.navegacion.entidades.Genero;

public class ServicioGenero {

	private static List<Genero> generos;

	private static void cargarGeneros() {
		if (generos == null) {
			generos = new ArrayList<Genero>();
			generos.add(new Genero(1, "Masculino"));
			generos.add(new Genero(2, "Femenino"));
		}
	}

	public static Genero buscarGneroPorId(int id) {
		cargarGeneros();
		for (Genero s : generos) {
			if (s.getId() == id) {
				return s;
			}
		}
		return null;
	}

	public static List<Genero> recuperarTodos() {
		cargarGeneros();
		return generos;
	}
}
