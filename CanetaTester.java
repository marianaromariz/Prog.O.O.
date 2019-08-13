
public class CanetaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Caneta c1;
    c1 = new Caneta();
    
	c1.cor = "Azul";
	c1.tampada = false;
	c1.modelo = "bic";
	c1.ponta = 0.7f;
	c1.carga = 100;		
	
	c1.status();
	c1.rabiscar();
	c1.tampar();
	c1.rabiscar();
	
	Caneta c2 = new Caneta();
	c2.cor = "Preto";
	c2.tampada = false;
	c2.modelo = "Compactor";
	
	c2.status();
	c2.rabiscar();
	}
	
}
