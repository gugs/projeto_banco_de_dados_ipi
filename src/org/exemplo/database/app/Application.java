package org.exemplo.database.app;

import org.exemplo.database.bd.ConexaoBancoMySQL;
import org.exemplo.database.dao.PacienteDAO;
import org.exemplo.database.modelo.Paciente;

public class Application {

	public static void main(String[] args) {
		
		PacienteDAO dao = new PacienteDAO(new ConexaoBancoMySQL());
		
		Paciente p1 = dao.findById(3);
		
		System.out.println(p1);
	}
}
