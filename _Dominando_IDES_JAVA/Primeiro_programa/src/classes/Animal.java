package classes;

import java.util.Objects;

public class Animal {
	// Atributos
	private String nome;
	private String corPelo;
	private int numPatas;
	private String tipo;

	// Construtor
	public Animal(String nome, String corPelo, int numPatas, String tipo) {
		this.nome = nome;
		this.corPelo = corPelo;
		this.numPatas = numPatas;
		this.tipo = tipo;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Equals
	@Override
	public int hashCode() {
		return Objects.hash(corPelo, nome, numPatas, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(corPelo, other.corPelo) && Objects.equals(nome, other.nome) && numPatas == other.numPatas
				&& Objects.equals(tipo, other.tipo);
	}

	// toString
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", corPelo=" + corPelo + ", numPatas=" + numPatas + ", tipo=" + tipo + "]";
	}

	// Custom Methods

}
