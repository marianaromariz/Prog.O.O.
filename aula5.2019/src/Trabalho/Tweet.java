package Trabalho;

public class Tweet 
{
	private String descricao;
	
	public Tweet(String mensagem) 
	{
		if (mensagem.length() >= 140) 
		{
			mensagem = mensagem.substring(0, 140);
		}
		else 
		{
			this.descricao = mensagem;
		}
	}

public String getTweet() 
{
	return this.descricao;
}
public void setTweet(String mensagem) 
{
	this.descricao = mensagem;
}
}
