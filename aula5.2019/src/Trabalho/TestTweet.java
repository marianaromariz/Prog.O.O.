//Nome: Daniel Guimarães Faria
//Matrícula: 0050010533
package Trabalho;

import java.util.Scanner;

public class TestTweet {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		System.out.println("Login:");
		String usu= ler.nextLine();
		System.out.println("Senha:");
		String pass = ler.nextLine();
		
		Usuario user = new Usuario(usu, pass);
		
		int confere = 1;

		while (confere == 1) 
		{
			System.out.println("Entre com seu tweet:");
			String tweet = ler.nextLine();
			user.tweetar(tweet);

			System.out.println("Quer continuar tweetando?");
			
			if (!ler.nextLine().equalsIgnoreCase("sim")) 
			{
				confere = 0;
			}

		}

		user.listagemTweets();
		
		ler.close();

	}

}
