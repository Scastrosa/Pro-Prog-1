package modelo;

public class Cuadrado implements Figura
{
	private double lado;
	private double area;
	private double perimetro;
	
	public Cuadrado(double pLado)
	{
		lado = pLado;
		area = calcularArea();
		perimetro = calcularPerimetro();
	}

	public double calcularArea() 
	{
		return lado * lado;
	}

	public double calcularPerimetro() 
	{
		return 4 * lado;
	}
	
	public double getLado() 
	{
		return lado;
	}

	public void setLado(double lado) 
	{
		this.lado = lado;
	}
}
