
public class Disco {
	String tipo;
	String estado;
	boolean sujo;
	
	void rodar()
	{
		if (sujo)
		{
			System.out.println("Erro! O disco está sujo");
		}
		else
		{
			System.out.println("Executando a mídia!");
		}
	}
    void sujar()
    {
    	sujo = true;
    }
    void limpar()
    {
    	sujo = false;
    }
    
    void status()
    {
    	System.out.println("\nClasse do disco");
    	System.out.println("Tipo do disco:" + tipo);
    	System.out.println("Estado do disco:" + estado);
    }
    
}
