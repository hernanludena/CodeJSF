package com.jsf.navegacion.servicios;

import java.util.ArrayList;
import java.util.List;

import com.jsf.navegacion.entidades.Hobbie;


public class ServicioHobbie {

	private static List<Hobbie> hobbies;

	private static void cargarHobbies() {
		if (hobbies == null) {
			hobbies = new ArrayList<Hobbie>();
			hobbies.add(new Hobbie(1, "Programar", "Programming"));
			hobbies.add(new Hobbie(2, "Pasar con su novi@", "Muching"));
			hobbies.add(new Hobbie(3, "Pasar en el msn", "Chatting"));
			hobbies.add(new Hobbie(4, "Locas, panas", "Bieling"));
		}
	}

	public static Hobbie buscarHobbiePorId(int id) {
		cargarHobbies();
		for (Hobbie h : hobbies) {
			if (h.getId() == id) {
				return h;
			}
		}
		return null;
	}

	public static List<Hobbie> recuperarTodos() {
		cargarHobbies();
		return hobbies;
	}
}
