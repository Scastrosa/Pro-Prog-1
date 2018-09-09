package modelo;

public abstract class Operar 
{
	protected int suma;

	public Operar(int pSuma)
	{
		this.suma = pSuma;
	}

	public int getSuma() 
	{
		return suma;
	}

	public void setSuma(int suma) 
	{
		this.suma = suma;
	}
	
	public abstract String suma();
}