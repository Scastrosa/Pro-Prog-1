package modelo;

public class Circulo implements Figura
{
	private double radio;
	private double area1;
	private double perimetro1; 
	private static double PI;
	
	public Circulo(double pRadio)
	{
		radio = pRadio;
		PI = 3.1416;
		area1 = calcularArea();
		perimetro1 = calcularPerimetro();
	}

	public double calcularArea() 
	{ 
		return PI*radio*radio; 
	}
	public double calcularPerimetro() 
	{ 
		return 2*PI*radio; 
	}

	public double getRadio() 
	{
		return radio;
	}

	public void setRadio(double radio) 
	{
		this.radio = radio;
	}

	public static double getPI() 
	{
		return PI;
	}

	public static void setPI(double pI) 
	{
		PI = pI;
	}
}