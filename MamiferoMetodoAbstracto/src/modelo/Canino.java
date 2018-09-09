package modelo;

public class Canino extends Mamifero
{
	public Canino(int pNumeroPatas, String pRaza)
	{
		super.numeroPatas = pNumeroPatas;
		super.raza = pRaza;
	}
	
	public void alimentar() 
	{
		System.out.println("Como concentrado, shhhh");
	}

	public void hacerSonido() 
	{
		System.out.println("Guau guau");
	}	
}