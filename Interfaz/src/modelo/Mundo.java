package modelo;

public class Mundo 
{
	private Cuadrado c;
	private Circulo c1;

	public Mundo() 
	{
		c = new Cuadrado(0);
		c1 = new Circulo(0);
	}

	public Cuadrado getC() 
	{
		return c;
	}

	public void setC(Cuadrado c) 
	{
		this.c = c;
	}

	public Circulo getC1() 
	{
		return c1;
	}

	public void setC1(Circulo c1) 
	{
		this.c1 = c1;
	}
}