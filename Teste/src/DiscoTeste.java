
public class DiscoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Disco d1;
		d1 = new Disco();
		
		d1.tipo = "DVD";
		d1.estado = "Virgem";
		
		d1.status();
		d1.rodar();
		d1.limpar();
		d1.sujar();
		d1.rodar();
	}

}
