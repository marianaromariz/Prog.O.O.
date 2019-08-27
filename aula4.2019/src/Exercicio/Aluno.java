package Exercicio;

public class Aluno 
{
  private String matricula;
  private String nome;
  private String curso;
  private String faculdade;
  
//construtor
   public Aluno()
   {
  this.faculdade = "Unilasalle RJ"; 
   }
  
   public String getFaculdade() 
    {
	return faculdade;
    }
   public void setFaculdade(String faculdade) 
    {
	this.faculdade = faculdade;
    }
   public String getMatricula() 
    {
	return matricula;
    }
   public void setMatricula(String matricula) 
    {
	this.matricula = matricula;
    }
   public String getNome() 
   {
	return nome;
   }
   public void setNome(String nome) 
   {
	this.nome = nome;
   }
   public String getCurso() 
   {
	return curso;
   }
   public void setCurso(String curso) 
   {
	   if(curso.equalsIgnoreCase("si"))
	   {
		   this.curso = "Sistemas de Informação";
	   }
	   else
	   {
		   this.curso = curso; 
	   }
	
   }

public void listar()
{
    System.out.println("Matricula = " + this.matricula);
    System.out.println("Nome = " + this.nome);
    System.out.println("Curso = " + this.curso);
    System.out.println("Faculdade = " + this.faculdade);
}

}