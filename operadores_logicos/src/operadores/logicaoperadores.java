package operadores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import operadores.classes.Aluno;
import operadores.classes.Disciplina;
import operadores.constantes.StatusAluno;

public class logicaoperadores {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*é uma lista que dentro dela temos uma chave que identifica uma sequecia de valores também */
		HashMap<String, List<Aluno>> maps = new HashMap<String , List<Aluno>>();
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		

		for (int qtd = 1; qtd <= 5; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade do aluno?"); String
			 * dataNascimento =
			 * JOptionPane.showInputDialog("Qual a data de Nascimento do aluno"); String rg
			 * = JOptionPane.showInputDialog("Qual o RG do aluno?"); String cpf =
			 * JOptionPane.showInputDialog("Qual o CPF do aluno?"); String mae =
			 * JOptionPane.showInputDialog("Qual o nome da mãe?"); String pai =
			 * JOptionPane.showInputDialog("Qual o nome do pai?"); String matricula =
			 * JOptionPane.showInputDialog("Qual a data da Matricula?"); String escola =
			 * JOptionPane.showInputDialog("Qual nome da escola?"); String serie =
			 * JOptionPane.showInputDialog("Qual a serie?");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setDataMatricula(matricula); aluno1.setNomeEscola(escola);
			 * aluno1.setSerieMatriculado(serie);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover Alguma Disciplina?");
			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover");
				}
			}

			System.out.println("Nome é = " + aluno1.getNome());
			System.out.println("Idade é = " + aluno1.getIdade());
			System.out.println("Data Nascimento é = " + aluno1.getDataNascimento());
			System.out.println("RG é = " + aluno1.getRegistroGeral());
			System.out.println("CPF é = " + aluno1.getNumeroCpf());
			System.out.println("Nome Mãe é = " + aluno1.getNomeMae());
			System.out.println("Nome Pai é = " + aluno1.getNomePai());
			System.out.println("Data Matricula é = " + aluno1.getDataMatricula());
			System.out.println("Nome Escola é = " + aluno1.getNomeEscola());
			System.out.println("Serie é = " + aluno1.getSerieMatriculado());
			System.out.println("Média da nota é: " + aluno1.getMediaNota());
			System.out.println("Resultado= " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
			System.out.println("Resultado= " + aluno1.getAlunoAprovado2());

			alunos.add(aluno1);
		}
		
		for( Aluno aluno : alunos ) { /*Separado em Listas*/
			
			if( aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			}else
				if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					alunosRecuperacao.add(aluno);
				}else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
					alunosReprovados.add(aluno);
				}
		}
		 
		System.out.println("---------------------Lista dos Aprovados--------------------------");
		for(Aluno aluno: alunosAprovados){
			System.out.println("Nome Aluno= " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());
			
		}
		
		System.out.println("-----------------Lista dos Recuperação-----------------------------");
		for(Aluno aluno: alunosRecuperacao) {
			System.out.println("Nome Aluno= " + aluno.getNome());
			System.out.println("Resultado= " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());

		}
		
		System.out.println("------------------Lista de Reprovados--------------------------------");
		for(Aluno aluno: alunosReprovados) {
			System.out.println("Nome Aluno= " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "com média de = " + aluno.getMediaNota());

		}
	}

	}

