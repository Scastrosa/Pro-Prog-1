package modelo;

public class Mundo 
{
	private Circulo c1;
	private Cuadrado c;
	private Rombo r;
	
	public Mundo()
	{
		c1 = new Circulo(0);
		c = new Cuadrado(0);
		r = new Rombo(0, 0);
	}

	public Circulo getC1() 
	{
		return c1;
	}

	public void setC1(Circulo c1) 
	{
		this.c1 = c1;
	}

	public Cuadrado getC() 
	{
		return c;
	}

	public void setC(Cuadrado c) 
	{
		this.c = c;
	}

	public Rombo getR() 
	{
		return r;
	}

	public void setR(Rombo r) 
	{
		this.r = r;
	}
}