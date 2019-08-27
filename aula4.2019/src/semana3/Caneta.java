package semana3;

public class Caneta 
{
    public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void setModelo(String m)
	{
	  this.modelo = m;	
	}
	
	public String getModelo()
	{
		return this.modelo;
	}
	
	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public void escrever()
	{
		if (tampada)
		{
			System.out.println("Erro! Não consigo escrever!");
		}
		else
		{
			System.out.println("Escrevendo...");
		}
	}	
		public void tampar()
		 {
			this.tampada = true;
		 }
		
		  public void destampar()
		   {
			this.tampada = false;
		   }
	
}
