package Exercicio;

public class AlunoTester 
{

	public static void main(String[] args) 
	{
	    Aluno aluno = new Aluno();
	    
	    aluno.setMatricula("13066131750");
	    aluno.setNome("Daniel");
	    aluno.setCurso("Sistemas de Informação");
	    
       //System.out.println("Matricula = " + aluno.getMatricula());
       //System.out.println("Nome = " + aluno.getNome());
       //System.out.println("Curso = " + aluno.getCurso());
       
       aluno.listar();
	}

}
