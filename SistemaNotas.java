import java.util.Scanner;
import java.util.function.Consumer;

import aluno.Aluno;
import materia.Matematica;
import materia.Materia;
import professor.Professor;

public class SistemaNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String op = "";
		
		Professor prof = new Professor();
		Materia mat = new Matematica(prof, "Diurno");
		
		do {
			
			op = entrada.nextLine();
		
			if (op.equalsIgnoreCase("criar aluno")) {
				String nome = entrada.nextLine();
				int idade = entrada.nextInt();
				Aluno aluno = new Aluno();
				
				aluno.setNome(nome);
				aluno.setIdade(idade);
				mat.setAluno(aluno);
				
			} else if (op.equalsIgnoreCase("listar aluno")) {
				Consumer<Aluno> cons = a -> System.out.println(a.getNome());
				mat.getAluno().forEach(cons);
			}
			
			
		} while(!op.equalsIgnoreCase("sair"));
		
		entrada.close();
	}

}
