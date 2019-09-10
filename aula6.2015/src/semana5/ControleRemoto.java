package semana5;

public class ControleRemoto implements Controlador
{
   private int volume;
   private boolean ligado;
   private boolean tocando;
   
   
   //construtor
   public ControleRemoto()
   {
	   this.volume = 50;
	   this.ligado = true;
	   this.tocando = false;
	   
   }
     
   //methods getters/setters
private int getVolume() 
{
	return volume;
}
private void setVolume(int volume) 
{
	this.volume = volume;
}
private boolean isLigado() 
{
	return ligado;
}
private void setLigado(boolean ligado) 
{
	this.ligado = ligado;
}
private boolean isTocando() 
{
	return tocando;
}
private void setTocando(boolean tocando) 
{
	this.tocando = tocando;
}


@Override
public void ligar() {
	setLigado(true);
	
}
@Override
public void desligar() {
	setLigado(false);
	
}
@Override
public void maisVolume() 
{
   if(this.volume<100)
   this.volume = this.volume + 1;
	
   System.out.println("Volume = " + this.volume);
}
@Override
public void menosVolume() 
{
	if (getVolume()>0)
	setVolume(getVolume()-1);
			
    System.out.println("Volume = " + this.volume);
	
}
@Override
public void play() {
	if (isLigado())
	System.out.println("Tocando...");
	else
	System.out.println("Erro! Não posso tocar");
}
@Override
public void pause() 
{
	System.out.println("Pausado!");
	
}
   
   
}
