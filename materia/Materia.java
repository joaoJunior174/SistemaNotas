package materia;

import professor.Professor;
import java.util.List;
import aluno.Aluno;

public abstract class Materia {
	abstract public void setProfessor(Professor prof);
	abstract public Professor getProfessor();
	abstract public void setPeriodo(String periodo);
	abstract public String getPeriodo();
	abstract public void setAluno(Aluno aluno);
	abstract public List<Aluno> getAluno();
}
