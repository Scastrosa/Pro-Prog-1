package modelo;

public class Rombo implements Figura
{
	private double lado;
	private double lado1;
	private double area2;
	private double perimetro2;
	
	public Rombo(double pLado, double pLado1)
	{
		lado = pLado;
		lado1= pLado1;
		area2 = calcularArea();
		perimetro2 = calcularPerimetro();
	}

	public double calcularArea() 
	{
		return lado * lado1 /2;
	}

	public double calcularPerimetro() 
	{
		return 4 * lado * lado1;
	}

	public double getLado() 
	{
		return lado;
	}

	public void setLado(double lado) 
	{
		this.lado = lado;
	}

	public double getLado1() 
	{
		return lado1;
	}

	public void setLado1(double lado1) 
	{
		this.lado1 = lado1;
	}

	public double getArea2() 
	{
		return area2;
	}

	public void setArea2(double area2) 
	{
		this.area2 = area2;
	}

	public double getPerimetro2() 
	{
		return perimetro2;
	}

	public void setPerimetro2(double perimetro2)
	{
		this.perimetro2 = perimetro2;
	}
}