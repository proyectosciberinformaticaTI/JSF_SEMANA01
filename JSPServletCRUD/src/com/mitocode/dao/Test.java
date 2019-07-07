package com.mitocode.dao;

import com.mitocode.model.Persona;

public class Test {

	public static void main(String[] args) {
		PersonaDAO dao = new PersonaDAOImpl();
		Persona per = new Persona();
		per.setNombres("Jaime");
		per.setApellidos("Medina");		
		dao.agregar(per);
		
	}
}
