package semana5;

public class ControleRemotoTester {

	public static void main(String[] args) 
	{
      ControleRemoto controle = new ControleRemoto();
      
      controle.ligar();
      controle.play();
      
      controle.desligar();
      controle.play();
      
      controle.ligar();
      controle.play();
      
      controle.maisVolume();
      
      controle.menosVolume();
      
      controle.pause();
      controle.play();
	}

}
