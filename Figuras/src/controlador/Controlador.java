package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador 
{
	private Mundo bd;
	private Interfaz gui;
	
	public Controlador()
	{
		bd = new Mundo();
		gui = new Interfaz();
		bd.getC().setLado(Double.parseDouble(gui.ingresarLado()));
		bd.getC().calcularArea();
		bd.getC().calcularPerimetro();
		gui.imprimirCuadrado("Cuadrado", bd.getC().calcularArea(), bd.getC().calcularPerimetro());
		
		bd.getC1().setRadio(Double.parseDouble(gui.ingresarRadio()));
		bd.getC1().calcularArea();
		bd.getC1().calcularPerimetro();
		gui.imprimirCirculo(bd.getC1().calcularArea(), bd.getC1().calcularPerimetro());
		
		bd.getR().setLado(Double.parseDouble(gui.ingresarLado2()));
		bd.getR().setLado1(Double.parseDouble(gui.ingresarLado3()));
		bd.getR().calcularArea();
		bd.getR().calcularPerimetro();
		gui.imprimirRombo(bd.getR().calcularArea(), bd.getR().calcularPerimetro());
	}
}