package materia;

import java.util.ArrayList;
import java.util.List;

import professor.Professor;
import aluno.Aluno;

public class Matematica extends Materia {

	private Professor prof;
	private String periodo;
	private List<Aluno> aluno;
	
	public Matematica(Professor prof, String periodo) {
		this.setProfessor(prof);
		this.setPeriodo(periodo);
		this.aluno = new ArrayList<Aluno>();
	}
	
	@Override
	public List<Aluno> getAluno() {
		return this.aluno;
	}
	
	@Override
	public void setAluno(Aluno aluno) {
		this.aluno.add(aluno);
	}
	
	@Override
	public String getPeriodo() {
		return this.periodo;
	}
	
	@Override
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	@Override
	public void setProfessor(Professor prof) {
		this.prof = prof;
	}

	@Override
	public Professor getProfessor() {
		return this.prof;
	}

}
