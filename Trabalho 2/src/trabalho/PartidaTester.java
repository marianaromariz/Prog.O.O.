package trabalho;

public class PartidaTester {

	public static void main(String[] args) 
	{
      Partida p1 = new Partida();
     
     Time t1 = new Time();
      t1.setNome("Flamengo");
      
      Time t2 = new Time();
      t2.setNome("Fluminese");
      
      
      p1.iniciarPartida(t1, t2);
      p1.mostraResultado();
      p1.finalizarPartida();
      t1.listar();
      t2.listar();
      /*System.out.println("time v: " + t1.getNome());
      System.out.println("time l: " + t2.getNome());*/
   
      
       
       
	}

}
