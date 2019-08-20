package Comparação;

import java.util.Scanner;

public class Comparar 
{

	public static void main(String[] args)
	{
		String nome1,nome2;
		
		Scanner entrada = new Scanner(System.in);

       System.out.println("Entre com o primeiro nome");
       nome1 = entrada.next();
       System.out.println("Entre com o segundo nome");
       nome2 = entrada.next();
		
        if(nome1.equals(nome2)) 
        {
            System.out.println("Nomes iguais!");
        }
        else 
        {
            System.out.println("Nomes diferentes!");
        }
    }
}