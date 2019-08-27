package Exercicio;

import java.util.Scanner;

public class AlunoTeste {

	public static void main(String[] args)
	{
	  Aluno al = new Aluno();
	  String matricula,nome,curso;
	  
	  Scanner leitura = new Scanner(System.in);
			  
	  System.out.println("Qual é a sua matricula?");
	  matricula = leitura.next();
	  
	  System.out.println("Qual é o seu nome?");
	  nome = leitura.next();
	  
	  System.out.println("Qual o seu curso?");
	  curso = leitura.next();
	  
	  al.setMatricula(matricula);
	  al.setNome(nome);
	  al.setCurso(curso);
	 
	  al.listar();
	}

}
