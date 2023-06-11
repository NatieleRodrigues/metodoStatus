package operadores;

import javax.swing.JOptionPane;

import operadores.classes.Aluno;

public class logicaoperadores {
	
	public static void main(String[] args) {
		
		/*Objeto ainda não existe na memoria*/
		/*Aluno aluno1;*/
	
		/*Agora temo um objeto real na memoria*/
		/*New Aluno é uma instancia (criação de objeto)*/
		/*aluno1 e uma referencia para o objeto*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("QUal a data de Nascimento do aluno");
		String rg = JOptionPane.showInputDialog("Qual o RG do aluno?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String mae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String matricula = JOptionPane.showInputDialog("Qual a data da Matricula?");
		String escola = JOptionPane.showInputDialog("Qual nome da escola?");
		String serie = JOptionPane.showInputDialog("Qual a serie?");
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		String nota1 = JOptionPane.showInputDialog("Qual a primeira nota?");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		String nota2 = JOptionPane.showInputDialog("Qual a segunda nota?");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		String nota3 = JOptionPane.showInputDialog("Qual a terceira nota?");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
		String nota4 = JOptionPane.showInputDialog("Qual a quarta nota?");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setNomeEscola(escola);
		aluno1.setSerieMatriculado(serie);
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		
		System.out.println("Nome é = " +aluno1.getNome());
		System.out.println("Idade é = " +aluno1.getIdade());
		System.out.println("Data Nascimento é = " +aluno1.getDataNascimento());
		System.out.println("RG é = " +aluno1.getRegistroGeral());
		System.out.println("CPF é = " +aluno1.getNumeroCpf());
		System.out.println("Nome Mãe é = " +aluno1.getNomeMae());
		System.out.println("Nome Pai é = " +aluno1.getNomePai());
		System.out.println("Data Matricula é = " +aluno1.getDataMatricula());
		System.out.println("Nome Escola é = " +aluno1.getNomeEscola());
		System.out.println("Serie é = " +aluno1.getSerieMatriculado());
		System.out.println("Média da nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado= " +(aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado= " +aluno1.getAlunoAprovado2());
		
		System.out.println(aluno1.toString());/*Descrição do objeto na memoria */
		System.out.println("Média do aluno: " +aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());
		
		
		
		
		
		
		
		/*Equals e Hascode (Diferenciar e comparar Objetos)*/
		
		/*Aluno aluno1 = new Aluno();
		aluno1.setNome("Natiele");
		aluno1.setNumeroCpf("115.764.786-37");
		+
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Natiele");
		aluno2.setNumeroCpf("142.582.536-03");
		
		if (aluno1.equals(aluno2)) {/*Criado o equals na class aluno para realizar a comparação*/
			/*System.out.println("Alunos são Iguais");
		}else {
			System.out.println("Alunos não são Iguais");
		}*/
		
		
	}

}
