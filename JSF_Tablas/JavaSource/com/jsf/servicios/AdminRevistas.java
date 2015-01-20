package com.jsf.servicios;

import java.util.ArrayList;
import java.util.List;

import com.jsf.entidades.Revista;

public class AdminRevistas {
	
	
	public static List<Revista> recuperarRevistas(){
		List<Revista> revistas=new ArrayList<Revista>();
		revistas.add(new Revista(1,"SOHO","Septiembre"));
		revistas.add(new Revista(2,"VANIDADES","Octubre"));
		revistas.add(new Revista(3,"CONDORITO","Septiembre"));
		revistas.add(new Revista(4,"VISTAZO","Enero"));
		return revistas;
	}
	
	
}
