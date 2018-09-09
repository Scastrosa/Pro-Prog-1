package modelo;

public class Mundo 
{
	private int numero;
	private int resultado;
	
	public Mundo()
	{
		this.numero = 0;
		this.resultado = 0;
	}
	
	public void dividir( int divisor)
	{
		this.resultado = this.numero/ divisor;
		System.out.println("El resultado de la division es: " + this.resultado);
	}
}