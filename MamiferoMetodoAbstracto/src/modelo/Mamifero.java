package modelo;

public abstract class Mamifero 
{
	protected String raza;
	protected int numeroPatas;
	
	public Mamifero()
	{
		this.raza = "";
		this.numeroPatas = 0;
	}
	
	public abstract void alimentar();
	public abstract void hacerSonido();
}