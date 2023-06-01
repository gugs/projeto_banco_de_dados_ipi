package org.exemplo.database.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.exemplo.database.bd.ConexaoBancoMySQL;
import org.exemplo.database.modelo.Paciente;

public class PacienteDAO {

	private ConexaoBancoMySQL conn;
	
	public PacienteDAO(ConexaoBancoMySQL conn) {
		this.conn = conn;
	}
	public void save(Paciente p) {
		String sql = "INSERT INTO PACIENTE VALUES (?,?,?,?);";
		try {
			PreparedStatement pstm = conn.getConnection().prepareStatement(sql);
			pstm.setInt(1, p.getId());
			pstm.setString(2, p.getNome());
			pstm.setFloat(3, p.getAltura());
			pstm.setFloat(4, p.getPeso());
			pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(Paciente p) {

	}

	public void delete(Paciente p) {
		String sql = "DELETE FROM PACIENTE WHERE ID = ?;";
		try {
			PreparedStatement pstm = conn.getConnection().prepareStatement(sql);
			pstm.setInt(1, p.getId());
			pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Paciente findById(Integer id) {
		String sql = "SELECT * FROM PACIENTE WHERE ID = ?";
		ResultSet rs;
		Paciente p = null;
		try {
			PreparedStatement pstm = conn.getConnection().prepareStatement(sql);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();
			while(rs.next()) {
				p = new Paciente(rs.getInt("id"), rs.getString("nome"), rs.getFloat("altura"), rs.getFloat("peso"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
	public List<Paciente> findAll(){
		return null;
	}
}
