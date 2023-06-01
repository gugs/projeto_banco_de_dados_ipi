package org.exemplo.database.modelo;

import java.util.Objects;

public class Paciente {

	private Integer id;
	private String nome;
	private Float altura;
	private Float peso;
	
	
	public Paciente(Integer id, String nome, Float altura, Float peso) {
		super();
		this.id = id;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Float getAltura() {
		return altura;
	}


	public void setAltura(Float altura) {
		this.altura = altura;
	}


	public Float getPeso() {
		return peso;
	}


	public void setPeso(Float peso) {
		this.peso = peso;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nome=" + nome + ", altura=" + altura + ", peso=" + peso + "]";
	}
	
	
	public Float calcularIMC() {
		return peso/(altura*altura);
	}
	
	
}
