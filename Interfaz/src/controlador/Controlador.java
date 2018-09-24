package controlador;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.Mundo;
import vista.Interfaz;

public class Controlador 
{
	private Interfaz i;
	private Mundo m;
	
	public Controlador()
	{
		i = new Interfaz();
		m = new Mundo();
		m.getC().setLado(i.ingresarLado());
		m.getC().calcularArea();
		m.getC().calcularPerimetro();
		i.imprimirCuadrado(m.getC().calcularArea(), m.getC().calcularPerimetro());
		
		m.getC1().setRadio(i.ingresarRadio());
		m.getC1().calcularArea();
		m.getC1().calcularPerimetro();
		i.imprimirCirculo(m.getC1().calcularArea(), m.getC1().calcularPerimetro());
	}
}