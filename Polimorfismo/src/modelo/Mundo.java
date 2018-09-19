package modelo;

public class Mundo 
{
	public Mundo()
	{
		hacerSobrecarga();
		hacerSobrecarga1(0);
		hacerSobrecarga2(0, 0);
	}

	public String hacerSobrecarga()
	{
		return "Sobrecarga solita";
	}

	public String hacerSobrecarga1(int argumento)
	{
		return "Sobrecarga "+ argumento +" un parametro tipo entero";
	}

	public String hacerSobrecarga2(int argumento, double argumento2)
	{
		return "Sobrecarga "+ argumento + " " + " " + argumento2 + " argumento entero y tipo double";
	}
}