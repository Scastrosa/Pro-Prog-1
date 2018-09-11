package modelo;

public class Superman extends Kryptonian implements Flyer
{	
	private String salvar;
	
	public Superman()
	{
		super.colorOjos = "verde";
		this.salvar = salvar();
	}
	
	public String salvar() 
	{
		return "ayudar a los mortales";
	}
	
	public String takeOff() 
	{
		return "mis super poderes";
	}

	public String lend() 
	{
		return "mis super poderes";
	}

	public String fly() 
	{
		return "mi super capa";
	}
	
	public String leapBuilding()
	{
		return "mi super salto";
	}
	
	public String stopBullet()
	{
		return "detener el tiempo";
	}
	
	public String eat() 
	{
		return "combatir el crimen";
	}
}