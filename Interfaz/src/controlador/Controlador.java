package controlador;

import modelo.Circulo;
import modelo.Cuadrado;
import vista.Interfaz;

public class Controlador 
{
	private Interfaz i;
	private Cuadrado c;
	private Circulo c1;
	
	public Controlador()
	{
		i = new Interfaz();
		c = new Cuadrado(i.ingresarLado());
		i.imprimirCuadrado(c.calcularArea(), c.calcularPerimetro());
		c1 = new Circulo(i.ingresarRadio());
		i.imprimirCirculo(c1.calcularArea(), c1.calcularPerimetro());
	}
}
