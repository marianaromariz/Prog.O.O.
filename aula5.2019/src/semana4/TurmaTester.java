package semana4;

public class TurmaTester {

	public static void main(String[] args)
	{
	   Aluno a1 = new Aluno();
			   
       a1.setMatricula ("001");
       a1.setNome ("Daniel");
	   
       Turma turmaDePOO = new Turma();
       
       turmaDePOO.addAluno(a1);
       
       a1 = new Aluno();
       
       a1.setMatricula ("002");
       a1.setNome ("Mariana");
       
       turmaDePOO.addAluno(a1);
       turmaDePOO.imprimirAlunos();
       
	}

}
