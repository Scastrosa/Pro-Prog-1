package modelo;

public class Felino extends Mamifero
{
	public Felino(int pNumeroPatas, String pRaza)
	{
		super.numeroPatas = pNumeroPatas;
		super.raza = pRaza;
	}
	
	public void alimentar() 
	{
	System.out.println("Como carne, yummy, yummy");	
	}

	public void hacerSonido() 
	{
		System.out.println("Miau miau");
	}
}