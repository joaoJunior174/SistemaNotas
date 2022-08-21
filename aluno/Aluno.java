package aluno;

import java.util.List;
import java.util.Map;

public class Aluno {
	private String nome;
	private int idade;
	private Map<String, Double> notaMateria;
	private List<String> materia;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Map<String, Double> getNotaMateria() {
		return notaMateria;
	}
	public void setNotaMateria(Map<String, Double> notaMateria) {
		this.notaMateria = notaMateria;
	}
	public List<String> getMateria() {
		return materia;
	}
	public void setMateria(List<String> materia) {
		this.materia = materia;
	}
	
	
}
